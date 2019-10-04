package Control;

import View.TelaJogo;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Guilherme Lague
 */
public class ThreadReceive extends Thread{
    ClientSocketTCP client_socket;
    TelaJogo tela_jogo;
    int line = 0, col = 0, turn, points_x = 0, points_o = 0;
    
    public ThreadReceive(ClientSocketTCP cs, TelaJogo tj){
        this.client_socket = cs;
        this.tela_jogo = tj;
    }
    
    @Override
    public void run(){
        try {
            //System.out.println("Thread receive rodando");
            DataInputStream in = new DataInputStream(client_socket.getSocket().getInputStream());
            
            String p1 = in.readUTF();
            String p2 = in.readUTF();
            
            //System.out.println("nomes dos players chegaram: "+ p1 + ", " + p2);
            tela_jogo.setPlayersName(p1, p2);
            //System.out.println("nomes enviados");
            
            String op = in.readUTF();
            
            tela_jogo.setOP(op);
            
            while(true){
                turn = Integer.parseInt(in.readUTF());
                
                if(turn == 1){ // se turn == 1, é a minha vez de jogar
                    //System.out.println("minha vez de jogar!");
                    //System.out.println("turn = "+turn);
                    // a posição é mandada pelo metodo setplay na classe ClientSocketTCP
                    tela_jogo.setMessageTurn("Sua vez!");
                    tela_jogo.setTurn(turn);
                }
                else if(turn == 0){ // se não, desabilita o botao em que o oponente clicar
                    //System.out.println("vez do outro!");
                    //System.out.println("turn = "+turn);
                    
                    tela_jogo.setMessageTurn("Espere sua vez...");
                    tela_jogo.setTurn(turn);
                    // recebe a posição
                    line = Integer.parseInt(in.readUTF());
                    col = Integer.parseInt(in.readUTF());
                    op = in.readUTF();
                    
                    //System.out.println("recebi a posição pra desabilitar aqui: ["+line+"]["+col+"]");
                    tela_jogo.disableTabuleiro(line, col, op);
                }
                else if(turn == 10 || turn == 11){ // se algum dos jogadores vencerem, a thread para de ler
                    if(turn == 10){
                        points_x = points_x + 1;
                        tela_jogo.setWinnerName(p1, points_x, points_o);
                        tela_jogo.saveData(p1, p2, points_x, points_o, "Vitória");
                        tela_jogo.restartGame();
                    }
                    else{
                        points_o = points_o + 1;
                        tela_jogo.setWinnerName(p2, points_x, points_o);
                        tela_jogo.saveData(p1, p2, points_x, points_o, "Vitória");
                        tela_jogo.restartGame();
                    }
                }
                else{
                    tela_jogo.setWinnerName("empate", points_x, points_o);
                    tela_jogo.saveData(p1, p2, points_x, points_o, "Empate");
                    tela_jogo.restartGame();
                }
            }
        }catch (IOException ex) {
            System.out.println("ERRO NA THREAD RECEIVE... "+ ex.getMessage());
        }
    }
}
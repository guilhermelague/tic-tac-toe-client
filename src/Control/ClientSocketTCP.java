package Control;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;
/**
 * @author Guilherme Lague
 * 
 */
public class ClientSocketTCP {
    public Socket cliente;
    
    /** 
     * Cria uma porta de comunicação socket
     * @param nomeJogador nome do jogador
     * @param IPServer IP do servidor a se conectar
     * @return boolean 
     */
    public boolean connect(String nomeJogador, String IPServer){
        try {
            cliente = new Socket(IPServer, 45000);
            
            DataOutputStream output = new DataOutputStream(cliente.getOutputStream());
            output.writeUTF(nomeJogador);
            
            return true;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o servidor!\n"+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }    
    }
    
    /** 
     * Retorna o socket de conexão
     * @return Socket
     */
    public Socket getSocket(){
        return cliente;
    }
    
    /**
     * Pega as cordenadas da jogada, o simbolo e envia ao servidor
     * @param line linha da matriz
     * @param col coluna da matriz
     */
    public void setPlay(int line, int col, String op){
        try {
            DataOutputStream output = new DataOutputStream(cliente.getOutputStream());
            output.writeUTF(String.valueOf(line));
            output.writeUTF(String.valueOf(col));
            output.writeUTF(op);
            
        } catch (IOException ex) {
            System.out.println("erro no metodo getPlay: "+ ex.getMessage());
        }
    }
}
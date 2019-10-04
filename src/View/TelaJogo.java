package View;

import Control.ClientSocketTCP;
import Control.ThreadReceive;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * @author Guilherme Lague
 */
public class TelaJogo extends javax.swing.JFrame {
    ClientSocketTCP client_socket;
    ImageIcon icon, icon2;
    String op, winner_name, username;
    int turn = 0;
    
    public TelaJogo(ClientSocketTCP client_socket) {
        initComponents();
        this.client_socket = client_socket;
        username = System.getProperty("user.name");
        createLocalData();
        ThreadReceive tr = new  ThreadReceive(client_socket, this);
        tr.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpTabuleiro = new javax.swing.JPanel();
        campo00 = new javax.swing.JButton();
        campo01 = new javax.swing.JButton();
        campo02 = new javax.swing.JButton();
        campo10 = new javax.swing.JButton();
        campo11 = new javax.swing.JButton();
        campo12 = new javax.swing.JButton();
        campo20 = new javax.swing.JButton();
        campo21 = new javax.swing.JButton();
        campo22 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlJogadorx = new javax.swing.JLabel();
        jlJogadoro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jl_points_x = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jl_points_o = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jlVencedor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jm_historico = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campo00.setFocusable(false);
        campo00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo00ActionPerformed(evt);
            }
        });

        campo01.setFocusable(false);
        campo01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo01ActionPerformed(evt);
            }
        });

        campo02.setFocusable(false);
        campo02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo02ActionPerformed(evt);
            }
        });

        campo10.setFocusable(false);
        campo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo10ActionPerformed(evt);
            }
        });

        campo11.setFocusable(false);
        campo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo11ActionPerformed(evt);
            }
        });

        campo12.setFocusable(false);
        campo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo12ActionPerformed(evt);
            }
        });

        campo20.setFocusable(false);
        campo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo20ActionPerformed(evt);
            }
        });

        campo21.setFocusable(false);
        campo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo21ActionPerformed(evt);
            }
        });

        campo22.setFocusable(false);
        campo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTabuleiroLayout = new javax.swing.GroupLayout(jpTabuleiro);
        jpTabuleiro.setLayout(jpTabuleiroLayout);
        jpTabuleiroLayout.setHorizontalGroup(
            jpTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabuleiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo00, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpTabuleiroLayout.createSequentialGroup()
                        .addComponent(campo21, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo22, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTabuleiroLayout.createSequentialGroup()
                        .addGroup(jpTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTabuleiroLayout.createSequentialGroup()
                                .addComponent(campo01, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo02, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpTabuleiroLayout.createSequentialGroup()
                                .addComponent(campo11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))))
        );
        jpTabuleiroLayout.setVerticalGroup(
            jpTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabuleiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo00, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo01, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo02, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campo12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campo10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo21, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo22, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTabuleiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Jogador");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Jogador");

        jlJogadorx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlJogadorx.setForeground(new java.awt.Color(51, 0, 204));
        jlJogadorx.setText("Aguardando...");

        jlJogadoro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlJogadoro.setForeground(new java.awt.Color(51, 0, 204));
        jlJogadoro.setText("Aguardando...");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("PLACAR:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("X");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("O");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText(":");

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("X");

        jl_points_x.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jl_points_x.setForeground(new java.awt.Color(51, 0, 204));
        jl_points_x.setText("0");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setText("-");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jl_points_x)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jl_points_x)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setText("O");

        jl_points_o.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jl_points_o.setForeground(new java.awt.Color(51, 0, 204));
        jl_points_o.setText("0");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel17.setText("-");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jl_points_o)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jl_points_o)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        jlVencedor.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jlVencedor.setForeground(new java.awt.Color(51, 0, 204));
        jlVencedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlVencedor.setText("...");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Status:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlVencedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlJogadoro)
                                    .addComponent(jlJogadorx)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlJogadorx)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlJogadoro)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(90, 90, 90)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu2.setText("Arquivo");
        jMenu2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jm_historico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jogo.png"))); // NOI18N
        jm_historico.setText("Historico de Partidas");
        jm_historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_historicoActionPerformed(evt);
            }
        });
        jMenu2.add(jm_historico);

        jmSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info.png"))); // NOI18N
        jmSobre.setText("Sobre");
        jmSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSobreActionPerformed(evt);
            }
        });
        jMenu2.add(jmSobre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Seta o nome dos jogadores na tela do jogo
     * @param player1 Nome do jogador "X"
     * @param player2 Nome do jogador "O"
     */
    public void setPlayersName(String player1, String player2){
        jlJogadorx.setText(player1);
        jlJogadoro.setText(player2);
    }
    
    /**
     * Seta o nome do vencedor ta tela do jogo
     * @param name Nome do vencedor
     * @param points_x Acrécimo nos pontos do vencedor X (+1)
     * @param points_o Acrécimo nos pontos do vencedor O (+1)
     */
    public void setWinnerName(String name, int points_x, int points_o){
        this.winner_name = name;
        
        if(name.equals("empate")){
            JOptionPane.showMessageDialog(this, "Empate!", "Fim da partida", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, name+" venceu!", "Fim da partida", JOptionPane.PLAIN_MESSAGE);
            jl_points_x.setText(String.valueOf(points_x));
            jl_points_o.setText(String.valueOf(points_o));
        }
    }
    
    /**
     * Este metodo retorna o nome do jogador vencedor da partida
     * @return this.winner_name o nome do jogador vencedor da partida
     */
    public String getWinnerName(){
        return this.winner_name;
    }
    
    /**
     * Este metodo cria uma pasta e um arquivo de dados caso não existam.
     */
    public void createLocalData(){
        File file;
        String caminho = "C:\\Users\\"+username+"\\Documents\\Jogo da velha\\arquivo.txt";
        
        try{
            Runtime.getRuntime().exec("cmd /c cd C:\\Users\\"+username+"\\Documents && mkdir \"Jogo da velha\"");
            file = new File(caminho);
            if(!file.exists()){
                file = new File(caminho);
            }
        }catch(IOException ex){
            System.out.println("erro: "+ex); 
        }
    }
    
    /**
     * Este metodo salva os dados da partida em um arquivo de texto
     * @param name1 nome do jogador X
     * @param name2 nome do jogador O
     * @param points_x pontos do jogador X
     * @param points_o pontos do jogador O
     * @param event evento do jogo: vitoria ou empate
     */
    public void saveData(String name1, String name2, int points_x, int points_o, String event){
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy - HH:mm");
        
        try{
            FileWriter file_writer = new FileWriter("C:\\Users\\"+username+"\\Documents\\Jogo da velha\\arquivo.txt", true);
            BufferedWriter buffWrite = new BufferedWriter(file_writer);
            
            if(event.equals("Empate")){
                buffWrite.append("\n"+event+" || "+name1+" | "+points_x+" X "+points_o+" | "+name2+" || " + format.format(date) + "|\n----------------------------------------------------------");
            }else{
                buffWrite.append("\n"+event+" de "+getWinnerName()+"|| "+name1+" | "+points_x+" X "+points_o+" | "+name2+" || " + format.format(date) + "|\n----------------------------------------------------------");
            }
            buffWrite.close();
        }catch (IOException ex){
            System.out.println("Erro: "+ex);
        }
    }
    
    /**
     * Seta o simbolo que o jogador vai usar
     * @param op Caracter correspondente ao simbolo
     */
    public void setOP(String op){
        this.op = op;
        if(op.equals("x")){
            icon = new ImageIcon(getClass().getResource("/Images/x.png"));
        }
        else{
            icon = new ImageIcon(getClass().getResource("/Images/o.png"));
        }
    }
    
    /**
     * Esta função recebe o turno da jogada
     * @param turn 1- habilita a jogada, 0- desabilita a jogada
     */
    public void setTurn(int turn){
        this.turn = turn;
    }
    
    /**
     * Esta função recebe a mensagem informando se o jogador pode eu não fazer uma jogada
     * @param message "Sua vez" ou "Espere sua vez..."
     */
    public void setMessageTurn(String message){
        jlVencedor.setText(message);
    }
    
    /**
     * Limpa o tabuleiro pra uma nova partida
     */
    public void restartGame(){
        campo00.setEnabled(true);
        campo00.setIcon(null);
        campo01.setEnabled(true);
        campo01.setIcon(null);
        campo02.setEnabled(true);
        campo02.setIcon(null);
        campo10.setEnabled(true);
        campo10.setIcon(null);
        campo11.setEnabled(true);
        campo11.setIcon(null);
        campo12.setEnabled(true);
        campo12.setIcon(null);
        campo20.setEnabled(true);
        campo20.setIcon(null);
        campo21.setEnabled(true);
        campo21.setIcon(null);
        campo22.setEnabled(true);
        campo22.setIcon(null);
    }
    
    /**
     * Desabilita o botao que ja foi clicado
     * @param line Linha da matriz
     * @param col Coluna da matriz
     * @param op Simbolo do jogador
     */
    public void disableTabuleiro(int line, int col, String op){
        if(op.equals("x")){
            icon2 = new ImageIcon(getClass().getResource("/Images/x.png"));
        }
        else{
            icon2 = new ImageIcon(getClass().getResource("/Images/o.png"));
        }
         
        if(line == 0 && col == 0){
            campo00.setEnabled(false);
            campo00.setIcon(icon2);
        }
        if(line == 0 && col == 1){
            campo01.setEnabled(false);
            campo01.setIcon(icon2);
        }
        if(line == 0 && col == 2){
            campo02.setEnabled(false);
            campo02.setIcon(icon2);
        }
        if(line == 1 && col == 0){
            campo10.setEnabled(false);
            campo10.setIcon(icon2);
        }
        if(line == 1 && col == 1){
            campo11.setEnabled(false);
            campo11.setIcon(icon2);
        }
        if(line == 1 && col == 2){
            campo12.setEnabled(false);
            campo12.setIcon(icon2);
        }
        if(line == 2 && col == 0){
            campo20.setEnabled(false);
            campo20.setIcon(icon2);
        }
        if(line == 2 && col == 1){
            campo21.setEnabled(false);
            campo21.setIcon(icon2);
        }
        if(line == 2 && col == 2){
            campo22.setEnabled(false);
            campo22.setIcon(icon2);
        }
    }
    
    /**
     * Esta função realiza ações para o botão o qual foi clicado
     * @param button Botão que foi clicado
     * @param line Linha onde se encontra o botão
     * @param col Coluna onde se encontra o botão
     */
    public void setAction(JButton button, int line, int col){
        if(turn == 1){
            client_socket.setPlay(line, col, op);
            button.setIcon(icon);
            button.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(this, "Espere sua vez de jogar!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void jmSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSobreActionPerformed
        Info info = new Info();
        info.setVisible(true);
        info.setLocationRelativeTo(this);
    }//GEN-LAST:event_jmSobreActionPerformed

    private void campo00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo00ActionPerformed
        setAction(campo00, 0, 0);
    }//GEN-LAST:event_campo00ActionPerformed

    private void campo01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo01ActionPerformed
        setAction(campo01, 0, 1);
    }//GEN-LAST:event_campo01ActionPerformed

    private void campo02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo02ActionPerformed
        setAction(campo02, 0, 2);
    }//GEN-LAST:event_campo02ActionPerformed

    private void campo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo10ActionPerformed
        setAction(campo10, 1, 0);
    }//GEN-LAST:event_campo10ActionPerformed

    private void campo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo11ActionPerformed
        setAction(campo11, 1, 1);
    }//GEN-LAST:event_campo11ActionPerformed

    private void campo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo12ActionPerformed
        setAction(campo12, 1, 2);
    }//GEN-LAST:event_campo12ActionPerformed

    private void campo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo20ActionPerformed
        setAction(campo20, 2, 0);
    }//GEN-LAST:event_campo20ActionPerformed

    private void campo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo21ActionPerformed
        setAction(campo21, 2, 1);
    }//GEN-LAST:event_campo21ActionPerformed

    private void campo22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo22ActionPerformed
        setAction(campo22, 2, 2);
    }//GEN-LAST:event_campo22ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int option = JOptionPane.showConfirmDialog(this, "Deseja realmente sair do jogo?", "Jogo da velha", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(option == JOptionPane.YES_OPTION){
            this.dispose();
        }
        else{
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jm_historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_historicoActionPerformed
        Historico hist = new Historico();
        hist.setLocationRelativeTo(this);
        hist.setVisible(true);
    }//GEN-LAST:event_jm_historicoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton campo00;
    private javax.swing.JButton campo01;
    private javax.swing.JButton campo02;
    private javax.swing.JButton campo10;
    private javax.swing.JButton campo11;
    private javax.swing.JButton campo12;
    private javax.swing.JButton campo20;
    private javax.swing.JButton campo21;
    private javax.swing.JButton campo22;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JLabel jlJogadoro;
    private javax.swing.JLabel jlJogadorx;
    private javax.swing.JLabel jlVencedor;
    private javax.swing.JLabel jl_points_o;
    private javax.swing.JLabel jl_points_x;
    private javax.swing.JMenuItem jmSobre;
    private javax.swing.JMenuItem jm_historico;
    private javax.swing.JPanel jpTabuleiro;
    // End of variables declaration//GEN-END:variables
}

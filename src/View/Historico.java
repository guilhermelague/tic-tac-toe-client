package View;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Guilherme Lague
 */
public class Historico extends javax.swing.JFrame {

    public Historico() {
        initComponents();
        readData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jta_dados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histórico de partidas");

        jta_dados.setColumns(20);
        jta_dados.setRows(5);
        jScrollPane1.setViewportView(jta_dados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void readData(){
        try {
            String username = System.getProperty("user.name");
            FileReader file_reader = new FileReader("C:\\Users\\"+username+"\\Documents\\Jogo da velha\\arquivo.txt");
            BufferedReader buffRead = new BufferedReader(file_reader);
            String linha;
            
            while(true){
                linha = buffRead.readLine();
                
                if(linha != null){
                    jta_dados.append(linha+"\n");
                }else{
                    break;
                }
            }
            buffRead.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: "+ex);
        } catch (IOException ex) {
            System.out.println("Erro: "+ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta_dados;
    // End of variables declaration//GEN-END:variables
}

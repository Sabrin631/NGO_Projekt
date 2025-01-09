/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.*;
import java.util.List;

/**
 *
 * @author aliciafermano
 */
public class Hållbarhetsmål extends javax.swing.JFrame {
    private InfDB idb;
    private String anvandareID;

    /**
     * Creates new form Hållbarhetsmål
     */
    public Hållbarhetsmål(InfDB idb, String anvandareID) {
        initComponents();
        this.idb = idb;
<<<<<<< HEAD
        this.anvandareID=anvandareID;
=======
        this.anvandareID = anvandareID;
>>>>>>> main
        
        laddaHållbarhetsmål();
    }
    
    private void laddaHållbarhetsmål(){
        try {
    
            String query = "SELECT namn From hallbarhetsmal";
            List<String> mål = idb.fetchColumn(query);
            
            if (mål !=null) {
                for (String målNamn:mål) {
                    textAreaHållbarhetsmål.append(målNamn + "\n");
                }
            } else {
                textAreaHållbarhetsmål.setText("Inga hallbarhetsmal hittades i databasen.");
            }
        } catch (InfException ex){
            JOptionPane.showMessageDialog(this, "Fel vid hämtning av hallbarhetsmalen: " + ex.getMessage());
        }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaHållbarhetsmål = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaHållbarhetsmål.setColumns(20);
        textAreaHållbarhetsmål.setRows(5);
        jScrollPane1.setViewportView(textAreaHållbarhetsmål);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 500, 330));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255), 5));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("                         Se alla Hållbarhetsmål");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 500, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hållbarhetsmål.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hållbarhetsmål.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hållbarhetsmål.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hållbarhetsmål.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Hållbarhetsmål().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaHållbarhetsmål;
    // End of variables declaration//GEN-END:variables
}

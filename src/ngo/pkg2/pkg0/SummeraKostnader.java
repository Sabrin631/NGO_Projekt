/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.*;
import java.util.List;

/**
 *
 * @author aliciafermano
 */
public class SummeraKostnader extends javax.swing.JFrame {
    private InfDB idb;
    private String anvandareID;

    /**
     * Creates new form SummeraKostnader
     */
    public SummeraKostnader(InfDB idb, String anvandareID) {
        initComponents();
        this.idb = idb;
        this.anvandareID=anvandareID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVisaStatistik = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTotalKostnad = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 6));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Statistik Över Projektkostnader");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 570, -1));

        btnVisaStatistik.setText("Visa Statistik");
        btnVisaStatistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaStatistikActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisaStatistik, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 160, 110));

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTillbaka, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 160, 100));

        txtTotalKostnad.setColumns(20);
        txtTotalKostnad.setRows(5);
        jScrollPane2.setViewportView(txtTotalKostnad);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 320, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private double hamtaTotalKostnadForAnvandare(String anvandareID) {
    double totalKostnad = 0;
    try {
        // SQL-fråga för att hämta summan av kostnader för alla projekt där användaren är projektchef
        String query = "SELECT SUM(kostnad) FROM projekt WHERE projektchef = '" + anvandareID + "'";

        // Hämta resultatet av frågan (summan av kostnaden)
        String resultat = idb.fetchSingle(query);

        if (resultat != null) {
            totalKostnad = Double.parseDouble(resultat);
        }
    } catch (InfException e) {
        JOptionPane.showMessageDialog(null, "Fel vid hämtning av kostnad: " + e.getMessage());
    }
    return totalKostnad;
}
    private void btnVisaStatistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaStatistikActionPerformed
        double totalKostnad = hamtaTotalKostnadForAnvandare(anvandareID);
        txtTotalKostnad.setText("Totalkostnad: " + totalKostnad);
    }//GEN-LAST:event_btnVisaStatistikActionPerformed
   
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        int svar = JOptionPane.showConfirmDialog(this, 
        "Är du säker på att du vill gå tillbaka till menyn?", 
        "Bekräfta", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
    
    if (svar == JOptionPane.YES_OPTION) {
        new infoOmProjekt(idb,anvandareID).setVisible(true);
        this.setVisible(false);
    }
    }//GEN-LAST:event_btnTillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(SummeraKostnader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SummeraKostnader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SummeraKostnader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SummeraKostnader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SummeraKostnader().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnVisaStatistik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtTotalKostnad;
    // End of variables declaration//GEN-END:variables
}

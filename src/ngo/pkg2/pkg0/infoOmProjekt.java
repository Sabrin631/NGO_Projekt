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
public class infoOmProjekt extends javax.swing.JFrame {
    private InfDB idb;
    private String anvandareID;

    /**
     * Creates new form infoOmProjekt
     */
    public infoOmProjekt(InfDB idb, String anvandareID) {
        this.idb = idb;
        this.anvandareID=anvandareID;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnÄndraProjekt = new javax.swing.JButton();
        btnÄndraPartners = new javax.swing.JButton();
        btnÄndraHandläggare = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSummeraKostnader = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnÄndraProjekt.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnÄndraProjekt.setText("Ändra Projekt");
        btnÄndraProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraProjektActionPerformed(evt);
            }
        });
        getContentPane().add(btnÄndraProjekt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 300, 120));

        btnÄndraPartners.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnÄndraPartners.setText("Ändra Partners");
        btnÄndraPartners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraPartnersActionPerformed(evt);
            }
        });
        getContentPane().add(btnÄndraPartners, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 260, 130));

        btnÄndraHandläggare.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnÄndraHandläggare.setText("Ändra Handläggare");
        btnÄndraHandläggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraHandläggareActionPerformed(evt);
            }
        });
        getContentPane().add(btnÄndraHandläggare, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 260, 130));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 6));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Information Om Projekt");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel2.setText("Välkommen");

        jLabel3.setText("ProjektChef - Meny");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jLabel1)))
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(10, 10, 10))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, -1, -1));

        btnSummeraKostnader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSummeraKostnader.setText("Summmera Kostnader");
        btnSummeraKostnader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummeraKostnaderActionPerformed(evt);
            }
        });
        getContentPane().add(btnSummeraKostnader, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 300, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÄndraPartnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraPartnersActionPerformed
      new ÄndraPartnersProjektChef (idb, anvandareID).setVisible (true);
      this.setVisible(false);
    }//GEN-LAST:event_btnÄndraPartnersActionPerformed

    private void btnÄndraProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraProjektActionPerformed
      new ÄndraProjektProjektChef (idb, anvandareID).setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnÄndraProjektActionPerformed

    private void btnÄndraHandläggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraHandläggareActionPerformed
      new ÄndraHandläggare (idb, anvandareID).setVisible (true);
      this.setVisible(false);

    }//GEN-LAST:event_btnÄndraHandläggareActionPerformed

    private void btnSummeraKostnaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummeraKostnaderActionPerformed
        new SummeraKostnader (idb, anvandareID).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSummeraKostnaderActionPerformed

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
            java.util.logging.Logger.getLogger(infoOmProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infoOmProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infoOmProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infoOmProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new infoOmProjekt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSummeraKostnader;
    private javax.swing.JButton btnÄndraHandläggare;
    private javax.swing.JButton btnÄndraPartners;
    private javax.swing.JButton btnÄndraProjekt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


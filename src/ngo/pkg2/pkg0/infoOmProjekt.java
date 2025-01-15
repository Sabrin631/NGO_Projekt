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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnÄndraProjekt = new javax.swing.JButton();
        btnSummeraKostnader = new javax.swing.JButton();
        btnÄndraHandläggare = new javax.swing.JButton();
        btnÄndraPartners = new javax.swing.JButton();
        lblHandläggarmeny = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 6));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel2.setText("Välkommen");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("ProjektChef - Meny");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 326, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(369, 369, 369))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(303, 303, 303))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 910, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));

        btnÄndraProjekt.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnÄndraProjekt.setText("Ändra Projekt");
        btnÄndraProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraProjektActionPerformed(evt);
            }
        });

        btnSummeraKostnader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSummeraKostnader.setText("Summmera Kostnader");
        btnSummeraKostnader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummeraKostnaderActionPerformed(evt);
            }
        });

        btnÄndraHandläggare.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnÄndraHandläggare.setText("Ändra Handläggare");
        btnÄndraHandläggare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraHandläggareActionPerformed(evt);
            }
        });

        btnÄndraPartners.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnÄndraPartners.setText("Ändra Partners");
        btnÄndraPartners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraPartnersActionPerformed(evt);
            }
        });

        lblHandläggarmeny.setText("HandläggarMeny");
        lblHandläggarmeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblHandläggarmenyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSummeraKostnader, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                        .addComponent(btnÄndraPartners, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnÄndraProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnÄndraHandläggare, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHandläggarmeny)
                .addGap(381, 381, 381))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnÄndraHandläggare, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnÄndraProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHandläggarmeny)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSummeraKostnader, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnÄndraPartners, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 900, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÄndraPartnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraPartnersActionPerformed
        new VäljProjekt(idb, anvandareID).setVisible (true);
        this.setVisible(false);
    }//GEN-LAST:event_btnÄndraPartnersActionPerformed

    private void btnÄndraHandläggareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraHandläggareActionPerformed
        new VäljProjektHandläggare (idb, anvandareID).setVisible (true);
        this.setVisible(false);
    }//GEN-LAST:event_btnÄndraHandläggareActionPerformed

    private void btnSummeraKostnaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummeraKostnaderActionPerformed
        new SummeraKostnader (idb, anvandareID).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSummeraKostnaderActionPerformed

    private void btnÄndraProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraProjektActionPerformed
        new ÄndraProjektProjektChef (idb, anvandareID).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnÄndraProjektActionPerformed

    private void lblHandläggarmenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblHandläggarmenyActionPerformed
         int svar = JOptionPane.showConfirmDialog(this, 
        "Är du säker på att du vill gå tillbaka till menyn?", 
        "Bekräfta", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
    
    if (svar == JOptionPane.YES_OPTION) {
       
        new HandläggarMeny(idb,anvandareID).setVisible(true);
        this.setVisible(false);
    }
    }//GEN-LAST:event_lblHandläggarmenyActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lblHandläggarmeny;
    // End of variables declaration//GEN-END:variables
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author sabri
 */
public class Inloggning extends javax.swing.JFrame {
    private InfDB idb;
    private String anvandareID;

    /**
     * Creates new form Inloggning
     */
    public Inloggning(InfDB idb,String anvandareID) {
        this.idb = idb;
        this.anvandareID = anvandareID;
        initComponents();
        lblFelmeddelande.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoggain = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();
        txtEpost = new javax.swing.JTextField();
        txtLösenord = new javax.swing.JTextField();
        btnLoggain = new javax.swing.JButton();
        lblFelmeddelande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLoggain.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLoggain.setForeground(new java.awt.Color(0, 102, 102));
        lblLoggain.setText("Logga in");

        lblEpost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEpost.setText("E-post");

        lblLösenord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLösenord.setText("Lösenord");

        txtEpost.setText("chen.wei@example.com");
        txtEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEpostActionPerformed(evt);
            }
        });

        txtLösenord.setText("passwordabc");
        txtLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLösenordActionPerformed(evt);
            }
        });

        btnLoggain.setBackground(new java.awt.Color(0, 102, 102));
        btnLoggain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoggain.setText("Logga in");
        btnLoggain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggainActionPerformed(evt);
            }
        });

        lblFelmeddelande.setForeground(new java.awt.Color(255, 0, 0));
        lblFelmeddelande.setText("Felaktig Epost eller Lösenord!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLösenord)
                            .addComponent(lblEpost)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLoggain, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(lblFelmeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLösenord, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEpost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lblLoggain, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lblEpost)
                        .addGap(18, 18, 18)
                        .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblLösenord)
                        .addGap(18, 18, 18)
                        .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(lblFelmeddelande))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblLoggain, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoggain, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggainActionPerformed
        String ePost = txtEpost.getText();
    String losen = txtLösenord.getText();

    try {
        String sqlFraga = "SELECT aid FROM anstalld WHERE epost = '" + ePost + "' AND losenord = '" + losen + "'";
        String aid = idb.fetchSingle(sqlFraga);

        if (aid != null) {
            // Spara användarens ID i variabeln anvandareID
            anvandareID = aid;
            // Kontrollera roll och navigera direkt till rätt meny
            anvandareID = aid;
            String sqlAdmin = "SELECT * FROM admin WHERE aid = '" + aid + "'";
            if (idb.fetchSingle(sqlAdmin) != null) {
                new AdminMeny(idb,anvandareID).setVisible(true);
            } else {
                String sqlHandlaggare = "SELECT * FROM handlaggare WHERE aid = '" + aid + "'";
                if (idb.fetchSingle(sqlHandlaggare) != null) {
                    new HandläggarMeny(idb,anvandareID).setVisible(true);
                } else {
                    new ProjektLedarMeny(idb,anvandareID).setVisible(true);
                }
            }
            this.setVisible(false);
        } else {
            lblFelmeddelande.setVisible(true); // Felaktigt e-post eller lösenord
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Fel vid inloggning: " + ex.getMessage());
    }

    }//GEN-LAST:event_btnLoggainActionPerformed

    private void txtLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLösenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLösenordActionPerformed

    private void txtEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEpostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEpostActionPerformed

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
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Inloggning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggain;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblFelmeddelande;
    private javax.swing.JLabel lblLoggain;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtLösenord;
    // End of variables declaration//GEN-END:variables
}

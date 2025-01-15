/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.*;
import java.util.List;

/**
 *
 * @author aliciafermano
 */
public class ÄndraPartnersProjektChef extends javax.swing.JFrame {
    private InfDB idb;
    private String anvandareID;
    private String projektId;

    /**
     * Creates new form ÄndraPartnersProjektChef
     */
    public ÄndraPartnersProjektChef(InfDB idb, String anvandareID, String projektId) {
        this.idb = idb;
        this.anvandareID=anvandareID;
        this.projektId = projektId;
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
        jLabel1 = new javax.swing.JLabel();
        btnLäggTill = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtStad = new javax.swing.JTextField();
        txtBranch = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtKontaktEpost = new javax.swing.JTextField();
        txtKontaktPerson = new javax.swing.JTextField();
        txtNamn = new javax.swing.JTextField();
        txtPid = new javax.swing.JTextField();
        lblExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 6));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Partners i mina Projekt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel1)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 6, -1, -1));

        btnLäggTill.setText("Lägg Till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });
        getContentPane().add(btnLäggTill, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, 230, 100));

        btnTaBort.setText("Ta Bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaBort, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 230, 100));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("namn");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 240, 90, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Stad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 597, 90, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Branch");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 547, 90, 30));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setText("Adress");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 490, 90, 30));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setText("Telefon");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 420, 90, 30));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setText("KontaktEpost");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 346, 110, 30));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setText("Kontaktperson");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 288, 110, 30));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setText("pid");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 192, 90, 30));

        txtStad.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtStad, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 600, 364, -1));

        txtBranch.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 552, 364, -1));

        txtAdress.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 493, 364, -1));

        txtTelefon.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 423, 364, -1));

        txtKontaktEpost.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtKontaktEpost, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 349, 364, -1));

        txtKontaktPerson.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtKontaktPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 291, 364, -1));

        txtNamn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtNamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 243, 364, -1));

        txtPid.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(txtPid, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 195, 364, -1));

        lblExit.setText("Exit");
        lblExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblExitActionPerformed(evt);
            }
        });
        getContentPane().add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, 230, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed
      try {
        String pid = txtPid.getText();
        String namn = txtNamn.getText();
        String kontaktPerson = txtKontaktPerson.getText();
        String kontaktEpost = txtKontaktEpost.getText();
        String telefon = txtTelefon.getText();
        String Adress = txtAdress.getText();
        String Branch = txtBranch.getText();
        String Stad = txtStad.getText();

        // Kontrollera om alla obligatoriska fält är ifyllda
        if (pid.isEmpty() || namn.isEmpty() || Adress.isEmpty() || telefon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fyll i alla obligatoriska fält!", "Fel", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lägg till partner i partner-tabellen
        String sql = "INSERT INTO partner (pid, namn, kontaktperson, kontaktepost, telefon, adress, branch, stad) " +
                     "VALUES ('" + pid + "', '" + namn + "', '" + kontaktPerson + "', '" + kontaktEpost + "', '" + telefon + "', '" +
                     Adress + "', '" + Branch + "', '" + Stad + "')";
        idb.insert(sql);

        // Lägg till partner i projekt_partner-tabellen med det specifika projektID
        String sqlProjektPartner = "INSERT INTO projekt_partner (pid, partner_pid) " +
                                   "VALUES ('" + projektId + "', '" + pid + "')";
        idb.insert(sqlProjektPartner);

        JOptionPane.showMessageDialog(this, "Ny Partner lades till!");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Fel vid tillägg av partner: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnLäggTillActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
       try {
        // Hämta ID från textfältet
        String pid = txtPid.getText();

        // Kontrollera att ID inte är tomt
        if (pid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vänligen ange ett giltigt pid.", "Fel", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Kontrollera om ID:t existerar i databasen
        String kontroll = "SELECT COUNT(*) FROM partner WHERE pid = '" + pid + "'";
        String resultat = idb.fetchSingle(kontroll);

        if (resultat == null || Integer.parseInt(resultat) == 0) {
            JOptionPane.showMessageDialog(this, "Ingen partner hittades med angivet pid.", "Fel", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Skapa SQL-fråga för att ta bort anställd
        String deleteQuery = "DELETE FROM partner WHERE pid = '" + pid + "'";
        System.out.println("SQL Query: " + deleteQuery); // Kontrollera frågan

        // Kör borttagningsfrågan
        idb.delete(deleteQuery);

        JOptionPane.showMessageDialog(this, "Partnern är borttagen från systemet!");

    } catch (Exception ex) {
        // Visa felmeddelande om något går fel
        JOptionPane.showMessageDialog(this, "Fel vid borttagning av Partner: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void lblExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblExitActionPerformed
        int svar = JOptionPane.showConfirmDialog(this, 
        "Är du säker på att du vill gå tillbaka till menyn?", 
        "Bekräfta", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
    
    if (svar == JOptionPane.YES_OPTION) {
        new infoOmProjekt(idb,anvandareID).setVisible(true);
        this.setVisible(false);
    }
    }//GEN-LAST:event_lblExitActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraPartnersProjektChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraPartnersProjektChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraPartnersProjektChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraPartnersProjektChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ÄndraPartnersProjektChef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lblExit;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtBranch;
    private javax.swing.JTextField txtKontaktEpost;
    private javax.swing.JTextField txtKontaktPerson;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtPid;
    private javax.swing.JTextField txtStad;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}

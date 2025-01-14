/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.*;
import java.util.List;

/**
 *
 * @author aliciafermano
 */
public class ÄndraHandläggare extends javax.swing.JFrame {
    private InfDB idb;
    private String anvandareID;

    /**
     * Creates new form ÄndraHandläggare
     */
    public ÄndraHandläggare(InfDB idb, String anvandareID) {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAvdelning = new javax.swing.JTextField();
        txtLosenord = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtaid = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        txtEpost = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtFornamn = new javax.swing.JTextField();
        txtEfternamn = new javax.swing.JTextField();
        btnLäggTill = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();
        lblExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 6));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Hantera Handläggare För Projekt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 6, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Lösenord");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 477, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Förnamn");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 228, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Efternamn");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 273, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Adress");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 311, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Epost");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 348, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Telefon");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 391, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Anställningsdatum");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 434, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Avdelning");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 520, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("aid");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 180, -1, -1));

        txtAvdelning.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtAvdelning, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 531, 258, -1));

        txtLosenord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtLosenord, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 487, 258, -1));

        txtTelefon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 399, 258, -1));

        txtaid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 181, 258, -1));

        txtDatum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 443, 258, -1));

        txtEpost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtEpost, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 355, 258, -1));

        txtAdress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 308, 258, -1));

        txtFornamn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtFornamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 229, 258, -1));

        txtEfternamn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtEfternamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 264, 258, -1));

        btnLäggTill.setText("Lägg Till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });
        getContentPane().add(btnLäggTill, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 166, 126));

        btnTaBort.setText("Ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaBort, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 175, 123));

        lblExit.setText("Exit");
        lblExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblExitActionPerformed(evt);
            }
        });
        getContentPane().add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 180, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Denna metod hämtar alla projekt-ID för projekt som den inloggade användaren är projektchef för.
    private List<String> hamtaProjektForAnvandare(String anvandareID) {
    List<String> projektList = new ArrayList<>();
    try {
        // SQL-fråga för att hämta alla projekt där den inloggade användaren är projektchef
        String query = "SELECT pid FROM projekt WHERE projektchef = '" + anvandareID + "'";
        
        // Hämta kolumnen med alla projekt-ID:n från resultatet
        List<String> resultat = idb.fetchColumn(query);

        // Om vi får resultat, lägg till varje pid i listan
        if (resultat != null) {
            projektList = resultat;
        }
    } catch (InfException e) {
        JOptionPane.showMessageDialog(null, "Fel vid hämtning av projekt: " + e.getMessage());
    }
    return projektList;
}
    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed

    String handlaggareID = txtaid.getText().trim();  // Hämtar handläggarens ID från textfältet
    String anvandareID = "användarens ID"; // ID för den inloggade användaren (projektansvarig)

    // Hämta alla projekt som den inloggade användaren är ansvarig för
    List<String> projektList = hamtaProjektForAnvandare(anvandareID);

    if (projektList.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Du är inte ansvarig för något projekt.");
        return;
    }

    // Iterera över projekten och lägg till handläggaren till varje projekt
    for (String pid : projektList) {
        try {
            // Kontrollera om handläggaren redan är kopplad till projektet
            String kontrollHandlaggare = "SELECT COUNT(*) FROM anst_proj WHERE projekt_id = '" + pid + "' AND handlaggare_id = '" + handlaggareID + "'";
            String handlaggareResult = idb.fetchSingle(kontrollHandlaggare);

            if (Integer.parseInt(handlaggareResult) == 0) {
                // Handläggaren är inte kopplad till projektet, lägg till handläggaren
                String query = "INSERT INTO anst_proj (projekt_id, handlaggare_id) VALUES ('" + pid + "', '" + handlaggareID + "')";
                idb.insert(query);
                JOptionPane.showMessageDialog(null, "Handläggare tillagd till projektet med ID: " + pid);
            } else {
                JOptionPane.showMessageDialog(null, "Handläggaren är redan kopplad till projektet med ID: " + pid);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel uppstod vid tillägg: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnLäggTillActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed

    String handlaggareID = txtaid.getText().trim();  // Hämtar handläggarens ID från textfältet
    String anvandareID = "användarens ID"; // ID för den inloggade användaren (projektansvarig)

    // Hämta alla projekt som den inloggade användaren är ansvarig för
    List<String> projektList = hamtaProjektForAnvandare(anvandareID);

    if (projektList.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Du är inte ansvarig för något projekt.");
        return;
    }

    // Iterera över projekten och ta bort handläggaren från varje projekt
    for (String pid : projektList) {
        try {
            // Kontrollera om handläggaren är kopplad till projektet
            String kontrollHandlaggare = "SELECT COUNT(*) FROM anst_proj WHERE projekt_id = '" + pid + "' AND handlaggare_id = '" + handlaggareID + "'";
            String handlaggareResult = idb.fetchSingle(kontrollHandlaggare);

            if (Integer.parseInt(handlaggareResult) > 0) {
                // Handläggaren är kopplad till projektet, ta bort handläggaren
                String deleteQuery = "DELETE FROM anst_proj WHERE projekt_id = '" + pid + "' AND handlaggare_id = '" + handlaggareID + "'";
                idb.delete(deleteQuery);
                JOptionPane.showMessageDialog(null, "Handläggare borttagen från projektet med ID: " + pid);
            } else {
                JOptionPane.showMessageDialog(null, "Handläggaren är inte kopplad till projektet med ID: " + pid);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel uppstod vid borttagning: " + e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(ÄndraHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ÄndraHandläggare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lblExit;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtAvdelning;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtFornamn;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtaid;
    // End of variables declaration//GEN-END:variables
}

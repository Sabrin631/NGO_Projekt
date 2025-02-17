/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import java.util.HashMap;
import java.util.List;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 *
 * @author aliciafermano
 */
public class MinaUppgifter extends javax.swing.JFrame {
    private InfDB idb;
    private String anvandareID;
    private Validering validering;

    /**
     * Creates new form MinaUppgifter
     */
    public MinaUppgifter(InfDB idb, String anvandareID) {
        this.idb = idb;
        this.anvandareID = anvandareID;
        validering = new Validering(idb);
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

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblaid = new javax.swing.JLabel();
        lblEfternamn = new javax.swing.JLabel();
        lblFornamn = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblAdress = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();
        lblAvdelning = new javax.swing.JLabel();
        txtAvdelning = new javax.swing.JTextField();
        txtLösenord = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtEpost = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtaid = new javax.swing.JTextField();
        txtFornamn = new javax.swing.JTextField();
        txtEfternamn = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        brnÄndraUppgifter = new javax.swing.JButton();
        btnHämta = new javax.swing.JButton();
        lblExit = new javax.swing.JButton();

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setText("Ändra mina Uppgifter");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 8));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel11.setText("Ändra mina uppgiffter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(211, 211, 211))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 6));

        lblaid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblaid.setText("aid");

        lblEfternamn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEfternamn.setText("Efternamn");

        lblFornamn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFornamn.setText("Förnamn");

        lblEpost.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEpost.setText("Epost");

        lblAdress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAdress.setText("Adress");

        lblDatum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDatum.setText("Anställningsdatum");

        lblTelefon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTelefon.setText("Telefon");

        lblLösenord.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLösenord.setText("Lösenord");

        lblAvdelning.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAvdelning.setText("Avdelning");

        txtAvdelning.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvdelningActionPerformed(evt);
            }
        });

        txtLösenord.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtTelefon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtEpost.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtAdress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtaid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtFornamn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtEfternamn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtDatum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        brnÄndraUppgifter.setText("Ändra mina uppgiffter");
        brnÄndraUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnÄndraUppgifterActionPerformed(evt);
            }
        });

        btnHämta.setText("Hämta mina upgifter");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        lblExit.setText("Exit");
        lblExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblaid)
                        .addGap(249, 249, 249)
                        .addComponent(txtaid, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblEfternamn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblFornamn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblAdress)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblEpost)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblTelefon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblDatum)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblLösenord)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblAvdelning)
                            .addGap(189, 189, 189)
                            .addComponent(txtAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brnÄndraUppgifter, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(btnHämta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHämta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblaid)
                            .addComponent(txtaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFornamn)
                            .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(lblEfternamn)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblAdress)
                                .addGap(18, 18, 18)
                                .addComponent(lblEpost)
                                .addGap(18, 18, 18)
                                .addComponent(lblTelefon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(lblDatum)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblLösenord)
                                .addGap(18, 18, 18)
                                .addComponent(lblAvdelning))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(brnÄndraUppgifter, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 960, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvdelningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvdelningActionPerformed

    private void brnÄndraUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnÄndraUppgifterActionPerformed
        // TODO add your handling code here:
        try {
        // Hämta de nya värdena från textfälten
        String nyttFornamn = txtFornamn.getText().trim();
        String nyttEfternamn = txtEfternamn.getText().trim();
        String nyEpost = txtEpost.getText().trim();
        String nyTelefon = txtTelefon.getText().trim();

        

        // SQL-fråga för att uppdatera användarens uppgifter i databasen
        String sql = "UPDATE anstalld SET " +
                     "fornamn = '" + nyttFornamn + "', " +
                     "efternamn = '" + nyttEfternamn + "', " +
                     "epost = '" + nyEpost + "', " +
                     "telefon = '" + nyTelefon + "' " +
                     "WHERE aid = '" + anvandareID + "'";
        if(nyttFornamn.isEmpty() || nyttEfternamn.isEmpty()){
            
        }
        // validera Epost
        if(!validering.arRattEpost(nyEpost)){
            return;    
        }
        
        // validera Telefonnummer
        if(!validering.arRattTelefonnummer(nyTelefon)){
            return;
        }

        // Kör SQL-frågan
        idb.update(sql);

        // Bekräftelse till användaren
        JOptionPane.showMessageDialog(this, "Dina uppgifter har uppdaterats!");

    } catch (InfException ex) {
        // Fånga och visa eventuella fel
        JOptionPane.showMessageDialog(this, "Ett fel uppstod vid uppdatering av uppgifterna: " + ex.getMessage());
    }
    }//GEN-LAST:event_brnÄndraUppgifterActionPerformed

    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        // TODO add your handling code here:
        try {
        // SQL-fråga för att hämta användarens uppgifter baserat på anvandareID
        String sql = "SELECT * FROM anstalld WHERE aid = '" + anvandareID + "'";

        // Hämta resultatet från databasen
        List<HashMap<String, String>> result = idb.fetchRows(sql);

        if (result != null && !result.isEmpty()) {
            // Hämtar användarens uppgifter från resultatet
            HashMap<String, String> user = result.get(0);
            
            // Fyller textfälten med uppgifterna
            txtaid.setText(user.get("aid"));
            txtFornamn.setText(user.get("fornamn"));
            txtEfternamn.setText(user.get("efternamn"));
            txtAdress.setText(user.get("adress"));
            txtEpost.setText(user.get("epost"));
            txtTelefon.setText(user.get("telefon"));
            txtDatum.setText(user.get("anstallningsdatum"));
            txtLösenord.setText(user.get("losenord"));
            txtAvdelning.setText(user.get("avdelning"));
        } else {
            JOptionPane.showMessageDialog(this, "Inga uppgifter hittades för den inloggade användaren.");
        }
    } catch (InfException ex) {
        JOptionPane.showMessageDialog(this, "Ett fel uppstod vid hämtning av uppgifter: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnHämtaActionPerformed

    private void lblExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblExitActionPerformed
        int svar = JOptionPane.showConfirmDialog(this, 
        "Är du säker på att du vill gå tillbaka till menyn?", 
        "Bekräfta", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE);
    
    if (svar == JOptionPane.YES_OPTION) {
       
        new HandläggarMeny(idb,anvandareID).setVisible(true);
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
            java.util.logging.Logger.getLogger(MinaUppgifter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinaUppgifter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinaUppgifter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinaUppgifter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MinaUppgifter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnÄndraUppgifter;
    private javax.swing.JButton btnHämta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblAvdelning;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblEfternamn;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JButton lblExit;
    private javax.swing.JLabel lblFornamn;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblaid;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtAvdelning;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtFornamn;
    private javax.swing.JTextField txtLösenord;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtaid;
    // End of variables declaration//GEN-END:variables
}

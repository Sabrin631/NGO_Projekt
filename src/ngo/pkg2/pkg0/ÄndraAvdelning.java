/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author sabri
 */
public class ÄndraAvdelning extends javax.swing.JFrame {
    private InfDB idb;

    /**
     * Creates new form ÄndaAvdelning
     */
    public ÄndraAvdelning(InfDB idb) {
        this.idb =idb;
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
        jPanel3 = new javax.swing.JPanel();
        btnÄndra = new javax.swing.JButton();
        btnLäggTill = new javax.swing.JButton();
        btnÅterställ = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblNamn = new javax.swing.JLabel();
        txtavdID = new javax.swing.JTextField();
        lblavdid = new javax.swing.JLabel();
        lblBeskrivning = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblAdress = new javax.swing.JLabel();
        lblStad = new javax.swing.JLabel();
        lblChef = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        txtEpost = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtBeskrivning = new javax.swing.JTextField();
        txtNamn = new javax.swing.JTextField();
        txtChef = new javax.swing.JTextField();
        txtStad = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblTitel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        btnÄndra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnÄndra.setForeground(new java.awt.Color(0, 102, 102));
        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        btnLäggTill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLäggTill.setForeground(new java.awt.Color(0, 102, 102));
        btnLäggTill.setText("Lägg Till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });

        btnÅterställ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnÅterställ.setForeground(new java.awt.Color(0, 102, 102));
        btnÅterställ.setText("Återställ");
        btnÅterställ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÅterställActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 102, 102));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLäggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnÄndra, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnÅterställ, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLäggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnÄndra, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnÅterställ, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, 490));

        lblNamn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNamn.setText("Namn");
        jPanel1.add(lblNamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtavdID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(txtavdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 391, -1));

        lblavdid.setBackground(new java.awt.Color(255, 255, 255));
        lblavdid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblavdid.setText("AVD-ID");
        jPanel1.add(lblavdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        lblBeskrivning.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBeskrivning.setText("Beskrivning");
        jPanel1.add(lblBeskrivning, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        lblEpost.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEpost.setText("Epost");
        jPanel1.add(lblEpost, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        lblAdress.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAdress.setText("Adress");
        jPanel1.add(lblAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        lblStad.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblStad.setText("Stad");
        jPanel1.add(lblStad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        lblChef.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblChef.setText("Chef");
        jPanel1.add(lblChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        lblTelefon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTelefon.setText("Telefon");
        jPanel1.add(lblTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        txtEpost.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(txtEpost, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 391, -1));

        txtAdress.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(txtAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 391, -1));

        txtBeskrivning.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(txtBeskrivning, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 391, -1));

        txtNamn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(txtNamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 391, -1));

        txtChef.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(txtChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 391, -1));

        txtStad.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(txtStad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 391, -1));

        txtTelefon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(txtTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 391, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        lblTitel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitel.setText("Information om Avdelning");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitel)
                .addGap(235, 235, 235))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitel)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed
       try{
        String AVDID = txtavdID.getText();
        String Namn = txtNamn.getText();
        String Beskrivning = txtBeskrivning.getText();
        String Adress = txtAdress.getText();
        String Epost = txtEpost.getText();
        String Telefon = txtTelefon.getText();
        String Stad = txtStad.getText();
        String Chef = txtChef.getText();
        
        String Kontroll = "SELECT COUNT(*) FROM avdelning WHERE avdid = '" + AVDID + "'";
        String result = idb.fetchSingle(Kontroll);
        
        if (result != null && Integer.parseInt(result) > 0) {
               JOptionPane.showMessageDialog(this, "AVDID existerar redan i databasen!", "Fel", JOptionPane.ERROR_MESSAGE);
           return;
                  }
       
        if (Namn.isEmpty() || Beskrivning.isEmpty() || Epost.isEmpty() || Adress.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fyll i alla obligatoriska fält!", "Fel", JOptionPane.ERROR_MESSAGE);
            return;
               }
         String sql;
                sql = "INSERT INTO avdelning (avdid, namn, beskrivning, adress, epost, telefon, stad, chef) " +
                      "VALUES ('" + AVDID + "', '" + Namn + "', '" + Beskrivning + "', '" + Adress + "', '" + Epost + "', '" 
                       + Telefon + "', '" + Stad + "', '" + Chef + "')";
         
         
            idb.insert(sql);
             JOptionPane.showMessageDialog(this, "Ny Avdelning lades till!");
        }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Fel vid tillägg av Avdelning: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLäggTillActionPerformed

    private void btnÅterställActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÅterställActionPerformed
        txtavdID.setText("");
        txtNamn.setText("");
        txtBeskrivning.setText("");
        txtAdress.setText("");
        txtEpost.setText("");
        txtTelefon.setText("");
        txtStad.setText("");
        txtChef.setText("");
    }//GEN-LAST:event_btnÅterställActionPerformed
    private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frame = new JFrame ("Exit");
         if(JOptionPane.showConfirmDialog(frame,"Bekräfta om du vill avsluta","Information om anställda",
                 JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
         {
             System.exit(0);
         }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        // TODO add your handling code here:
        try {
        // Hämta värden från textfälten
        String AVDID = txtavdID.getText();
        String Namn = txtNamn.getText();
        String Beskrivning = txtBeskrivning.getText();
        String Adress = txtAdress.getText();
        String Epost = txtEpost.getText();
        String Telefon = txtTelefon.getText();
        String Stad = txtStad.getText();
        String Chef = txtChef.getText();

        // Kontrollera att alla obligatoriska fält är ifyllda
        if (AVDID.isEmpty() || Namn.isEmpty() || Beskrivning.isEmpty() || Adress.isEmpty() || 
            Epost.isEmpty() || Telefon.isEmpty() || Stad.isEmpty() || Chef.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fyll i alla fält!", "Fel", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kontrollera om AVDID finns i databasen
        String Kontroll = "SELECT COUNT(*) FROM avdelning WHERE avdid = '" + AVDID + "'";
        String result = idb.fetchSingle(Kontroll);

        if (result == null || Integer.parseInt(result) == 0) {
            JOptionPane.showMessageDialog(this, "Ingen avdelning hittades med angivet AVDID.", "Fel", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Skapa uppdateringsfråga
        String sql = "UPDATE avdelning SET " +
                     "namn = '" + Namn + "', " +
                     "beskrivning = '" + Beskrivning + "', " +
                     "adress = '" + Adress + "', " +
                     "epost = '" + Epost + "', " +
                     "telefon = '" + Telefon + "', " +
                     "stad = '" + Stad + "', " +
                     "chef = '" + Chef + "' " +
                     "WHERE avdid = '" + AVDID + "'";

        // Kör uppdateringsfrågan
        idb.update(sql);

        JOptionPane.showMessageDialog(this, "Avdelningens information har uppdaterats!");

    } catch (Exception ex) {
        // Visa felmeddelande om något går fel
        JOptionPane.showMessageDialog(this, "Fel vid uppdatering av avdelning: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnÄndraActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ÄndraAvdelning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JButton btnÅterställ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblBeskrivning;
    private javax.swing.JLabel lblChef;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblStad;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JLabel lblavdid;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtBeskrivning;
    private javax.swing.JTextField txtChef;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtStad;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtavdID;
    // End of variables declaration//GEN-END:variables
}

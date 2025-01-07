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
public class ÄndraLänder extends javax.swing.JFrame {
    private InfDB idb;
    private JFrame frame;

    /**
     * Creates new form ÄndraLänder
     */
    public ÄndraLänder(InfDB idb) {
        initComponents();
        this.idb = idb;
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
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNamn = new javax.swing.JLabel();
        lblLid = new javax.swing.JLabel();
        lblTidszon = new javax.swing.JLabel();
        lblValuta = new javax.swing.JLabel();
        lblSpråk = new javax.swing.JLabel();
        lblPolitiskStruktur = new javax.swing.JLabel();
        lblEkonomi = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtLid = new javax.swing.JTextField();
        txtEkonomi = new javax.swing.JTextField();
        txtPolitiskStruktur = new javax.swing.JTextField();
        txtTidszon = new javax.swing.JTextField();
        txtValuta = new javax.swing.JTextField();
        txtSprak = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnÄterställ = new javax.swing.JButton();
        btnÄndra = new javax.swing.JButton();
        btnLäggTill = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 8));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setText("Information om Länder ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1012, 120));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 8));

        lblNamn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNamn.setText("Namn");

        lblLid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLid.setText("Lid");

        lblTidszon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTidszon.setText("Tidszon");

        lblValuta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValuta.setText("Valuta");

        lblSpråk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSpråk.setText("Språk");

        lblPolitiskStruktur.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPolitiskStruktur.setText("Politisk-Struktur");

        lblEkonomi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEkonomi.setText("Ekonomi");

        txtNamn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtLid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtEkonomi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtEkonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEkonomiActionPerformed(evt);
            }
        });

        txtPolitiskStruktur.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtTidszon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtValuta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtSprak.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 8));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 102, 102));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnÄterställ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnÄterställ.setForeground(new java.awt.Color(0, 102, 102));
        btnÄterställ.setText("Återställ");
        btnÄterställ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄterställActionPerformed(evt);
            }
        });

        btnÄndra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnÄndra.setForeground(new java.awt.Color(0, 102, 102));
        btnÄndra.setText("Ändra");

        btnLäggTill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLäggTill.setForeground(new java.awt.Color(0, 102, 102));
        btnLäggTill.setText("Lägg Till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });

        btnTaBort.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTaBort.setForeground(new java.awt.Color(0, 102, 102));
        btnTaBort.setText("Ta Bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLäggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnÄndra, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnÄterställ, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLäggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnÄndra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnÄterställ, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLid)
                    .addComponent(lblEkonomi)
                    .addComponent(lblPolitiskStruktur)
                    .addComponent(lblTidszon)
                    .addComponent(lblValuta)
                    .addComponent(lblSpråk)
                    .addComponent(lblNamn))
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSprak, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValuta, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTidszon, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPolitiskStruktur, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLid, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLid)
                            .addComponent(txtLid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamn)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSpråk)
                            .addComponent(txtSprak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtValuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValuta))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTidszon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTidszon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPolitiskStruktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPolitiskStruktur))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEkonomi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEkonomi, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(17, 17, 17))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, 1010, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEkonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEkonomiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEkonomiActionPerformed

    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed
        // TODO add your handling code here:
        try{
        String Lid = txtLid.getText();
        String Namn = txtNamn.getText();
        String Språk = txtSprak.getText();
        String Valuta = txtValuta.getText();
        String Tidzon = txtTidszon.getText();
        String PolitiskStruktur = txtPolitiskStruktur.getText();
        String Ekonomi = txtEkonomi.getText();
        
        String checkQuery = "SELECT COUNT(*) FROM land WHERE lid = '" + Lid + "'";
        String result = idb.fetchSingle(checkQuery);
        
        if (result != null && Integer.parseInt(result) > 0) {
               JOptionPane.showMessageDialog(this, "Lid existerar redan i databasen!", "Fel", JOptionPane.ERROR_MESSAGE);
           return;
                  }
       
        if (Lid.isEmpty() || Namn.isEmpty() || Språk.isEmpty() || Valuta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fyll i alla obligatoriska fält!", "Fel", JOptionPane.ERROR_MESSAGE);
            return;
               }
         String sql;
                sql = "INSERT INTO land (lid, namn, sprak, valuta, tidszon, politisk_struktur, ekonomi) " +
      "VALUES ('" + Lid + "', '" + Namn + "', '" + Språk  + "', '" + Valuta + "', '" + Tidzon + "', '" 
      + PolitiskStruktur + "', '" + Ekonomi + "')";
         
         
            idb.insert(sql);
             JOptionPane.showMessageDialog(this, "Nytt Land lades till!");
        }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Fel vid tillägg av Land: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnLäggTillActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        // TODO add your handling code here:
        try {
        // Hämta ID från textfältet
        String Lid = txtLid.getText();

        // Kontrollera att ID inte är tomt
        if (Lid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vänligen ange ett giltigt Lid.", "Fel", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Kontrollera om ID:t existerar i databasen
        String Kontroll = "SELECT COUNT(*) FROM land WHERE lid = '" + Lid + "'";
        String result = idb.fetchSingle(Kontroll);

        if (result == null || Integer.parseInt(result) == 0) {
            JOptionPane.showMessageDialog(this, "Ingen Land hittades med angivet Lid.", "Fel", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Skapa SQL-fråga för att ta bort anställd
        String deleteQuery = "DELETE FROM land WHERE lid = '" + Lid + "'";
        System.out.println("SQL Query: " + deleteQuery); // Kontrollera frågan

        // Kör borttagningsfrågan
        idb.delete(deleteQuery);

        JOptionPane.showMessageDialog(this, "Landet är borttagen från systemet!");

    } catch (Exception ex) {
        // Visa felmeddelande om något går fel
        JOptionPane.showMessageDialog(this, "Fel vid borttagning av Land: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void btnÄterställActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄterställActionPerformed
        // TODO add your handling code here:
        txtLid.setText("");
        txtNamn.setText("");
        txtSprak.setText("");
        txtValuta.setText("");
        txtTidszon.setText("");
        txtPolitiskStruktur.setText("");
        txtEkonomi.setText("");
        
    }//GEN-LAST:event_btnÄterställActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        frame = new JFrame ("Exit");
         if(JOptionPane.showConfirmDialog(frame,"Bekräfta om du vill avsluta","Information om anställda",
                 JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
         {
             System.exit(0);
         }
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraLänder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraLänder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraLänder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraLänder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ÄndraLänder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JButton btnÄterställ;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEkonomi;
    private javax.swing.JLabel lblLid;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPolitiskStruktur;
    private javax.swing.JLabel lblSpråk;
    private javax.swing.JLabel lblTidszon;
    private javax.swing.JLabel lblValuta;
    private javax.swing.JTextField txtEkonomi;
    private javax.swing.JTextField txtLid;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtPolitiskStruktur;
    private javax.swing.JTextField txtSprak;
    private javax.swing.JTextField txtTidszon;
    private javax.swing.JTextField txtValuta;
    // End of variables declaration//GEN-END:variables
}

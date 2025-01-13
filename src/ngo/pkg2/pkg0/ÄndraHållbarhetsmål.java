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
public class ÄndraHållbarhetsmål extends javax.swing.JFrame {
    private InfDB idb;
    
    /**
     * Creates new form ÄndraHållbarhetsmål
     */
    public ÄndraHållbarhetsmål(InfDB idb) {
        this.idb = idb;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrioritet = new javax.swing.JTextField();
        txtBeskrivning = new javax.swing.JTextField();
        txtMålNummer = new javax.swing.JTextField();
        txtNamn = new javax.swing.JTextField();
        txtHid = new javax.swing.JTextField();
        btnLäggTill = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();
        btnÄndra = new javax.swing.JButton();
        btnÅterställ = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 8));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Information om Hållbarhetsmål");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Hid");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 189, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("MålNummer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 332, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Namn");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 263, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Beskrivning");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 405, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Prioritet");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 469, -1, -1));

        txtPrioritet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtPrioritet, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 466, 332, -1));

        txtBeskrivning.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtBeskrivning, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 402, 332, -1));

        txtMålNummer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtMålNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 329, 332, -1));

        txtNamn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtNamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 260, 332, -1));

        txtHid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtHid, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 186, 332, -1));

        btnLäggTill.setText("Lägg Till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });
        getContentPane().add(btnLäggTill, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 120, 60));

        btnTaBort.setText("Ta Bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaBort, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 120, 60));

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });
        getContentPane().add(btnÄndra, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 120, 60));

        btnÅterställ.setText("Återställ");
        btnÅterställ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÅterställActionPerformed(evt);
            }
        });
        getContentPane().add(btnÅterställ, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 120, 60));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 120, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed

        try {
    // Hämta värden från textfälten
    String hid = txtHid.getText();
    String namn = txtNamn.getText();
    String målNummer = txtMålNummer.getText();
    String beskrivning = txtBeskrivning.getText();
    String prioritet = txtPrioritet.getText();

    // Kontrollera att ID inte är tomt
    if (hid.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vänligen ange ett giltigt ID för att uppdatera.", "Fel", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Kontrollera om ID:t existerar i databasen
    String kontrollQuery = "SELECT COUNT(*) FROM hallbarhetsmal WHERE hid = '" + hid + "'";
    String result = idb.fetchSingle(kontrollQuery);

    if (result == null || Integer.parseInt(result) == 0) {
        JOptionPane.showMessageDialog(this, "Inget hållbarhetsmål hittades med angivet ID.", "Fel", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Skapa SQL-fråga för att uppdatera hållbarhetsmålets information
    String updateQuery = "UPDATE hallbarhetsmal SET "
            + "namn = '" + namn + "', "
            + "malnummer = '" + målNummer + "', "
            + "beskrivning = '" + beskrivning + "', "
            + "prioritet = '" + prioritet + "' "
            + "WHERE hid = '" + hid + "'";

    // Kör uppdateringsfrågan
    idb.update(updateQuery);

    JOptionPane.showMessageDialog(this, "Hållbarhetsmålets information har uppdaterats!");

} catch (Exception ex) {
    // Visa felmeddelande om något går fel
    JOptionPane.showMessageDialog(this, "Fel vid uppdatering av hållbarhetsmål: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_btnÄndraActionPerformed

    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed

        try{
            // Hämta det som står på text fälten
            String hid = txtHid.getText();
            String namn = txtNamn.getText();
            String målNummer = txtMålNummer.getText();
            String beskrivning = txtBeskrivning.getText();
            String prioritet = txtPrioritet.getText();
            
            if (hid.isEmpty() || namn.isEmpty() || målNummer.isEmpty() || beskrivning.isEmpty() || prioritet.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fyll i alla obligatoriska fält!", "Fel", JOptionPane.ERROR_MESSAGE);
            return;
               }
            String sql = "INSERT INTO hallbarhetsmal (hid, Namn, Malnummer, Beskrivning, Prioritet) " +
                     "VALUES ('" + hid + "', '" + namn + "', '" + målNummer + "', '" + beskrivning + "', '" + prioritet + "')";

        // Lägg till posten i databasen
        idb.insert(sql);

        // Visa framgångsmeddelande
        JOptionPane.showMessageDialog(this, "Nytt hållbarhetsmål har lagts till!");
    } catch (Exception ex) {
        // Visa felmeddelande om något går fel
        JOptionPane.showMessageDialog(this, "Fel vid tillägg av hållbarhetsmål: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnLäggTillActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        try {
    // Hämta ID från textfältet
    String hid = txtHid.getText();

    // Kontrollera att ID inte är tomt
    if (hid.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vänligen ange ett giltigt hållbarhetsmål-ID.", "Fel", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Kontrollera om hållbarhetsmålet existerar i databasen
    String kontrollQuery = "SELECT COUNT(*) FROM hallbarhetsmal WHERE hid = '" + hid + "'";
    String result = idb.fetchSingle(kontrollQuery);

    if (result == null || Integer.parseInt(result) == 0) {
        JOptionPane.showMessageDialog(this, "Inget hållbarhetsmål hittades med angivet ID.", "Fel", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Skapa SQL-fråga för att ta bort hållbarhetsmålet
    String deleteQuery = "DELETE FROM hallbarhetsmal WHERE hid = '" + hid + "'";
    System.out.println("SQL Query: " + deleteQuery); // Kontrollera frågan

    // Kör borttagningsfrågan
    idb.delete(deleteQuery);

    // Visa bekräftelsemeddelande
    JOptionPane.showMessageDialog(this, "Hållbarhetsmålet togs bort från systemet!");

} catch (Exception ex) {
    // Visa felmeddelande om något går fel
    JOptionPane.showMessageDialog(this, "Fel vid borttagning av hållbarhetsmål: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
}

        
    }//GEN-LAST:event_btnTaBortActionPerformed

    private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
         frame = new JFrame ("Exit");
         if(JOptionPane.showConfirmDialog(frame,"Bekräfta om du vill avsluta","Information om anställda",
                 JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
         {
             System.exit(0);
         }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnÅterställActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÅterställActionPerformed
            txtHid.setText("");
            txtNamn.setText("");
            txtMålNummer.setText("");
            txtBeskrivning.setText("");
            txtPrioritet.setText("");       
    }//GEN-LAST:event_btnÅterställActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraHållbarhetsmål.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraHållbarhetsmål.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraHållbarhetsmål.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraHållbarhetsmål.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ÄndraHållbarhetsmål().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JButton btnÅterställ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBeskrivning;
    private javax.swing.JTextField txtHid;
    private javax.swing.JTextField txtMålNummer;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtPrioritet;
    // End of variables declaration//GEN-END:variables
}

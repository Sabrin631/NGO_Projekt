/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< Updated upstream
import java.util.List;
=======
>>>>>>> Stashed changes
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author aliciafermano
 */
public class AvdelningsProjekt extends javax.swing.JFrame {
    private InfDB idb;
    private String anvandareID;

    /**
     * Creates new form AvdelningsProjekt
     */
    public AvdelningsProjekt(InfDB idb, String anvandareID) {
        initComponents();
        this.idb = idb;
        this.anvandareID = anvandareID;
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
        jScrollPane1 = new javax.swing.JScrollPane();
<<<<<<< Updated upstream
        textAreaProjekt = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnHämtaProjekt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 6));
=======
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 8));
>>>>>>> Stashed changes

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Projekt på min avdelning");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
=======
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addContainerGap(202, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< Updated upstream
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        textAreaProjekt.setColumns(20);
        textAreaProjekt.setRows(5);
        jScrollPane1.setViewportView(textAreaProjekt);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alla", "Pågående", "Avslutade", "Planerade" }));

        btnHämtaProjekt.setText("Hämta Projekt");
        btnHämtaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaProjektActionPerformed(evt);
=======
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alla", "Pågående", "Avslutat", "Planerat" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Alla Projekt På Avdelningen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
>>>>>>> Stashed changes
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< Updated upstream
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHämtaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHämtaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
>>>>>>> Stashed changes
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< Updated upstream
   private void hämtaProjekt(String valdStatus) {
        try {
            // Hämta avdelning baserat på användarens ID
            String avdelningQuery = "SELECT Avdelning FROM Anstalld WHERE AnstalldID = '" + anvandareID + "'";
            String avdelning = idb.fetchSingle(avdelningQuery);

            // Skapa grundläggande query för att hämta projekt baserat på avdelning
            String query = "SELECT * FROM Projekt WHERE Avdelning = '" + avdelning + "'";

            // Lägg till filter baserat på vald status i ComboBox
            if (!valdStatus.equals("Alla")) {
                query += " AND Status = '" + valdStatus + "'";
            }

            // Hämta listan av projekt från databasen (utan ResultSet)
            ArrayList<HashMap<String, String>> projektLista = idb.fetchRows(query);

            // Bygg upp projektlistan som en sträng
            StringBuilder projektList = new StringBuilder();

            // Lägg till varje projekt till textområdet
            for (HashMap<String, String> projekt : projektLista) {
                projektList.append("Projekt ID: ").append(projekt.get("ProjektID"))
                           .append(", Namn: ").append(projekt.get("Namn"))
                           .append(", Status: ").append(projekt.get("Status"))
                           .append("\n");
            }

            // Uppdatera textområdet med resultatet
            textAreaProjekt.setText(projektList.toString());

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Fel vid hämtning av projekt: " + e.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnHämtaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaProjektActionPerformed
        // TODO add your handling code here:
        String valdStatus = (String) jComboBox1.getSelectedItem(); // Hämta vald status från ComboBox
            hämtaProjekt(valdStatus); // Anropa metod för att hämta och visa projekten
        
    }//GEN-LAST:event_btnHämtaProjektActionPerformed
=======
    private ArrayList<String[]> hamtaProjektAvdelning(String avdelningNamn, String status) {
    ArrayList<String[]> projektLista = new ArrayList<>();
    try {
        // SQL-fråga för att hämta projekt baserat på avdelning och status
        String sql = "SELECT projekt.pid, projektnamn, beskrivning, status " +
                     "FROM projekt " +
                     "JOIN avdelning ON projekt.avdelning = avdelning.avdid " +
                     "WHERE avdelning.namn = '" + avdelningNamn + "'";

        // Lägg till status-filter om det inte är "Alla"
        if (!status.equals("Alla")) {
            sql += " AND projekt.status = '" + status + "'";
        }

        // Logga SQL-frågan
        System.out.println("SQL: " + sql);

        // Kör SQL-frågan
        ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sql);

        // Kontrollera om resultatet är null
        if (resultat == null) {
            JOptionPane.showMessageDialog(this, "Inga projekt hittades för avdelningen: " + avdelningNamn);
            return projektLista;
        }

        // Loopar igenom resultatet och lägger till i listan
        for (HashMap<String, String> rad : resultat) {
            String[] projekt = {
                rad.get("pid"),
                rad.get("projektnamn"),
                rad.get("beskrivning"),
                rad.get("status")
            };
            projektLista.add(projekt);
        }
    } catch (Exception e) {
        // Skriv ut stacktrace och visa felmeddelande
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Ett fel uppstod vid hämtning av projekt: " + e.getMessage());
    }
    return projektLista;
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Töm TextArea innan nya resultat visas
    jTextArea1.setText("");

    // Hämta valt status från ComboBox
    String valtStatus = jComboBox1.getSelectedItem().toString();

    // Hämta projekt för avdelningen "Hög" baserat på valt status
    ArrayList<String[]> projektLista = hamtaProjektAvdelning("Hög", valtStatus);

    // Kontrollera om det finns projekt
    if (projektLista.isEmpty()) {
        jTextArea1.append("Inga projekt hittades för avdelningen Hög med status: " + valtStatus + "\n");
    } else {
        // Visa projekt
        for (String[] projekt : projektLista) {
            jTextArea1.append("Projekt ID: " + projekt[0] + "\n");
            jTextArea1.append("Projektnamn: " + projekt[1] + "\n");
            jTextArea1.append("Beskrivning: " + projekt[2] + "\n");
            jTextArea1.append("Status: " + projekt[3] + "\n");
            jTextArea1.append("----------------------------\n");
        }
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
>>>>>>> Stashed changes

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
            java.util.logging.Logger.getLogger(AvdelningsProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvdelningsProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvdelningsProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvdelningsProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AvdelningsProjekt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< Updated upstream
    private javax.swing.JButton btnHämtaProjekt;
=======
    private javax.swing.JButton jButton1;
>>>>>>> Stashed changes
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
<<<<<<< Updated upstream
    private javax.swing.JTextArea textAreaProjekt;
=======
    private javax.swing.JTextArea jTextArea1;
>>>>>>> Stashed changes
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author aliciafermano
 */
public class SökHandläggare extends javax.swing.JFrame {
    private InfDB idb;
    private String anvandareID;

    /**
     * Creates new form SökHandläggare
     */
    public SökHandläggare(InfDB idb, String anvandareID) {
        initComponents();
        this.idb = idb;
        this.anvandareID=anvandareID;
       



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
        txtNamn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSök = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaNamn = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 8));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Sök Handläggare");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(172, 172, 172))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 760, 110));
        getContentPane().add(txtNamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 300, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Skriv namn");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, -1));

        btnSök.setText("Sök");
        btnSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökActionPerformed(evt);
            }
        });
        getContentPane().add(btnSök, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 100, 30));

        textAreaNamn.setColumns(20);
        textAreaNamn.setRows(5);
        jScrollPane1.setViewportView(textAreaNamn);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 310, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<String[]> hamtaHandlaggare(String sokNamn) {
    ArrayList<String[]> handlaggareLista = new ArrayList<>();
    try {
        // Byt ut '3' med den inloggade användarens ID (anvandareID)
        String sql = "SELECT aid, fornamn, efternamn " + 
             "FROM anstalld " + 
             "JOIN avdelning av ON anstalld.avdelning = av.avdid " + 
             "WHERE fornamn LIKE '%" + sokNamn + "%' " + 
             "AND av.avdid = ( " + 
             "    SELECT avdelning " + 
             "    FROM anstalld " + 
             "    WHERE aid = '" + anvandareID + "' " + 
             ")";


        ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sql);

        if (resultat != null) {
            for (HashMap<String, String> rad : resultat) {
                String[] handlaggare = { rad.get("aid"), rad.get("fornamn"), rad.get("efternamn") };
                handlaggareLista.add(handlaggare);
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ett fel uppstod: " + e.getMessage());
    }
    return handlaggareLista;
}
    private void btnSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökActionPerformed
    // Töm TextArea innan nya resultat visas
    textAreaNamn.setText("");

    // Hämta sökordet från textfield
    String sokNamn = txtNamn.getText().trim();

    if (sokNamn.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vänligen skriv ett namn att söka efter.");
        return;
    }

    // Hämta handläggare baserat på sökordet
    ArrayList<String[]> handlaggare = hamtaHandlaggare(sokNamn);

    if (handlaggare.isEmpty()) {
        textAreaNamn.append("Inga handläggare hittades med det namnet.\n");
    } else {
        for (String[] handlaggareData : handlaggare) {
            textAreaNamn.append("Användar-ID: " + handlaggareData[0] + "\n");
            textAreaNamn.append("Förnamn: " + handlaggareData[1] + "\n");
            textAreaNamn.append("Efternamn: " + handlaggareData[2] + "\n");
            textAreaNamn.append("----------------------------\n");}
    }
              
    }//GEN-LAST:event_btnSökActionPerformed

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
            java.util.logging.Logger.getLogger(SökHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SökHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SökHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SökHandläggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SökHandläggare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSök;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaNamn;
    private javax.swing.JTextField txtNamn;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.sql.PreparedStatement;
import javax.swing.JFrame;

/**
 *
 * @author sabri
 */
public class ÄndraAnställda extends javax.swing.JFrame {
    private InfDB idb;
    private Validering validering;


    /**
     * Creates new form ÄndraAnställda
     */
    public ÄndraAnställda(InfDB idb) {
        this.idb =idb;
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnÅterställ = new javax.swing.JButton();
        btnÄndra = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();
        btnLäggTill = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblFörnamn = new javax.swing.JLabel();
        txtFörnamn = new javax.swing.JTextField();
        txtAid = new javax.swing.JTextField();
        txtAvdelning = new javax.swing.JTextField();
        txtLösenord = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtEpost = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtEfternamn = new javax.swing.JTextField();
        lblEpost = new javax.swing.JLabel();
        lblAdress = new javax.swing.JLabel();
        lblEfternamn = new javax.swing.JLabel();
        lblAnställningsDatum = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();
        lblAvdelning = new javax.swing.JLabel();
        lblAid = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblTitel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 8));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 8));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnÅterställ.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnÅterställ.setText("Återställ");
        btnÅterställ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÅterställActionPerformed(evt);
            }
        });

        btnÄndra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        btnTaBort.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnTaBort.setText("Ta Bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        btnLäggTill.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLäggTill.setText("Lägg Till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnÅterställ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(btnÄndra, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(btnTaBort, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(btnLäggTill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLäggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnÄndra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnÅterställ, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 94, 250, 531));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 8));

        lblFörnamn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFörnamn.setText("Förnamn");

        txtFörnamn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtFörnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFörnamnActionPerformed(evt);
            }
        });

        txtAid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtAid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAidActionPerformed(evt);
            }
        });

        txtAvdelning.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvdelningActionPerformed(evt);
            }
        });

        txtLösenord.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLösenordActionPerformed(evt);
            }
        });

        txtDatum.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatumActionPerformed(evt);
            }
        });

        txtTelefon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonActionPerformed(evt);
            }
        });

        txtEpost.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEpostActionPerformed(evt);
            }
        });

        txtAdress.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdressActionPerformed(evt);
            }
        });

        txtEfternamn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtEfternamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEfternamnActionPerformed(evt);
            }
        });

        lblEpost.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEpost.setText("Epost");

        lblAdress.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAdress.setText("Adress");

        lblEfternamn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEfternamn.setText("Efternamn");

        lblAnställningsDatum.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAnställningsDatum.setText("Anställningsdatum");

        lblTelefon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTelefon.setText("Telefon");

        lblLösenord.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLösenord.setText("Lösenord");

        lblAvdelning.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAvdelning.setText("Avdelning");

        lblAid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAid.setText("aid");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAid, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnställningsDatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAid, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAid))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtFörnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEpost))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTelefon))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAnställningsDatum))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLösenord))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAvdelning)))
                                    .addComponent(lblAdress)))
                            .addComponent(lblEfternamn)))
                    .addComponent(lblFörnamn))
                .addGap(27, 27, 27))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 94, 901, 530));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblTitel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblTitel.setText("Information om Anställda");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(lblTitel)
                .addGap(286, 286, 286))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitel)
                .addContainerGap())
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, 1170, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(457, 457, 457)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed
        // Hämta det som står idassa textfält
        try{
        String aid =txtAid.getText();
        String fornamn = txtFörnamn.getText();
        String efternamn = txtEfternamn.getText();
        String adress = txtAdress.getText();
        String epost = txtEpost.getText();
        String telefon = txtTelefon.getText();
        String anstallningsdatum = txtDatum.getText();
        String losenord = txtLösenord.getText();
        String avdelning = txtAvdelning.getText();
        
        // Kontrollera att dessa fält inte är tomma
 
         if (fornamn.isEmpty() || efternamn.isEmpty() || epost.isEmpty() || telefon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fyll i alla obligatoriska fält!", "Fel", JOptionPane.ERROR_MESSAGE);
            return;
               }
         
         if(!validering.finnsUsernameiDB(aid))
         {
            // Skapa sql Fråga för att Lägga till Nya anställda
            String sql;
            sql = "INSERT INTO anstalld (aid, Fornamn, Efternamn, Adress, Epost, Telefon, Anstallningsdatum, Losenord, Avdelning) " +
                    "VALUES ('" + aid + "','" + fornamn + "', '" + efternamn + "', '" + adress + "', '" + epost + "', '" + telefon + "',"
                   +" '" + anstallningsdatum + "', '" + losenord + "', '" + avdelning + "')";
         
         // Lägg till den nya anställda i databasen
            idb.insert(sql);
             JOptionPane.showMessageDialog(this, "Ny anställd lades till!");
         }
       
        // Visa felmeddelande om något går fel
        }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Fel vid tillägg av anställd: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
        }
                
    }//GEN-LAST:event_btnLäggTillActionPerformed
    private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame ("Exit");
         if(JOptionPane.showConfirmDialog(frame,"Bekräfta om du vill avsluta","Information om anställda",
                 JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
         {
             System.exit(0);
         }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnÅterställActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÅterställActionPerformed
        // TODO add your handling code here:
        txtAid.setText("");
        txtFörnamn.setText("");
        txtEfternamn.setText("");
        txtAdress.setText("");
        txtEpost.setText("");
        txtTelefon.setText("");
        txtDatum.setText("");
        txtLösenord.setText("");
        txtAvdelning.setText("");
    }//GEN-LAST:event_btnÅterställActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        // TODO add your handling code here:
        try {
        // Hämta ID från textfältet
        String aid = txtAid.getText();

        // Kontrollera att ID inte är tomt
        if (aid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vänligen ange ett giltigt ID.", "Fel", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Kontrollera om ID:t existerar i databasen
        String Kontroll = "SELECT COUNT(*) FROM anstalld WHERE aid = '" + aid + "'";
        String result = idb.fetchSingle(Kontroll);

        if (result == null || Integer.parseInt(result) == 0) {
            JOptionPane.showMessageDialog(this, "Ingen anställd hittades med angivet ID.", "Fel", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Skapa SQL-fråga för att ta bort anställd
        String deleteQuery = "DELETE FROM anstalld WHERE aid = '" + aid + "'";
        System.out.println("SQL Query: " + deleteQuery); // Kontrollera frågan

        // Kör borttagningsfrågan
        idb.delete(deleteQuery);

        JOptionPane.showMessageDialog(this, "Anställd borttagen från systemet!");

    } catch (Exception ex) {
        // Visa felmeddelande om något går fel
        JOptionPane.showMessageDialog(this, "Fel vid borttagning av anställd: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed

        try {
        // Hämta värden från textfälten
        String aid = txtAid.getText();
        String fornamn = txtFörnamn.getText();
        String efternamn = txtEfternamn.getText();
        String adress = txtAdress.getText();
        String epost = txtEpost.getText();
        String telefon = txtTelefon.getText();
        String anstallningsdatum = txtDatum.getText();
        String losenord = txtLösenord.getText();
        String avdelning = txtAvdelning.getText();

        // Kontrollera att ID inte är tomt
        if (aid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vänligen ange ett giltigt ID för att uppdatera.", "Fel", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Kontrollera om ID:t existerar i databasen
        String Kontroll = "SELECT COUNT(*) FROM anstalld WHERE aid = '" + aid + "'";
        String result = idb.fetchSingle(Kontroll);

        if (result == null || Integer.parseInt(result) == 0) {
            JOptionPane.showMessageDialog(this, "Ingen anställd hittades med angivet ID.", "Fel", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Skapa SQL-fråga för att uppdatera anställds information
        String updateQuery = "UPDATE anstalld SET "
                + "Fornamn = '" + fornamn + "', "
                + "Efternamn = '" + efternamn + "', "
                + "Adress = '" + adress + "', "
                + "Epost = '" + epost + "', "
                + "Telefon = '" + telefon + "', "
                + "Anstallningsdatum = '" + anstallningsdatum + "', "
                + "Losenord = '" + losenord + "', "
                + "Avdelning = '" + avdelning + "' "
                + "WHERE aid = '" + aid + "'";

        // Kör uppdateringsfrågan
        idb.update(updateQuery);

        JOptionPane.showMessageDialog(this, "Anställds information har uppdaterats!");

    } catch (Exception ex) {
        // Visa felmeddelande om något går fel
        JOptionPane.showMessageDialog(this, "Fel vid uppdatering av anställd: " + ex.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnÄndraActionPerformed

    private void txtEfternamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEfternamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEfternamnActionPerformed

    private void txtAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdressActionPerformed

    private void txtEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEpostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEpostActionPerformed

    private void txtTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonActionPerformed

    private void txtDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatumActionPerformed

    private void txtLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLösenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLösenordActionPerformed

    private void txtAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvdelningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvdelningActionPerformed

    private void txtAidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAidActionPerformed

    private void txtFörnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFörnamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFörnamnActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraAnställda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraAnställda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraAnställda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraAnställda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ÄndraAnställda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JButton btnÅterställ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblAid;
    private javax.swing.JLabel lblAnställningsDatum;
    private javax.swing.JLabel lblAvdelning;
    private javax.swing.JLabel lblEfternamn;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblFörnamn;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtAid;
    private javax.swing.JTextField txtAvdelning;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtFörnamn;
    private javax.swing.JTextField txtLösenord;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author sabri
 */

public class Validering extends javax.swing.JFrame {
    private InfDB idb;


    /**
     * Creates new form validering
     */
    public Validering(InfDB idb) {
        this.idb = idb;
        initComponents();
    }
    
    //--------------------------------------------------------------------------
    // Kontrollera om det inmatade ID:t är detsamma som det inloggade användar-ID:t
    public boolean arRattID(String inmatatID, String inloggatID) {
    if (inmatatID.equals(inloggatID)) {
        return true;
    } else {
        JOptionPane.showMessageDialog(this, "Detta är inte ditt ID. Skriv in ditt korrekta ID och försök igen.", 
                                      "Fel ID", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
   //---------------------------------------------------------------------------
    //Metoden kollar om Ett namn Finns i Databasen genom att skicka in det namnet som
    public boolean finnsUsernameiDB(String id) {
        boolean finns = false;
        try
        {
            String sqlFraga = "Select fornamn FROM anstallda WHERE aid Like '" + id + "';";
            String ettId = idb.fetchSingle(sqlFraga);
            if(ettId != null)
            {
                finns = true;
            }
        }
        catch (InfException ex)
        {
            
        }
        return finns;
    }
    
    //--------------------------------------------------------------------------
    public boolean finnsAnvandare(String id) {
    boolean finns = false;
    try {
        // Kontrollera om användar-ID:t finns i databasen
        String sqlFraga = "SELECT fornamn FROM anstallda WHERE aid LIKE '" + id + "';";
        String resultat = idb.fetchSingle(sqlFraga);
        if (resultat != null) {
            finns = true;
        }
    } catch (InfException e) {
        JOptionPane.showMessageDialog(this, "Fel vid hämtning av användar-ID: " + e.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
    }
    return finns;
}
    
    //--------------------------------------------------------------------------
    
    
  // Kontrollera om en sträng är tom
    public boolean arTom(String str) {
    return str == null || str.trim().isEmpty();
}

   //---------------------------------------------------------------------------

    public boolean arRattEpost(String epost) {
    // Regex för att validera e-postadress
      String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(epost);
    
    if (matcher.matches()) {
        return true;
    } else {
        JOptionPane.showMessageDialog(this, "E-postadressen är inte korrekt formaterad. Vänligen ange en giltig e-postadress.", 
                                      "Fel e-post", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}

   //---------------------------------------------------------------------------  

   public boolean arRattTelefonnummer(String telefonnummer) {
    // Regex för att validera telefonnummer som endast innehåller siffror och är mellan 8 och 15 siffror lång
    String regex = "^[0-9]{8,15}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(telefonnummer);
    
    if (matcher.matches()) {
        return true;
    } else {
        JOptionPane.showMessageDialog(this, "Telefonnumret får endast innehålla siffror och vara mellan 8 och 15 siffror lång.", 
                                      "Fel telefonnummer", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}

    //--------------------------------------------------------------------------
    
    public boolean arRattStatus(String status) {
    // Lista över godkända statusvärden
    String[] godkandaStatus = {"Pågående", "Avslutad", "Planerad"};
    
    // Kontrollera om den inmatade statusen finns i listan
    for (String godkandStatus : godkandaStatus) {
        if (godkandStatus.equalsIgnoreCase(status)) {
            return true;  // Statusen är giltig
        }
    }
    
    // Om statusen inte är giltig, visa ett felmeddelande
    JOptionPane.showMessageDialog(this, "Ogiltig status. Vänligen välj ett av följande: Pågående, Avslutad eller Planerad.", 
                                  "Fel status", JOptionPane.ERROR_MESSAGE);
    return false;
}
    //--------------------------------------------------------------------------
    
    public boolean arRattPrioritet(String prioritet) {
    // Lista över godkända prioritetvärden
    String[] godkandaPrioritet = {"Hög", "Medel", "Låg"};
    
    // Kontrollera om den inmatade prioriteten finns i listan
    for (String godkandPrioritet : godkandaPrioritet) {
        if (godkandPrioritet.equalsIgnoreCase(prioritet)) {
            return true;  // Prioriteten är giltig
        }
    }
    
    
    // Om prioriteten inte är giltig, visa ett felmeddelande
    JOptionPane.showMessageDialog(this, "Ogiltig prioritet. Vänligen välj ett av följande: Hög, Medel eller Låg.", 
                                  "Fel prioritet", JOptionPane.ERROR_MESSAGE);
    return false;
}

    //--------------------------------------------------------------------------
    
    public boolean arRattDatum(String datum) {
    // Formatet som datumet ska vara i (yyyy-MM-dd)
    String format = "yyyy-MM-dd";
    
    // Skapa en SimpleDateFormat-instans med det specifika formatet
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    sdf.setLenient(false);  // Sätt till false för att strikt kontrollera datumet
    
    try {
        // Försök att parsa datumet
        sdf.parse(datum);
        return true;  // Om det lyckas, så är datumet giltigt
    } catch (ParseException e) {
        // Om det inte lyckas, är datumet ogiltigt
        JOptionPane.showMessageDialog(this, "Ogiltigt datumformat. Vänligen använd formatet yyyy-MM-dd.", 
                                      "Fel datum", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
    //--------------------------------------------------------------------------
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo.pkg2.pkg0;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
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
    
    //Första metoden kollar om ett namn finns i Databasen,
    //Man ska skicka in ett namn och få Ut om det finns ellr inte genom En boolean.
    
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

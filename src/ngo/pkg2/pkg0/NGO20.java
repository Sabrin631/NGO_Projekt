/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ngo.pkg2.pkg0;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author sabri
 */
public class NGO20 {
    
    private static InfDB idb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            idb = new InfDB("ngo_2024","3306","root","Sommarlov123");
            new Inloggning(idb).setVisible(true);
            
        }catch(InfException ex){
            System.out.println(ex.getMessage());   
        }
    }
    
}

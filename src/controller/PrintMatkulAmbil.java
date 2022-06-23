
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Magister;
import model.Sarjana;

public class PrintMatkulAmbil {
    
    public void printMatkulAmbil(ArrayList<Sarjana> arrSarjana, ArrayList<Magister> arrMagister, String NIM){
        
        //Sarjana
        if (!arrSarjana.isEmpty()) {
            for (int i = 0; i < arrSarjana.size(); i++) {
                if (arrSarjana.get(i).getNIM().equals(NIM)) {
                    JOptionPane.showMessageDialog(null,arrSarjana.get(i).arrMatkulDiambil.toString());
                }
            }
        }
        
        //Magister
        if (!arrMagister.isEmpty()) {
            for (int i = 0; i < arrMagister.size(); i++) {
                if (arrMagister.get(i).getNIM().equals(NIM)) {
                    JOptionPane.showMessageDialog(null,arrMagister.get(i).arrMatkulDiambil.toString());
                }
            }
        }
    }
    
}

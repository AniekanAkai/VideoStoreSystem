package src.anearcan;

import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anearcan
 */
public class BarcodeScannerInterface {
    
    private String barcode;
    
    public BarcodeScannerInterface(){
        barcode = "xxx";
    }
    
    public String scanItem(JFrame frame){
        barcode = (String)JOptionPane.showInputDialog(frame, "Scan Item(enter 0 to stop)","Buy",JOptionPane.PLAIN_MESSAGE);                
        return barcode;
    }
    
    public String scanMembershipCard(JFrame frame){
        barcode = (String)JOptionPane.showInputDialog(frame,"Scan Membership Card\n","Confirm Membership",
                JOptionPane.PLAIN_MESSAGE, null, null,null);;
        return barcode;
    }
    
}

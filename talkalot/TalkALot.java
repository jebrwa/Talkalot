/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talkalot;
import java.util.*;

/**
 *
 * @author jw0155039
 */
public class TalkALot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OutgoingPhoneCall callOut = new OutgoingPhoneCall("6744784", 12.36); 
        IncomingPhoneCall callIn = new IncomingPhoneCall("4571546"); 
        
        ArrayList<PhoneCall> phonecall = new ArrayList<PhoneCall>();
        phonecall.add(callOut);
        phonecall.add(callIn);
        
        for (int i = 0; i < phonecall.size(); i++) {
            phonecall.get(i).calling();
        }
    }
    
    
    
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talkalot;
/**
 *
 * @author jw0155039
 */
public class OutgoingPhoneCall extends PhoneCall {
    String callTime;
    
    public OutgoingPhoneCall(String PhoneNum, double calltime){
        
    super(PhoneNum);
    callPrice = 0.04;
    this.callTime = callTime;
    }
    
    public void calling(){
        System.out.println("");
    }
}

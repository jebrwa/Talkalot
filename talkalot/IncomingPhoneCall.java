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
public class IncomingPhoneCall extends PhoneCall {
      
    public IncomingPhoneCall(String PhoneNum){
        
    super(PhoneNum);
    callPrice = 0.02;
    }
    
    @Override
    public void calling(){
        System.out.println(PhoneNum);
    }
}

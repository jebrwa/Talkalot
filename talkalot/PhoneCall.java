package talkalot;
 public abstract class PhoneCall {
     
    String PhoneNum;
    double callPrice = 0.0;
    


    public PhoneCall (String PhoneNum){
 
        this.PhoneNum = PhoneNum;
        this.callPrice = callPrice;
        display();
 
    }
    public void display(){
        System.out.printf("The price of this call is ", "The number is ",  callPrice);
    }
    
    public abstract void calling();

 }
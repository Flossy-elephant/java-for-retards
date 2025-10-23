interface PaymentType{
public void payAmount(double amount);
public void getReceipt();
}

class creditCard implements PaymentType{
String creditNum;
String creditHolder;


creditCard(String creditNum ,String creditHolder){
	this.creditNum=creditNum;
	this.creditHolder = creditHolder;
}

public void payAmount(double amount){
System.out.println("processsing payment......");
System.out.println("creditNum: " + creditNum);
System.out.println("creditHolder: " + creditHolder);
System.out.println("amount paid: $" + amount);
}

public void getReceipt(){
System.out.println("payment succsessfull!!");
}
}

class UpiPayment implements PaymentType{

String upiId;

UpiPayment(String upiId){
this.upiId = upiId;
}

public void payAmount(double amount){
System.out.println("processsing payment......");
System.out.println("upi id : " + upiId);
System.out.println("amount paid: $" + amount);

}

public void getReceipt(){
System.out.println("payment succsessfull!!");
}
}



public class payment{

public static void main(String[]args){
creditCard c1 =  new creditCard("alice","1231-24242-5252");
c1.payAmount(2500);
c1.getReceipt();

UpiPayment u1 = new UpiPayment("alice@okaxis");
u1.payAmount(4599);
u1.getReceipt();
}
}
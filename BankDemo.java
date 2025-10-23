class BankAccount{

  private String name;
  private int balance;

  BankAccount(String name,int balance){
    this.name = name;
    this.balance = balance;

  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setBalance(int balance){
    if (balance > 0){
     this.balance = balance;
      }
    
    else{
       System.out.println("balance cannot be negative");
    }  
    }

    public int getBalance(){
      return balance;
    }

  
  public void displayDetails(){
    System.out.println("name: " + name);
    System.out.println("balance: $"+ balance);
  }
}


public class BankDemo {

  public static void main(String[]args){
  BankAccount person1 =  new BankAccount("lana",234141441);
  person1.displayDetails();

  person1.setName("lana rhodes");
  person1.getName();  


  person1.setBalance(1234425);
  person1.getBalance();

  person1.displayDetails();

  }
}


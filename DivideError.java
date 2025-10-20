import static utils.print.*;
import java.util.Scanner;

 class DivideError {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    try{
      ln("enter the first number: ");
      int num = sc.nextInt();

      ln("enter the second number: ");
      int den = sc.nextInt();

      int result = num/den;
      ln("result: " + result);
    }
    catch(ArithmeticException e){
      ln("oops!! cannot divide by zero");
    }

    finally{
      ln("the division has completed");
    }
    
    sc.close();
  }
}

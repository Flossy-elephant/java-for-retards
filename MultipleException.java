import static utils.print.ln;
import java.util.Scanner;

public class MultipleException {
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    boolean validInput = false;
    while (!validInput) {
      try{
        ln("enter the first number: ");
        int num = Integer.parseInt(sc.nextLine());

        ln("enter the second number: ");
        int den = Integer.parseInt(sc.nextLine());

        int result = num/den;
        ln("result: " + result);

        validInput = true;
      }
      catch(ArithmeticException e){
        ln("oops!! cannot divide by zero try again");
      }

      catch(NumberFormatException e){
        ln("try entering a number next time kiddo");
      }


      finally{
        ln("the division has completed");
      }
      
      
    }
   sc.close();   
  }
  
}

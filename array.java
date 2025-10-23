import java.util.Scanner;

public class array {
  public static void main(String[]args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("enter the size of array");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.println("enter " + size +" integers: " );
    for(int i = 0;i <=size;i++){
      arr[i] = sc.nextInt();
    }
   try{
    System.out.println("accessing items in the array");
    for(int i = 0;i<=size;i++){
        System.out.println("arr[" + i + "] = " + arr[i]);
    }

   }

   catch(ArrayIndexOutOfBoundsException e){
    System.out.println("error: " + e);

   }
   finally{
    System.out.println("executed successfully");
   }



  }
}


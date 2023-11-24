package Exercise_Fourteen.Question_03;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_03 {
  public static void main(String[] args) {
     Scanner  s = new Scanner(System.in);
      
    try{
       int a = s.nextInt();
      int b = s.nextInt();
      int c = a/b;
      System.out.println(c);
    }catch(ArithmeticException ex){

     System.out.println("Não pode dividir por  zero");

    }catch(InputMismatchException ex ) {

       System.out.println("Input invalido");
       
    }
  }
    
   
}

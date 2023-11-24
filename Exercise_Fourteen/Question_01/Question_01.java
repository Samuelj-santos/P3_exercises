package Exercise_Fourteen.Question_01;
import java.util.Scanner;

public class Question_01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println();
       

        try{
             int b = s.nextInt();
            System.out.println(a.charAt(b));
        } catch(Exception e){
            System.out.println("Posiçao invalida ");
        }
    }
}
package Exercise_Fourteen.Question_02;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in); 
        try{
          int a = s.nextInt();
          int b = s.nextInt();
          int c = s.nextInt();
          int d = s.nextInt();
          int e = s.nextInt();
          int f= s.nextInt();
          int g = s.nextInt();
          int h = s.nextInt();
          int i = s.nextInt();
          int j = s.nextInt();

          lista.add(a);
          lista.add(b);
          lista.add(c);
          lista.add(d);
          lista.add(e);
          lista.add(f);
          lista.add(g);
          lista.add(h);
          lista.add(i);
          lista.add(j);
          
          System.out.println("Agr remova");
          int k = s.nextInt();
          lista.remove(k-1);
          
           for(int z =0;z<lista.size();z++){
               System.out.println(lista.get(z));
           }

        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
}

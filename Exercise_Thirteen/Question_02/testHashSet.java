package Exercise_Thirteen.Question_02;

import java.util.HashSet;
import java.util.Scanner;

public class testHashSet {
    public static void main(String[] args) {
         HashSet <String > lista = new HashSet();
      Scanner s = new Scanner(System.in);
      int a = 1;
    while(a != 0){
          System.out.println("Para inserir mais um cpf insira 1 caso não insira 0");
           a = s.nextInt();
           if (a == 1) {
            System.out.println("Insira o cpf");
            String b = s.next();
            lista.add(b);
           }
    }
     
    for(int i =0;i<lista.size();i++){
        System.out.println(lista.toArray()[i]);
    }
       

    }
   
}

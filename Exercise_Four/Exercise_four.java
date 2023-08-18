package Exercise_Four;
import java.util.Scanner;

public class Exercise_four {
   static Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
  // Question01();
   //Question02();
   //Question03();
   //Question04();
   //Question05();
   //Question06();
   //Question07();
   //Question08();
   //Question09();
   //Question10();
   //Question11();
   //Question12();
   //Question13();
   //Question14();
   //Question15();
   //Question16();
   //Question17();
   //Question18();
   //Question19();
   //Question20();
   //Question21();
   

  }

  public static void Question01(){
     System.out.println("Insira um numero");
    int a = s.nextInt();
    if (a>0) {
     System.out.println("Seu numero é positivo");
    } else if (a<0) {
      System.out.println("Seu numero é negativo");      
    }else{
     System.out.println("Seu numero é zero");
    }
  }

  public  static void Question02(){
     System.out.println("Insira sua idade");
    int a = s.nextInt(); 
    if (a >=18) {
      System.out.println("Voce é maior de idade");
    }else {
     System.out.println("Voce é de menor");
    }
  }
  public static void Question03(){
   System.out.println("Insira seu primeiro numero");
   int a = s.nextInt();
   System.out.println("Insira seu segundo numero");
   int b = s.nextInt();

   if (a>b) {
     System.out.println("O primeiro numero é maior ");
   }
   else if(b>a){
     System.out.println("O segundo numero é maior ");
   }
   else{
     System.out.println("São iguais ");
   }
  }
  public static void Question04(){
     System.out.println("Insira seu numero");
     int a = s.nextInt();
     if ((a % 2) == 0) {
        System.out.println("Seu numero é par");
     } else{
        System.out.println("Seu numero é impar");
     }
  }
  public static void Question05(){
     System.out.println("Insira sua primeira nota");
     double  a = s.nextDouble();
     System.out.println("Insira a segunda nota ");
     double b = s.nextDouble();
     System.out.println("Insira a terceira nota ");
    double c = s.nextDouble();
    double media = (a+b+c)/3;

    if (media >=7) {
        System.out.println("Aprovado");
    }else if (media<7 ) {
        System.out.println("Reprovado");
    }
  }

  public static void Question06(){
    System.out.println("Insira o priemeiro nome ");
    String a  = s.nextLine();
    System.out.println("Insira o segundo nome");
    String b = s.nextLine();

    if (a.length()>b.length()) {
        System.out.println("O primeiro nome é maior");
    }else{
        System.out.println("O segundo nome é maior");
    }
     
  }
  public static void Question07(){
    System.out.println("insira uma letra");
    String a = s.nextLine();
    char[] b = a.toCharArray();

    if (b[0] == 'a'|| b[0] == 'A') {
        System.out.println("É uma vogal");
    }else if (b[0] == 'e'|| b[0] == 'E') {
        System.out.println("É uma vogal");
    }else if (b[0] == 'i'|| b[0] == 'I') {
        System.out.println("É uma vogal");
    }else if (b[0] == 'o'|| b[0] == 'O') {
        System.out.println("É uma vogal");
    }else if (b[0] == 'u'|| b[0] == 'U') {
        System.out.println("É uma vogal");
    }else {
        System.out.println("É uma consoante");
    }
     
  }
  public static void Question08(){
    System.out.println("Insira o primeiro numero ");
    int a = s.nextInt();
    System.out.println("Insira o segundo numero ");
    int b = s.nextInt();
    System.out.println("Insira o terceiro numero ");
    int c = s.nextInt();

   
     
  }
  public static void Question09(){
     
  }
  public static void Question10(){
     
  }
  public static void Question11(){
     
  }
  public static void Question12(){
     
  }
  public static void Question13(){
     
  } public static void Question14(){
     
  }
  public static void Question15(){
     
  } public static void Question16(){
     
  } public static void Question17(){
     
  } public static void Question18(){
     
  } public static void Question19(){
     
  } public static void Question20(){
     
  } public static  void Question21(){
     
  }


   
}
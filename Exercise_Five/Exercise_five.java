package Exercise_Five;

import java.util.Scanner;

public class Exercise_five {
  static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
  //  Question01();
  //  Question02();
  //  Question03();
  //  Question04();
  //  Question05();
  //  Question06();
  //  Question07();
  //  Question08();
  //  Question09();
  //  Question10();
  //  Question11();
  //  Question12();
   // Question13();
   // Question14();
   // Question15();
   // Question16();
   // Question17();
   // Question18();
   // Question19();
  //  Question20();
   // Question21();
   // Question22();
  //  Question23();
   // Question24();

   // utilize  cada questoes individualmente para evitar problemas no scanner  
    }

    public static void Question01(){
        int m = 0;
        int a = 0;
       
    for(int i =0;i<=4;i++){
      System.out.println("Insira a nota do aluno " + (i+1));
      a = s.nextInt();

      if (a>=7) {
        m ++;
        
      }
     
    }
     System.out.println("A quantidade de alunos aprovados foi " + m);
    }
    public  static void Question02(){
    System.out.println("Insira um numero com mais de um algarismo");
    int a  = s.nextInt();
    int b = 0;
    String number = String.valueOf(a);
    String[] digits = number.split("(?<=.)");

    for(int i =0; i<digits.length;i++){
        int c = Integer.parseInt(digits[i]);
        b = b+c;
    }
    System.out.println("A soma dos seus algarismos é " + b);
 
    }
    public  static void Question03(){
      System.out.println("Insira um numero inteiro ");
        int a = s.nextInt();
        for(int i =0;i<=999999999;i++){
          if (i!= 0) {
           
            if ((a%i) == 0) {
           System.out.println( "divisor é");
          
          System.out.println(i+" ");
        }
          }
        
        }

    }
    public static  void Question04(){
     
     double a,b;
     b=0;
     for(int i =0;i<=4;i++){
      System.out.println("Insira a pessoa numero " +(i+1));
      a = s.nextDouble();
      b = b+a;
     }
     b = b/5;
     System.out.printf("a media das alturas é: " +"%.2f" ,b);

    }
    public  static void Question05(){
    for(int i =0;i<=100;i++){
     if ((i%3)== 0 && (i%5 ) == 0) {
      System.out.println("FizzBuzz");
     }else if ((i%3) == 0) {
      System.out.println("Fizz");
     }else if ((i%5) == 0) {
      System.out.println("Buzz");
     }else{
      System.out.println(i);
     }
     
    }
    }
    public  static void Question06(){
      System.out.println("Insira um numero inteiro que cotenha ao menos 1 algarismo par");
     int a  = s.nextInt();
    int b = 0;
    String number = String.valueOf(a);
    String[] digits = number.split("(?<=.)");

    for(int i =0; i<digits.length;i++){
        int c = Integer.parseInt(digits[i]);
        if (c == 0 ||c == 2 || c == 4 || c == 6 ||c == 8 ) {
           b = b+c;
        }
       
    }
    System.out.println("a soma dos digitos pares desse numero é " + b);
    }
    public static  void Question07(){
      System.out.println("Insira um inteiro");
     int a = s.nextInt();
    
    String number = String.valueOf(a);
    String[] digits = number.split("(?<=.)");
    int b = digits.length;
     int[] c  = new int[digits.length];

    for(int i =0; i<digits.length;i++){
         c[i] = Integer.parseInt(digits[i]);
        
    }
    System.out.println("Seu numero invertido é");
    for(int j =0;j<digits.length;j++){
      b--; 
      System.out.print( " " + c[b]);
     
    }

    }
    public  static void Question08(){
      int a = 0;
      int b = 0;
      int i =0;
     while(i<100){
       b++;
       a = a+b;
       i++;
     }
     System.out.println("A soma  de todos os numeros de 1 a 100 é :"  +  a);
    }
    public static  void Question09(){
      int i =0;
      int a =1;
      int b = 0;
     while (i<5) {
       b++;
       a = a*b;
      i++;
     }
     System.out.println("O produto dos  numeros de 1 a 5 é :" + a);
    }
    public static void Question10(){
      System.out.println("Tabuada do numero nove");
    for(int i =0;i<11;i++){
      System.out.println("9 * " + i +" : " + (9*i));
    } 
    }
    public static void Question11(){
      int b = 0;
    System.out.println("Descrição : insira quantos um conjunto de numeros , se caso digitar zero ele para");
    while (s.hasNext()) {
      int a = s.nextInt();
      if (a == 0) {
        break;
      }
      if (a>b) {
        b = a;
      } 
    }
    System.out.println("o maior numero que você digitou foi : " + b );
    }
    public static  void Question12(){
    System.out.println("Insira numeros e recebera a media se digitar -1 o programa para ");
    int contador =0;
    int soma = 0;
    int result =0;
    while (s.hasNext()) {
      int a = s.nextInt();
      if (a == -1) {
        break;
      }
      contador ++;
      soma = soma+a;
    }
    result = soma/contador;
    System.out.println("a media desses numeros é " + result);
    }
    public static  void Question13(){
    System.out.println("Insira um numero com mais de um algarismo");
    int a  = s.nextInt();
    int b = 0;
    String number = String.valueOf(a);
    String[] digits = number.split("(?<=.)");

    for(int i =0; i<digits.length;i++){
        int c = Integer.parseInt(digits[i]);
        b = b+c;
    }
    System.out.println("A soma dos seus algarismos é " + Math.pow(b, 3));
    }
    public static  void Question14(){
      int i = 0;
    while (i<100) {
      if ((i%2) != 0) {
        System.err.println( i +" é impar");
      }
      i++;
    }
    }
    public static  void Question15(){
      int i =0;
     while (i<50) {
      if ((i%3) == 0) {
        System.out.println(i + " é multiplo de 3");
      }
      i++;
     }
    }
    public static  void Question16(){
      System.out.println("inisra 5 notas");
      int i =0;
    while (i<5) {
      int a = s.nextInt();
      if (a>=7) {
        System.out.println("O aluno " + (i+1) + " foi aprovado");
      }
      else{
        System.out.println("o aluno " + (i+1) + " foi reprovado");
      }
      i++;
    }
    }
    public static  void Question17(){
      System.out.println("Insira numeros e vai receber a  quantidade de numeros pares antes de um numero impar , se for zero o programa acaba , se for impar tambem o programa caba");
      int contador = 0;
      while (s.hasNext()) {
      
      int a = s.nextInt();
      if (a == 0) {
        break;
      }
      if ((a%2) == 0) {
        contador ++;
      }else{
        break;
      }

     }
     System.out.println("Seu resultado foi " + contador);
    }
    public static  void Question18(){
     System.out.println("digite numeros , se digitar zero o programa acaba ");
     int contadorpar = 0;
     int contadorimpar = 0;
     while (s.hasNext()) {
      int a = s.nextInt();
      if (a ==0 ) {
        break;
      }

      if ((a%2) == 0) {
        contadorpar++;
      }else{
        contadorimpar++;
      }
     }
     System.out.println("O numero de numero pares foi "  + contadorpar + " e impares " + contadorimpar);
    }
    public static  void Question19(){
    System.out.println("insira numeros e vai receber qual sao divisiveis por 2 , por 3 e por 5");
    int contadordois = 0;
    int contadortres = 0;
    int contadorcinco = 0;
    while (s.hasNext()) {
      int a = s.nextInt();
      if (a == 0) {
        break;
      }
      if ((a%2) ==  0) {
        contadordois++;
      }else if ((a%3) == 0) {
        contadortres++;

      }else{
        contadorcinco++;
      }
     }
     System.out.println(" os numeros divisiveis  por 2 sao " + contadordois );
      System.out.println(" os numeros divisiveis por 3 sao "  + contadortres );
       System.out.println(" os numeros divisiveis por 5 sao " + contadorcinco );
    }

    public static  void Question20(){
    System.out.println("exibir o numero  de numeros diviseis por 3  se digitar 0 o programa para");
     int soma = 0;
     int contador =0 ;
    while (s.hasNext()) {
      int a = s.nextInt();
      if (a ==0 ) {
        break;
      }
      if ( (a%3) == 0) {
        soma = soma+a;
        contador++;
      }
     
    }
    System.out.println("a media dos numeros divididos por 3  é " + (soma/contador));
    }
    public static  void Question21(){
     System.out.println("Insira numeros e vai receber quais tem mais de 3 digitos");
     int contador = 0; 
     while (s.hasNext()) {
      int a  = s.nextInt();  
     String number = String.valueOf(a);
     String[] digits = number.split("(?<=.)");
     if (a ==0 ) {
      break;
     }

     if (digits.length == 3) {
      contador ++;
     }
    }
    System.out.println("a quantidade de numeros que tem mais de 3 digitos são " +  contador);

    }
    public static  void Question22(){
    System.out.println(" vc vai receber a media  dos numeros que estão entre 50 e 100 se digitar 0 o programa acaba");
    int soma =0 ;
    int contador = 0;
    while (s.hasNext()) {
      int a = s.nextInt();  
      if (a ==0 ) {
        break;
        
      }
      if ((a>=50)   && (a<=100)) {
        soma = soma+a;
        contador++;
      }
    }
    System.out.println("o resultado é " + (soma/contador));
    }
    public static  void Question23(){
    System.out.println("insira numeros e vai receber o menor positivo e impar , se digitar 0 o programa para ");
    int menor = 0;
    int menorpassado =10000000;
    while (s.hasNext()) {
      int a = s.nextInt();
      if (a == 0) {
        break;
      }
      if ((a>0) && (a%2 != 0)) {
        menor = a;
        if (menor<menorpassado) {
          menorpassado = menor;
        }
      }
    
    }
    System.out.println("seu resultado é " + menorpassado);

    }
     public static   void Question24(){
      System.out.println(" inisra numeros e o programa vai dizer qunatos sao pares  e quantos sao impares");
      int contadorpar = 0;
      int contadorimpar = 0;
      while (s.hasNext()) {
        int a  =s.nextInt();
        if (a == 0) {
          break;
        }
        if ((a%2) == 0) {
          contadorpar++;
        }else{
          contadorimpar++;
        }
      }
     System.out.println(" a quantidades de numeros pares sao " + contadorpar + " e impares " + contadorimpar);
    }

}


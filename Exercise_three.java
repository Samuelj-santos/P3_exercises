import java.util.Scanner;

public class Exercise_three {
 static Scanner s = new Scanner (System.in);
 public static void main(String[] args) {
  //  Question01();
  // Question02();
  //Question03();
  //Question04();
  //Question05();
  //Question06();
  //Question07();
 // Question08();
 // Question09();
 // Question10();
  //Question11();
  //Question12();
  //Question13();
  //Question14();
 // Question15();
  //Question16();
  Question17();
  Question18();
  Question19();
  Question20();
  Question21();
  Question22();
  Question23();  
  Question24();
  Question25();
  Question26();
  Question27();
  Question28();
  Question29();
  Question30();
  Question31();
  Question32();
  Question33();
  Question34();
  Question35();
  Question36();
  Question37();
  Question38();
  Question39();

  
 }

    public static void  Question01(){
 //1. Solicite ao usuário seu nome e imprima uma mensagem de boas-vindas na tela.
System.out.println("Insira seu nome");
    String nome = s.next();
    System.out.println("Bem Vindo " + nome);

    }

    public static void Question02(){
     //2. Peça ao usuário que digite sua idade em texto (por exemplo, "18") e converta-a em um número inteiro
      System.out.println("Insira sua idade ");
      String a = s.next();
      int  b = Integer.parseInt(a);  
      System.out.println( "Sua idade é " +b);

    }
    public static void Question03(){
      //3. Receba um número inteiro do usuário e converta-o em um número decimal (float).
      System.out.println("Insira seu numero");
      int a = s.nextInt();
       float b =  a ;
       System.out.println(" Seu numero em decimal é " +b);
    }
    public static void Question04(){
      //4. Peça ao usuário para digitar dois números inteiros e exiba a soma deles.
     System.out.println("Insira o  primeiro numero");
      int a = s. nextInt();
      System.out.println("Insira o segundo numero");
     int b = s.nextInt();
     int c = a+b;
     System.out.println("A soma é " +c);
    }

    public static void Question05(){
      //5. Receba um número decimal do usuário e calcule o seu quadrado.
      System.out.println("Insira o seu numero"); 
      float a = s.nextFloat();
       double b = Math.pow(a,2 );
       System.out.println("Seu quadrado é " +b);

    }
    public static void Question06(){
      //6. Peça ao usuário que insira o seu ano de nascimento e, em seguida, exiba a sua idade.
      System.out.println("Insira seu ano de nascimento");
      int nascimento = s.nextInt();
      int idade = 2023 - nascimento;
      System.out.println("Sua idade é " +idade);
    }
    public static void Question07(){
     // 7. Peça ao usuário que digite seu primeiro nome e seu sobrenome separadamente. Em seguida,
   //concatene-os em uma única string e exiba o nome completo.
     System.out.println("Insira seu nome");
     String nome = s.next();
     System.out.println("Insira seu sobrenome");
     String sobrenome = s.next();
     System.out.println( "Seu nome é " +nome +  " " + sobrenome);
     }
    public static void Question08(){
      //8. Solicite ao usuário uma sequência de números separados por espaço e exiba quantos números
      //foram digitados.
      System.out.println("Digite uma sequencai de numeros");
      String a  = s.nextLine();
      int cont =0;
      if (a.length() != 0) {
        cont ++;
        
      }
      for(int i = 0;i<a.length();i++){
       char c = a.charAt(i);
       if (Character.isWhitespace(c)) {
        cont++;
        
       }
      }
      System.out.println("O numero de digitos que voce digitou foi " + cont);
      
    }
    public static void Question09(){
      //9. Receba o nome de um animal digitado pelo usuário e exiba uma mensagem informando qual
      //animal foi digitado.
      System.out.println("Insira o nome de um animal");
      String a = s.next();
      System.out.println("O animal que você falou foi " + a);
    }
    public static void Question10(){
      //10. Peça ao usuário que digite o seu nome e o seu sobrenome. Em seguida, exiba o nome completo
      //invertido (sobrenome, nome).
      System.out.println("Insira seu nome");
      String nome = s.next();
      System.out.println("Insira seu sobrenome");
     String sobrenome = s.next();
     System.out.println("Seu sobrenome é "+ sobrenome + " E seu nome é " + nome);
    }
    public static void Question11(){
      //11. Receba uma string digitada pelo usuário e imprima o seu tamanho (número de caracteres).
      System.out.println("Insira uma palavra ");
      String  a = s.next();
      int b = a.length();
      System.out.println("O numero de caracteres sao " + b);
      
    }
    public static void Question12(){
      //12. Solicite ao usuário um número inteiro e exiba se ele é par ou ímpar.
      System.out.println("Insira um numero ");
      int a = s.nextInt();
      if (a%2 == 0) {
         System.out.println("Seu numero é par");
         
      }else{
         System.out.println("Seu numero é  impar");
      }
    }
    public static void Question13(){
      //13. Receba um número inteiro digitado pelo usuário e verifique se ele é positivo ou negativo.
      System.out.println("Insira um numero");
      int a = s.nextInt();
      if (a>0) {
        System.out.println("Seu numero é positivo");
        
      }else if (a==0) {
        System.out.println("Seu numero é 0");
        
      }else{
        System.out.println("Seu numero é negativo");
      }
    }
    public static void Question14(){
      //14. Peça ao usuário que insira dois números e exiba o maior deles.
      System.out.println("Insira seu primeiro numero");
      int a = s.nextInt();
      System.out.println("Insira seu segundo numero");
      int b = s.nextInt();
      if (a>b) {
        System.out.println(" Seu primeiro numero é maior");
        
      } else{
        System.out.println(" Seu segundo numero é maior");
      }
    }
    public static void Question15(){
      //15. Receba a altura e o peso de uma pessoa digitados pelo usuário. Em seguida, calcule o seu índice de
      //massa corporal (IMC) utilizando a fórmula: IMC = peso / (altura * altura) e exiba o resultado.
      System.out.println("insira sua altura");
      double a = s.nextDouble();
      System.out.println("insira seu peso");
      double b = s.nextDouble();
      double imc = (b)/(a *a);
      System.out.printf( " Seu IMC é " + "%.1f" , imc);
      System.out.println();
    }
    public static void Question16(){
      //16. Peça ao usuário que digite o seu nome e verifique se ele contém mais de 5 caracteres.
      System.out.println("Insira seu nome ");
      String a = s.next();
      if (a.length()>5) {
        System.out.println("Seu nome tem mais de cinco carcateres");

        
      }else if (a.length()==5 ) {
        System.out.println("Seu nome tem cinco caracteres");
        
      } else{
        System.out.println("Seu nome tem menos de cinco caracteres");
      }
    }
    public static void Question17(){
      //16. Peça ao usuário que digite o seu nome e verifique se ele contém mais de 5 caracteres.
      System.out.println("Insira seu estado civil");
      String a = s.nextLine();
      String sol= "solteiro";
      String casado = "casado";
      if (a.equals(sol) ) {
        System.out.println("Você é solteiro(a)");
        
      }else{
        System.out.println("Você é casado(a)");
      }
    }
    public static void Question18(){
      //18. Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule a sua área e
      //exiba o resultado.
      System.out.println("Insira a base ");
      float a = s.nextFloat();
      System.out.println("Insira a altura ");
      float b = s.nextFloat();
      System.out.println("A aréa do retângulo é " + a*b);
    }
    public static void Question19(){
      //19. Peça ao usuário que digite a sua cidade e verifique se ela começa com a letra "S" (ou outra letra de
      //sua escolha).
      System.out.println("Insira o nome da sua cidade");
      String a = s.next();
      char i = a.charAt(0);
      if ( i == 's') {
        System.out.println("Sua cidade começa com a letra S");
        
      }else{
        System.out.println("Sua cidade nao começa com a letra S");
      }
    }
    public static void Question20(){
      //20. Solicite ao usuário que insira dois números decimais e calcule o resto da divisão entre eles.
      System.out.println("Insira o primeiro numero decimal");
      float a = s.nextFloat();
      System.out.println("Insira o segundo numero decimal");
      float b = s.nextFloat();
      System.out.println("o resto da divisão é " + (a%b));
    }
    public static void Question21(){
      //21. Solicite ao usuário um número decimal e converta-o em um número inteiro.
      System.out.println("Insira um numero decimal");
      double a = s.nextDouble();
      int b = (int) a;
      System.out.println("Esse numero nna forma de inteiro é " + b);
    }
    public static void Question22(){
      //22. Receba uma string contendo um número inteiro e some 10 a esse número, convertendo-o
      //novamente para uma string antes de exibi-lo.
      System.out.println("Insira um numero ");
      String a = s.next();
      int b = Integer.parseInt(a);
      b = b+10;
      a = Integer.toString(b);
      System.out.println("Seu numero mais 10 é " +a);

    }
    public static void Question23(){
      //23. Solicite ao usuário que digite uma data no formato "dd/mm/aaaa" e extraia o dia, o mês e o ano
      //separadamente, convertendo-os em números inteiros.
      System.out.println("Insira a data");
      String a = s.next();
      char[] b = a.toCharArray();
      System.out.println("o dia é " + b[0]+b[1]);
      System.out.println("O mes é " + b[3]+b[4]);
      System.out.println("O ano é " + b[6]+b[7]+b[8]+b[9]);
    }
    public static void Question24(){
      //24. Receba o nome de uma cidade do usuário e concatene-o com o nome do estado para formar uma
      //mensagem completa, como "Você mora em [cidade], [estado].".
      System.out.println("Insira sua cidade");
      String a = s.next();
      System.out.println("Insira o estado em que você reside");
      String b = s.next();
      System.out.println("Você mora em " + a + ", " + b);
    }
    public static void Question25(){
      //25. Solicite ao usuário que insira seu ano de nascimento e concatene-o com uma mensagem de
      //boas-vindas, como "Bem-vindo ao nosso programa, nascido em [ano de nascimento]!".
      System.out.println("Insira seu ano de nascimento");
      String a = s.next();
      System.out.println("Bem vindo ao nosso programa nascido em " + a);
    }
    public static void Question26(){
      //26. Receba um número inteiro e uma string do usuário. Em seguida, concatene-os em uma única
      //string, separando-os com um espaço.
      System.out.println("Insira um numero inteiro");
      int a = s.nextInt();
      System.out.println("Insira uma String");
      String b = s.next();
      String c = Integer.toString(a);
      System.out.println(c + " " + b);
    }
    public static void Question27(){
      //27. Receba o nome de um produto digitado pelo usuário e concatene-o com o preço do produto,
      //adicionando o símbolo de moeda da sua escolha.
      System.out.println("Insira o nome do seu produto");
      String a = s.next();
      double  preço = 20.50;
      System.out.println("Seu produto "+a + " custa " + "R$:" + preço);
    }
    public static void Question28(){
      //28. Receba um número inteiro do usuário e concatene-o com uma mensagem, informando o dobro
      //desse número.
      System.out.println("Insira um numero");
      double a = s.nextDouble();
      System.out.printf("O dobro desse numero é "+ "%.1f",a*2);
      System.out.println();

    }
    public static void Question29(){
      //29. Receba uma string contendo um endereço de e-mail e concatene-a com uma mensagem de
      //agradecimento personalizada.
      System.out.println("Insira seu email");
      String a = s.next();
      System.out.println("Muito Obrigado pelo feedback " + a);
    }
    public static void Question30(){
      //30. Receba dois números inteiros do usuário e exiba a soma, a diferença, o produto e o quociente    //(divisão inteira entre eles.
      System.out.println("Insira um numero inteiro");
      int a = s.nextInt();
      System.out.println("Insira seu segundo numero");
      int b = s.nextInt();
      System.out.println("A soma desses numeros  é "+ (a+b) );
      System.out.println("A diferença entre esses numeros é " + (a-b));
      System.out.println("O produto entre esses numeros é " + (a*b));
      System.out.println("O quociente entre esses numeros é " + (a/b));


    }
    public static void Question31(){
      //31. Peça ao usuário para digitar a base e a altura de um triângulo. Em seguida, calcule e exiba a área do
      //triângulo.
      System.out.println("Insira a base do  triangulo ");
      double a = s.nextDouble();
      System.out.println("Insira a altura do triangulo ");
      double b  = s.nextDouble();
      System.out.println("A área do  triangulo é " + ((a*b)/2));

    }
    public static void Question32(){
      //32. Receba o raio de uma circunferência digitado pelo usuário e calcule o seu perímetro (2 * π * raio).
    System.out.println("Insira o raio da circuferencia ");
     double a = s.nextDouble();
     System.out.println("O perimetro da circuferencia é " + (2*3.14*a));

    }
    public static void Question33(){
      //33. Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule e exiba o
      //perímetro do retângulo.
      System.out.println("Insira a base do retangulo");
      double a = s.nextDouble();
      System.out.println("Insira a altura do retangulo");
      double b = s.nextDouble();
      System.out.println("O perimetro do retangulo é " + (2*(a+b)));
    }
    public static void Question34(){
      //34. Solicite ao usuário que insira três números decimais. Em seguida, calcule e exiba a média
      //aritmética desses números.
      System.out.println("Insira o primeiro numero");
      double a = s.nextDouble();
      System.out.println("Insira o segundo numero");
      double b = s.nextDouble();
      System.out.println("Insira o terceiro numero");
      double c = s.nextDouble();
      System.out.println("A media desses numeros é " + ((a+b+c)/3));
    }
    public static void Question35(){
      //35. Peça ao usuário para digitar a sua idade e, em seguida, informe quantos meses e quantos dias ele já
      //viveu (considerando um ano com 365 dias).
      System.out.println("Digite a sua idade");
      int a = s.nextInt();
      System.out.println("Voce ja viveu " + (365*a));
    }
    public static void Question36(){
      //36. Receba um valor em reais e a cotação do dólar digitados pelo usuário. Em seguida, converta o valor
      //para dólares e exiba o resultado.
      System.out.println("Insira um valor em rais");
      double a = s.nextDouble();
      System.out.println("Insira a cotaçao do dolar ");
      double b = s.nextDouble();
      System.out.println("O valor convertido é " +"US$" +  (a/b));

    }
    public static void Question37(){
      //37. Solicite ao usuário para digitar um número decimal e arredonde-o para o inteiro mais próximo.
      System.out.println("Insira um numero decimal");
      double a = s.nextDouble();
      int b = (int) a;
      System.out.println("O inteiro mais proximo é " + b);

    }
    public static void Question38(){
      //38. Receba três números inteiros digitados pelo usuário e exiba o resultado da operação (n1 + n2) *
      //n3.
      System.out.println("Insira o primeiro numero inteiro");
      int a = s.nextInt();
      System.out.println("Insira o segundo numero");
      int b = s.nextInt();
      System.out.println("Insira o terceiro numero");
      int c = s.nextInt();
      System.out.println("O valor de (n1+n2)*n3 é" + ((a+b)*c));

    }
    public static void Question39(){
      //39. Peça ao usuário que digite uma temperatura em graus Celsius e a converta para Fahrenheit usando
      //a fórmula: Fahrenheit = (Celsius * 9/5) + 32.
      System.out.println("Insira uma temperatura em celsius");
      double a = s.nextDouble();
      System.out.println("Sua temperatura em fahrenheit é " + ((a*(9/5))+32));
    }


}
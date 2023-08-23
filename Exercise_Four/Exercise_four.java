package Exercise_Four;
import java.util.Scanner;

public class Exercise_four {
   static Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
   //Question01();
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
   // utilize  cada questoes individualmente para evitar problemas no scanner

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

     
    if ((a>b) && (a>c) && (b>c)) {
      System.out.println("em ordem crescente " + c + " " + b + " " + a );
    }else if ((a>b) && (a>c) && (c>b)) {
      System.out.println("em ordem crescente " + b + " " + c +" " + a);
    }else if ((b>a) && (b>c) && (a>c)) {
      System.out.println("em ordem crescente " + c + " " + a + " " + b);
    }else if ((b>a) && (b>c) && (c>a)){
      System.out.println("em ordem crescente " + a + " " +c + " " + b);
    }else if ((c>a) && (c>b) && (b>a)) {
      System.out.println("em ordem crescente " + a + " " +b + " " + c);
    }else if ((c>a) && (c>b) && (a>b)) {
      System.out.println("em ordem crescente " + b + " " +a + " "  + c);
    }
     
  }
  public static void Question09(){
    System.out.println("Insira seu peso ");
    double a = s.nextDouble();
    System.out.println("insira sua altura ");
    double b = s.nextDouble();

    double c = a / (b*b);
     
    if (c<18.5) {
      System.out.println("Magreza");
    }else if (c>=18.5 && c<=29.9) {
      System.out.println("Normal");
    }else if (c>=25.0 && c<=29.9) {
      System.out.println("Sobrepeso");
    }else if (c>=30.0  && c<=34.9) {
      System.out.println("Obseidade grau 1");
    }else if (c>=35 && c<=39.9) {
      System.out.println("Obesidade grau 2");
    }else{
      System.out.println("Obesidade grau 3");
    }
     
  }
  public static void Question10(){
    System.out.println("Insira o numero de um mês");
     int a = s.nextInt();

     if (a>0 && a<=12) {
      if (a == 1) {
         System.out.println(" Janeiro");
      }else if (a==2) {
        System.out.println(" Fevereiro");
      }else if (a==3) {
         System.out.println("Março");
      }else if (a==4) {
         System.out.println("Abril");
      }else if (a==5) {
         System.out.println("Maio");
      }else if (a==6) {
         System.out.println("Junho");
      }else if (a==7) {
         System.out.println("Julho");
      }else if (a==8) {
         System.out.println("Agosto");
      }else if (a==9) {
         System.out.println("Setembro");
      }else if (a==10) {
         System.out.println("Outubro");
      }else if (a==11) {
         System.out.println("Novembro");
      }else if (a==12) {
         System.out.println("Dezembro");
      }
     }else{
      System.out.println("Mês não encontrado");
     
     }
      
     
  }
  public static void Question11(){
     System.out.println("Insira o salario  sem pontos ex : 1500");
     int a = s.nextInt();
     double r  = 0;

     if (a>=1500) {
         r = a + (a*(0.1));
      System.out.println(" Seu novo salario é " + r);
     }else {
      r = a + (a*(0.15));
      System.out.println(" Seu novo salario é " + r);
     }
  }
  public static void Question12(){
    System.out.println("Insira um numero");
     double  a = s.nextDouble();

     if (a%3 == 0 && a%5 == 0) {
      System.out.println("Seu numero é divisivel por 3 e 5");
     }else {
      System.out.println("Seu numero nao é divisisel por 3 e 5");
     }
  }
  public static void Question13(){
    System.out.println("Escreva por extenso um dia da semana");
    String a = s.nextLine();
     String segunda = "segunda";
      String terça = "terça";
       String quarta = "quarta";
        String quinta = "quinta";
         String sexta = "sexta";
          String sabado = "sabado";
           

    if (a.compareTo(segunda) == 0) {
      System.out.println("É dia util");
    }else if (a.compareTo(terça) == 0) {
      System.out.println("É dia util");
    }else if (a.compareTo(quarta) == 0) {
      System.out.println("É dia util");
    }else if (a.compareTo(quinta) == 0) {
      System.out.println("É dia util");
    }else if (a.compareTo(sexta) == 0) {
      System.out.println("É dia util");
    }else if (a.compareTo(sabado) == 0) {
      System.out.println("Não é dia util");
    }else{
     System.out.println("Não é dia util");
    }

  } public static void Question14(){
     System.out.println("Insira um numero");
     int a = s.nextInt();
     if (a>=1 && a<=5) {
      switch (a) {
        case 1:
        System.out.println("Muito insuficiente");
          break;
         case 2:
         System.out.println("Insuficiente");
         break;
         case 3:
         System.out.println("Regular");
         break;
         case 4:
         System.out.println("Bom");
         break;
         case 5:
         System.out.println("Muito bom ");
         break;
        
      }
     }
  }
  public static void Question15(){
    System.out.println("insira um numero");
    int a = s.nextInt();

    switch (a) {
      case 1:
        System.out.println("Seu dia é domingo");
        break;
        case 2:
        System.out.println("Seu dia é segunda");
        break;
          case 3:
        System.out.println("Seu dia é terça");
        break;
          case 4:
        System.out.println("Seu dia é quarta");
        break;
          case 5:
        System.out.println("Seu dia é quinta");
        break;
          case 6:
        System.out.println("Seu dia é sexta");
        break;
          case 7:
        System.out.println("Seu dia é sabado");
        break;
      default:
      System.out.println("Nao é um numero valido");
        break;
    }
     
  } public static void Question16(){
    System.out.println("Insira um numero decimal");
    double a = s.nextDouble();

   try {
      System.out.println("o inteiro mais proximo é " + Math.round(a));
    } catch (Exception e) {
     System.out.println("algo esta errado");
    }
     
  } public static void Question17(){
    System.out.println("Insira sua idade ");
    int a = s.nextInt();

    if (a==0 && a==1 ) {
      System.out.println("Você é um bebê");
      
    }else if (a>1  && a<=12) {
      System.out.println("Você é uma criança");
    }else if (a>=13 && a<=18) {
      System.out.println("Você é um adolescente");
    }else {
      System.out.println("Você é um adulto");
    }
     
  } public static void Question18(){
    System.out.println("Insira seu estado civil");
    String a = s.nextLine();
    
    switch (a) {
      case "solteiro":
        System.out.println("Você é solteiro");
        break;
        case "casado":
        System.out.println("Você é casado");
        break;
        case "divorciado":
        System.out.println("Você é divorciado");
        break;
        case "viuvo":
        System.out.println("Você é viuvo");
        break;
    
      default:
      System.out.println("estado civil nao encontrado tente no masculino ex: solteiro");
        break;
    }
  } public static void Question19(){
     System.out.println("Insira o primeiro numero");
     int a = s.nextInt();
     System.out.println("Insira o segundo numero");
     int b = s.nextInt();
     System.out.println("insira uma opçao");
     System.out.println(" 1- soma , 2-subtração , 3-multiplicação , 4-divisão");
     int c = s.nextInt();

     switch (c) {
      case 1:
        System.out.println("Sua soma é " + (a+b));
        break;
      case 2:
        System.out.println("Sua subtração é " + (a-b));
        break;
         case 3:
        System.out.println("Sua multiplicação é " + (a*b));
        break;
         case 4:
        System.out.println("Sua divisão é " + (a/b));
        break;
      default:
      System.out.println("Opção invalida");
        break;
     }
  } public static void Question20(){
    try {
    System.out.println("Insira seu nome ");
    String a = s.next();
    System.out.println("Insira sua idade");
    int b = s.nextInt();
    
      
    } catch (Exception e) {
      System.out.println("idade invalida ");
    }
     
  } public static  void Question21(){
     try {
      System.out.println("Insira um valor me metros");
      double a = s.nextDouble();

      System.out.println("Seu valor em  centimetros é " + (a*100));
      System.out.println("Seu valor em milimetros é " + (a*1000));
      System.out.println("Seu valor em quilometros é " + (a/1000));
     } catch (Exception e) {
      System.out.println("valor não é possivel  tente novamente ");
     }
  }


   
}
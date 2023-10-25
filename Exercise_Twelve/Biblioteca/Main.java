package Exercise_Twelve.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dia  = 0;
        int mes = 0;
        int ano = 0;
        
        Scanner s = new Scanner(System.in);
         
        System.out.println("Bem vindo a biblioteca :)");
        Menu();
        int opcao = s.nextInt();
        Livro one;
         Dvd two ;
        Revista three;
        one = new Livro("one pedaço " , 1989, 2, "Oda ");
        two = new Dvd("Atack on minions", 2006, 8, 96);
        three = new Revista("VejaBem", 1979, 10, "De inverno");

        switch (opcao){
        case 1:
        System.out.println("Insira o dia de devoluçao");
        dia = s.nextInt();
        System.out.println("Insira mes de devolução");
        mes = s.nextInt();
        System.out.println("Insira o ano de devolução");
        ano = s.nextInt();
        if (dia <=0 && dia>=31 && mes <= 0 && mes>=13   ) {
            System.out.println("Error");
        }
        one.pegarEmprestado();
        break;
        case 2:
         System.out.println("Insira o dia de devoluçao");
        dia = s.nextInt();
        System.out.println("Insira mes de devolução");
        mes = s.nextInt();
        System.out.println("Insira o ano de devolução");
        ano = s.nextInt();
        
        two.pegarEmprestado();
        break;
        case 3:
         System.out.println("Insira o dia de devoluçao");
        dia = s.nextInt();
        System.out.println("Insira mes de devolução");
        mes = s.nextInt();
        System.out.println("Insira o ano de devolução");
        ano = s.nextInt();
         
        three.pegarEmprestado();
        break;
        default:
        System.out.println("Error");
        break;
        }
         int diahoje;
         int meshoje;
         int anohoje;

        devolverMenu();
        opcao = s.nextInt();
        switch (opcao){
            case 1:
            System.out.println("Insira o dia de hoje ");
            diahoje = s.nextInt();
            System.out.println("Insira o mes de hoje ");
            meshoje = s.nextInt();
            System.out.println("Insira o ano de hoje ");
            anohoje = s.nextInt();
            if (dia <=0 || dia>=31 || mes <= 0 || mes>=13   ) {
            System.out.println("Error");
            }
            if (one.entregaCorreta(dia,mes,ano,diahoje,meshoje,anohoje) == true ) {
                one.devolverEmprestado();
                System.out.println("Tudo certo");
            }else{
                one.calcularMulta(dia, mes, ano, diahoje, meshoje, anohoje);
                one.devolverEmprestado();
                System.out.printf("Pague  a multa de valor " +"%.2f", one.calcularMulta(dia, mes, ano, diahoje, meshoje, anohoje));
               
                one.devolverEmprestado();
            }
            
            
            break;
            case 2:
            System.out.println("Insira o dia de hoje ");
            diahoje = s.nextInt();
            System.out.println("Insira o mes de hoje ");
            meshoje = s.nextInt();
            System.out.println("Insira o ano de hoje ");
            anohoje = s.nextInt();
            if (dia <=0 && dia>=31 && mes <= 0 && mes>=13   ) {
            System.out.println("Error");
            }
            if(two.entregaCorreta(dia, mes, ano, diahoje, meshoje, anohoje) == true){
                two.devolverEmprestado();
            System.out.println("Tudo certo ");
            }else{
                two.calcularMulta(dia, mes, ano, diahoje, meshoje, anohoje);
                two.devolverEmprestado();
                System.out.printf("Pague  a multa de valor " +"%.2f", two.calcularMulta(dia, mes, ano, diahoje, meshoje, anohoje));
            }
            
            
            break;
            case 3:
            System.out.println("Insira o dia de hoje ");
            diahoje = s.nextInt();
            System.out.println("Insira o mes de hoje ");
            meshoje = s.nextInt();
            System.out.println("Insira o ano de hoje ");
            anohoje = s.nextInt();
            if (dia <=0 && dia>=31 && mes <= 0 && mes>=13   ) {
            System.out.println("Error");
            }
           if (three.entregaCorreta(dia, mes, ano, diahoje, meshoje, anohoje)) {
            System.out.println("Ok");
            three.devolverEmprestado();
           } else {
            three.calcularMulta(dia, mes, ano, diahoje, meshoje, anohoje);
            three.devolverEmprestado();
             System.out.printf("Pague  a multa de valor " +"%.2f", three.calcularMulta(dia, mes, ano, diahoje, meshoje, anohoje));
           }
            
            break;
            default:
            System.out.println("Error");
            break;
            
        }

          
    }

    public static void Menu(){
    System.out.println( "Siga as instruções ");
    System.out.println(" 1 - para pedir emprestador um livro");
    System.out.println(" 2 - para  pedir emprestador um DVD");
    System.out.println(" 3 - para pedir emprestador uma revista");
    }

    public  static void devolverMenu(){
         System.out.println( "Siga as instruções ");
    System.out.println(" 1 - para devolver um livro");
    System.out.println(" 2 - para  devolver um DVD");
    System.out.println(" 3 - para devolver uma revista");
    }
}

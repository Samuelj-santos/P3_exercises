package Exercise_Seven.Question_03;

public class Main {
    public static void main(String[] args) {
        Lutador ryu = new Lutador("Ryu", 100, 10);
        Lutador bison = new Lutador("Bison",100, 12);

        ryu.aplicarGolpe(bison);
         System.out.println(bison.getEnergia());
        ryu.aplicarGolpe(bison);
         System.out.println(bison.getEnergia());
        ryu.aplicarGolpe(bison);
        System.out.println(bison.getEnergia());

        bison.aplicarGolpe(ryu);
         System.out.println(ryu.getEnergia());
        bison.aplicarGolpe(ryu);
         System.out.println(ryu.getEnergia());
        bison.aplicarGolpe(ryu);
         System.out.println(ryu.getEnergia());
        bison.aplicarGolpe(ryu);
         System.out.println(ryu.getEnergia());
        bison.aplicarGolpe(ryu);
         System.out.println(ryu.getEnergia());
        bison.aplicarGolpe(ryu);
         System.out.println(ryu.getEnergia());
        bison.aplicarGolpe(ryu);
         System.out.println(ryu.getEnergia());
        bison.aplicarGolpe(ryu);
        System.out.println(ryu.getEnergia());
          


    }
    }
    

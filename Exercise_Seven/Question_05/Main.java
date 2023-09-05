package Exercise_Seven.Question_05;

public class Main {
    public static void main(String[] args) {
        
        Aluno andre = new Aluno("André", "815.769.425-86");

       
        double media = andre.calcularMedia(6, 5, 7, 8);

        System.out.printf( "Sua media é " + "%.1f",media);

        andre.setNota2(10);
        System.out.println();
        media = andre.calcularMedia(6, 10, 7, 8);
        System.out.printf("Sua media nova é " + "%.1f" , media);

    }
}

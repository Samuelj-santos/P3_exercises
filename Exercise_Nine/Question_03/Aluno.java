package Exercise_Nine.Question_03;

import java.util.Scanner;

public class Aluno {
    private String nome;
    public String getNome() {
        return nome;
    }



    private int matricula;
    private double[] notas;
    private double media;

    public double getMedia() {
      
        return this.media;
    }

    

    public Aluno(String nome, int matricula , int qntdProvas) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = 0.0;
        this.notas = new double[qntdProvas];
    }
    // abstrai , nao precisa de um vetor com as notas se ele for usado no main
    public void calcularMedia(double[] qtdnotas){
        double soma = 0.0;
       for(int i =0;i<this.notas.length;i++){
        soma = soma + qtdnotas[i];
       }
       this.media = soma/qtdnotas.length;
    }

    

    @Override
    public String toString(){
      return "O aluno "+ this.nome+ " de matricula"+ this.matricula;
    }


   

}

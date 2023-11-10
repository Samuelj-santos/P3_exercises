package Exercise_Thirteen.Question_01;

 public class Circulo {
    private double raio;
    private double area ;

    public double getArea() {
        this.area = Math.PI * (Math.pow(this.raio, 2));
        return area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public String toString(){
        return "A area do circulo é " + this.getArea();
    }

    
    
}

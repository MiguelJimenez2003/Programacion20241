package co.uniquindio.ingesis;

public class Cuadrado implements Calculable{
    
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    } 
}

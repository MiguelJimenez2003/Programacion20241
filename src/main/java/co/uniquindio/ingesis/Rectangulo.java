package co.uniquindio.ingesis;

public class Rectangulo extends Forma{
    
    private double ancho;
    private double altura;
    
    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return altura*ancho;
    }

    
}

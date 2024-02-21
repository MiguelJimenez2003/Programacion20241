package co.uniquindio.ingesis;

public class Main {

    public static void imprimirArea(Forma forma){
        System.out.println("El area es: "+forma.calcularArea());
    } 

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(2, 3);
        imprimirArea(rectangulo);
        


        /*
         * Calculadora calculadora1 = new Calculadora();
        Impresora impresora1 = new Impresora();
        int a = 1;
        int b = 1;
        int suma= calculadora1.sumar(a,b);
        impresora1.imprimirResultado("suma", suma);
        int resta= calculadora1.restar(a,b);
        impresora1.imprimirResultado("resta", resta);
         */
        
        /*
         *  //Crear un circulo y calcular su área y perímetro
         Circulo circulo = new Circulo(9);
         System.out.println("El area del circulo es: "+circulo.calcularArea());
         System.out.println("El perimetro del circulo es: "+circulo.calcularPerimetro());
        
         //Crear un cuadrado y calcular su área
         Cuadrado cuadrado = new Cuadrado(4);
         System.out.println("El area del cuadrado es: "+cuadrado.calcularArea());

         */



        

    }
}
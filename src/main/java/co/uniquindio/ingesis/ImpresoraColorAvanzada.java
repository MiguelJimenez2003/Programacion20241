package co.uniquindio.ingesis;

public class ImpresoraColorAvanzada implements ImpresoraColor, Escaner{
    
    @Override
    public void imprimirColor (String documento){
        System.out.println("Imprimiendo a color: "+documento);
    }

    @Override
    public void escanear (String documento){
        System.out.println("Escaneando: "+documento);
    }
}

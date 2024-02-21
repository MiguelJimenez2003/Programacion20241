package co.uniquindio.ingesis;

public class ImpresoraBlancoNegroSimple implements ImpresoraBlancoYNegro {
    @Override
    public void imprimirBlancoYNegro(String documento){
        System.out.println("Imprimiendo en blanco y negro: "+documento);
    }

}

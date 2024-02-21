package co.uniquindio.ingesis;

public class Alarma implements Dispositivo{
    
    @Override
    public void activar() {
        System.out.println("Alarma activada");
    }

    @Override
    public void desactivar() {
        System.out.println("Alarma desactivada");
    }
}

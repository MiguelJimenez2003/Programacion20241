package co.uniquindio.ingesis;

public class Boton {
    
    private Dispositivo dispositivo;

    public Boton(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void presionar() {
        dispositivo.activar();
    }
}

package Clases;

/**
 *
 * @author Luis Carrasco
 * @version 14-12-2023
 */
public class Eventos {
    protected boolean evento;
    protected int asistente,mesas,precio;
    protected String tamañoResionto;

    public Eventos() {
    }

    public Eventos(boolean evento, int asistente, int mesas, int precio, String tamañoResionto) {
        this.evento = evento;
        this.asistente = asistente;
        this.mesas = mesas;
        this.precio = precio;
        this.tamañoResionto = tamañoResionto;
    }

    public boolean isEvento() {
        return evento;
    }

    public void setEvento(boolean evento) {
        this.evento = evento;
    }

    public int getAsistente() {
        return asistente;
    }

    public void setAsistente(int asistente) {
        this.asistente = asistente;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTamañoResionto() {
        return tamañoResionto;
    }

    public void setTamañoResionto(String tamañoResionto) {
        this.tamañoResionto = tamañoResionto;
    }

    @Override
    public String toString() {
        return "Eventos{" + "evento=" + evento + ", asistente=" + asistente + ", mesas=" + mesas + ", precio=" + precio + ", tama\u00f1oResionto=" + tamañoResionto + '}';
    }
    
    
}

package Clases;

/**
 *
 * @author Luis Carrasco
 * @version 14-12-2023
 */
public class Fiesta extends Eventos implements Iregistrar{
    private boolean barAlcol;
    private int nDjsEscena;

    public Fiesta() {
    }

    public Fiesta(boolean barAlcol, int nDjsEscena, boolean evento, int asistente, int mesas, int precio, String tamañoResionto) {
        super(evento, asistente, mesas, precio, tamañoResionto);
        this.barAlcol = barAlcol;
        this.nDjsEscena = nDjsEscena;
    }

    public boolean isBarAlcol() {
        return barAlcol;
    }

    public void setBarAlcol(boolean barAlcol) {
        this.barAlcol = barAlcol;
    }

    public int getnDjsEscena() {
        return nDjsEscena;
    }

    public void setnDjsEscena(int nDjsEscena) {
        this.nDjsEscena = nDjsEscena;
    }

    @Override
    public String toString() {
        return super.toString()+"Fiesta{" + "barAlcol=" + barAlcol + ", nDjsEscena=" + nDjsEscena + '}';
    }
    
    
    
}

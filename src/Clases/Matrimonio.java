package Clases;

/**
 *
 * @author Luis Carrasco
 * @version 14-12-2023
 */
public class Matrimonio extends Eventos implements Iregistrar{
    private int cantPlatos;
    private boolean MusicaVivo;

    public Matrimonio() {
    }

    public Matrimonio(int cantPlatos, boolean MusicaVivo, boolean evento, int asistente, int mesas, int precio, String tamañoResionto) {
        super(evento, asistente, mesas, precio, tamañoResionto);
        this.cantPlatos = cantPlatos;
        this.MusicaVivo = MusicaVivo;
    }

    public int getCantPlatos() {
        return cantPlatos;
    }

    public void setCantPlatos(int cantPlatos) {
        this.cantPlatos = cantPlatos;
    }

    public boolean isMusicaVivo() {
        return MusicaVivo;
    }

    public void setMusicaVivo(boolean MusicaVivo) {
        this.MusicaVivo = MusicaVivo;
    }

    @Override
    public String toString() {
        return super.toString()+"Matrimonio{" + "cantPlatos=" + cantPlatos + ", MusicaVivo=" + MusicaVivo + '}';
    }
    
    
}

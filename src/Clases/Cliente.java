package Clases;
/**
 *
 * @author Luis Carrasco
 * @version 14-12-2023
 */
public class Cliente {
    private String nombreCompleto,correo;
    private int rut,telefono;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, String correo, int rut, int telefono) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.rut = rut;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCompleto=" + nombreCompleto + ", correo=" + correo + ", rut=" + rut + ", telefono=" + telefono + '}';
    }


}



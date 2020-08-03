
package Modelo;

/**
 *
 * @author Alex
 */
public class Usuario {
    private int idusuario;
    private String nombre;
    private String usuario;
    private String contrasenia;
    private String estado;

    public Usuario() {
    }

    public Usuario(int idusuario, String nombre, String usuario, String contrasenia, String estado) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.estado = estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}

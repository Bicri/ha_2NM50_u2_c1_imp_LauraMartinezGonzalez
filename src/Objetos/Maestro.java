
package Objetos;

public class Maestro extends Persona{
    private String contraseña;
    private int usuario;
    
    public Maestro()
    {
        super();
    }

    public Maestro(String contraseña, int usuario, String nombre, String primerAp, String segundoAp) {
        super(nombre, primerAp, segundoAp);
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return super.toString()+" Maestro{" + "contrase\u00f1a=" + contraseña + ", usuario=" + usuario + '}';
    }
    
    
}

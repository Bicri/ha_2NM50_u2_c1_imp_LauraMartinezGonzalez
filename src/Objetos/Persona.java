
package Objetos;


public class Persona {
    protected String nombre, primerAp, segundoAp;

    public Persona() {
    }

    public Persona(String nombre, String primerAp, String segundoAp) {
        this.nombre = nombre;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerAp() {
        return primerAp;
    }

    public void setPrimerAp(String primerAp) {
        this.primerAp = primerAp;
    }

    public String getSegundoAp() {
        return segundoAp;
    }

    public void setSegundoAp(String segundoAp) {
        this.segundoAp = segundoAp;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", primerAp=" + primerAp + ", segundoAp=" + segundoAp + '}';
    }
    
    
}

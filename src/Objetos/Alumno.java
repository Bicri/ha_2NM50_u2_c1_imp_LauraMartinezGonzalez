
package Objetos;


public class Alumno extends Persona{
    
    private int  matricula;

    public Alumno() {
        super();
    }

    public Alumno(int matricula, String nombre, String primerAp, String segundoAp) {
        super(nombre, primerAp, segundoAp);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString()+" Alumno{" + "matricula=" + matricula + '}';
    }

    
}
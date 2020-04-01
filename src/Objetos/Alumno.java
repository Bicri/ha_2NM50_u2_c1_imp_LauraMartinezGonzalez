
package Objetos;


public class Alumno {
    
    private int  matricula;
    private String nombre, primer_apellido, segundo_apellido;
    
    public Alumno()
    {
        
    }
    
    public Alumno(int matricula, String nombre, String primer_apellido, String segundo_apellido)
    {
        this.matricula = matricula;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ". Nombre: " + nombre + ". Primer Apellido: " + primer_apellido + ". Segundo Apellido: " + segundo_apellido + "." ;
    } 
}
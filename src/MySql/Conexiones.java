
package MySql;


import Objetos.Alumno;
import com.mysql.jdbc.Connection;
import java.util.List;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class Conexiones {
    
        Connection con;
        PreparedStatement st = null;
        ResultSet result = null;
        
        List <Alumno> listaAlumno = new ArrayList<>();
        int boleta;  String nombre, pat, mat;

        
        public List <Alumno> getLista()
        {
            return  listaAlumno;
        }
        public void limpiaLista()
        {
            listaAlumno.clear();
        }
        
        public  void conectar() 
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionalumnos", "root", "root01");
                System.out.println("CONECTADO");
            }catch(ClassNotFoundException | SQLException e)
            {
                System.out.println("Error al conectar \n"+e);
            }
        }
        
        public  void desconectar()
        {
            try{
                con.close();
                System.out.println("DESCONECTADO");
            }catch(SQLException ex)
            {
                System.out.println("ERROR AL DESCONECTAR "+ex);
            }
        }
        
        public  void muestra()
        {
            try{
                st = con.prepareStatement("select * from alumnos");
                result = st.executeQuery();
                while(result.next())
                {
                    boleta = result.getInt(1);
                    nombre = result.getString(2);
                    pat = result.getString(3);
                    mat = result.getString(4);
                    listaAlumno.add(new Alumno(boleta,nombre,pat,mat));
                }
                
            }catch(SQLException e)
            {
                System.out.println("Error al mostrar" + e);
            }
        }
        
        public  void muestraDinamica(String palabra)
        {
            try{
                st = con.prepareStatement("select * from alumnos WHERE boleta LIKE '"+palabra+"%' UNION select * from alumnos WHERE nombre LIKE '"+palabra+"%' UNION select * from alumnos WHERE PrimerAp LIKE '"+palabra+"%' UNION select * from alumnos WHERE SegundoAp LIKE '"+palabra+"%'");
                result = st.executeQuery();
                while(result.next())
                {
                    boleta = result.getInt(1);
                    nombre = result.getString(2);
                    pat = result.getString(3);
                    mat = result.getString(4);
                    listaAlumno.add(new Alumno(boleta,nombre,pat,mat));
                }
                
            }catch(SQLException e)
            {
                System.out.println("Error al mostrar" + e);
            }
        }
        
        public void inserta(Alumno alumno)
        {
            try
            {
                st = con.prepareStatement("INSERT INTO alumnos (boleta,nombre,PrimerAp,SegundoAp) VALUES (?,?,?,?)");
                st.setLong(1, alumno.getMatricula());
                st.setString(2, alumno.getNombre());
                st.setString(3, alumno.getPrimer_apellido());
                st.setString(4, alumno.getSegundo_apellido());
                st.execute();
                System.out.println("INSERTADO");
            }catch(SQLException e)
            {
                System.out.println("Error al insertar\n "+ e);
            }
        }
        
        public void elimina(String matricula)
        {
            try
            {
                st = con.prepareStatement("DELETE FROM alumnos WHERE boleta = '"+matricula+"'");
                st.executeUpdate();
                System.out.println("ELIMINADO");
            }catch(SQLException e)
            {
                System.out.println("ERROR AL ELIMINAR\n "+ e);
            }
        }
        
        public void actualiza(Alumno alumno, String id)
        {
            try
            {
                st = con.prepareStatement("UPDATE alumnos SET boleta = '"+alumno.getMatricula()+"', nombre = '"+alumno.getNombre()+"', PrimerAp = '"+alumno.getPrimer_apellido()+"', SegundoAp = '"+alumno.getSegundo_apellido()+"' WHERE boleta='"+id+"'");
                st.executeUpdate();
                System.out.println("ACTUALIZADO");
            }catch(SQLException e)
            {
                System.out.println("Error "+e);
            }
        }
}



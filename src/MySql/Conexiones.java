
package MySql;

import GUI.PanelAgregar;
import Objetos.Alumno;
import Objetos.Maestro;
import com.mysql.jdbc.Connection;
import java.awt.Panel;
import java.util.List;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conexiones {
    
        
        private int port = 3306;
        private String user = "root";
        private String password = "root01";
        private String host = "localhost";
        private String database = "gestionalumnos";
        
        private Connection con;
        private PreparedStatement st = null;
        private ResultSet result = null;
        
        private List <Alumno> listaAlumno = new ArrayList<>();
        private int boleta;  
        private String nombre, pat, mat;

        private boolean respuesta;
        
        
        
        public List <Alumno> getLista()
        {
            return  listaAlumno;
        }
        public void limpiaLista()
        {
            listaAlumno.clear();
        }
        
        private String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false", host, 3306, database);
        public  void conectar() 
        {
            try{
                con = (Connection) DriverManager.getConnection(url, user, password);
                
            }catch(SQLException e)
            {
                System.out.println("Error al conectar \n"+e);
            }
        }
        
        public  void desconectar()
        {
            try{
                con.close();
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
        
        public boolean inserta(Alumno alumno)
        {
            try
            {
                st = con.prepareStatement("INSERT INTO alumnos (boleta,nombre,PrimerAp,SegundoAp) VALUES (?,?,?,?)");
                st.setInt(1, alumno.getMatricula());
                st.setString(2, alumno.getNombre());
                st.setString(3, alumno.getPrimerAp());
                st.setString(4, alumno.getSegundoAp());
                respuesta = st.execute();
            }catch(SQLException e)
            {
                
                System.out.println("Error al insertar\n "+ e);
                JOptionPane.showMessageDialog(null, "PROBABLE ERROR DE LONGITUD EN BOLETA\n"+e);
            }
            
            return respuesta;
        }
        
        public boolean insertaProfe(Maestro m)
        {
            try
            {
                st = con.prepareStatement("INSERT INTO profesor (Numero_economico, nombre, primerAp, segundoAp, contraseña) VALUES (?,?,?,?,?)");
                st.setInt(1, m.getUsuario());
                st.setString(2, m.getNombre());
                st.setString(3, m.getPrimerAp());
                st.setString(4, m.getSegundoAp());
                st.setString(5, m.getContraseña());
                respuesta = st.execute();
            }catch(SQLException e)
            {
                System.out.println("Error: "+e);
            }
            return respuesta;
        }
        
        public void elimina(String matricula)
        {
            try
            {
                st = con.prepareStatement("DELETE FROM alumnos WHERE boleta = '"+matricula+"'");
                st.executeUpdate();
                
            }catch(SQLException e)
            {
                System.out.println("ERROR AL ELIMINAR\n "+ e);
            }
        }
        
        public boolean actualiza(Alumno alumno, String id)
        {
            try
            {
                st = con.prepareStatement("UPDATE alumnos SET boleta = '"+alumno.getMatricula()+"', nombre = '"+alumno.getNombre()+"', PrimerAp = '"+alumno.getPrimerAp()+"', SegundoAp = '"+alumno.getSegundoAp()+"' WHERE boleta='"+id+"'");
                st.executeUpdate();
                respuesta = true;
            }catch(SQLException e)
            {
                respuesta = false;
                System.out.println("Error "+e);
                JOptionPane.showMessageDialog(null, "PROBABLE ERROR DE LONGITUD EN BOLETA\n"+e);
            }
            return respuesta;
        }
        
        public boolean existencia(String boleta)
        {
            try
            {
                st = con.prepareStatement("select boleta from alumnos where boleta = '"+boleta+"'");
                result = st.executeQuery();
                respuesta =  result.next();
            }catch(SQLException e)
            {
                System.out.println("Error de existencia "+e);
            }
            
            return respuesta;
        }
}



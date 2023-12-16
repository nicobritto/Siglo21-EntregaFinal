 
package mx.com.gm.aplicacion_crud;
 
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Main {
    
     
    private Connection conectar=null;
    private final String contrasena = "root";
    private final String usuario = "root";
    private final String db = "taller";
    private final String ip ="localhost";
    private final String puerto ="3306";
    private final String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+db;
    
    public Connection establecerConeccion(){
        try {
             conectar = DriverManager.getConnection(cadena, usuario, contrasena);
             JOptionPane.showMessageDialog(null,"se conecto correcto");
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"no se pudo conectar"+e.toString()); 
        }
        return conectar;
      
    }
    public static void main(String[] args) {
        Main app = new Main(); // Crear una instancia de la clase Main
        app.establecerConeccion(); // Llamar al método para establecer la conexión
        // Puedes realizar más operaciones con la conexión aquí
    }
    
}

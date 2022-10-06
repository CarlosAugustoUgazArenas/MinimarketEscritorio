package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author NOVA9
 */
public class Conexion {
 //Valores para conectarnos a la base de datos
 String DRIVER = "com.mysql.jdbc.Driver";
 String host ="localhost";
 String port = "3306";
 String DB = "minimarket";
 String USUARIO = "root";
 String PASSWORD = "";
 String SSL="?useSSL=false";
 String url ="jdbc:mysql://" + host + ":" + port + "/" + DB + SSL;
 
 public Connection con;
 public static Conexion instancia;
 
 private Conexion() {
 this.con = null;
 }
 public Connection conectar() {
 try {
 Class.forName(DRIVER);
 this.con = (Connection) DriverManager.getConnection(url,USUARIO, PASSWORD);
 System.out.println("Conectado!");
 } catch (ClassNotFoundException | SQLException e) {
 System.out.println(e.getMessage());
 System.exit(0);
 }
 return this.con;
 }
 public void desconectar() {
 try{
 this.con.close();
 System.out.println("Desconectado");
 }catch(SQLException e){
 System.out.println(e.getMessage());
  }
 }
 public synchronized static Conexion getInstancia() {
 if(instancia==null){
 instancia=new Conexion();
 System.out.println("Se creo Instancia");
 }
 return instancia;
 }
}

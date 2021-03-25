package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection cx;
    String bd = "crudjava";
    String url =  "jdbc:mysql://localhost:3306/"+bd;
    String user = "root";
    String password = "root";

    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cx= (Connection)DriverManager.getConnection(url,user,password);
//            System.out.println("Se conecto satisfactoriamente");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto por motivo: " + ex.getMessage());
        }
        return cx;
    }
    public void desconectar(){
        try {
            cx.close();
//            System.out.println("Se desconecto");
        }catch (SQLException ex){
//            System.out.println("No se pudo cerrar conexion");
        }

    }
    /*public static void main(String[] args){
        Conexion c = new Conexion();
        c.conectar();
        c.desconectar();
    }*/

}

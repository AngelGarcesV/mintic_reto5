package conexion;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class conexion {
    private String dbUrl ;
    private String username ;
    private String password;
    private Connection conn;

    public conexion(){
        this.dbUrl = "jdbc:mysql://localhost:3306/producto";
        this.username = "root";
        this.password = "Arenilla221261";
        this.conn = null;
        try {
            conn = DriverManager.getConnection(this.dbUrl, username, password);
            if (conn != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }}


    //INSERTAR DATOS EN MYSQL

    public void insertarProducto(int cod_producto, String nombre, int val_compra, int val_venta, int cantidad,String categoria) throws SQLException{
        String sql = "INSERT INTO producto (cod_producto , nombre ,val_compra ,val_venta ,cantidad , categoria ) VALUES( ?, ?,  ?,  ?,  ?,  ?)";
        PreparedStatement statement = this.conn.prepareStatement(sql);

        statement.setInt(1, cod_producto);
        statement.setString(2, nombre);
        statement.setInt(3, val_compra);
        statement.setInt(4, val_venta);
        statement.setInt(5, cantidad);
        statement.setString(6, categoria);


        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Inserción exitosa!");
        }
    }


    //LISTAR DE LA BASE DE DATOS//
    public ArrayList<Object> listarDatos() throws SQLException{
        ArrayList<Object> datos = new ArrayList<>();
        String sql = "SELECT * FROM producto";
        Statement statement = this.conn.createStatement();
        ResultSet result = statement.executeQuery(sql);

        //----AGREGAR DATOS AL ARRAYLIST----//

         while (result.next()){
             //System.out.println(result.getInt(1));
              datos.add(result.getInt(1));
              datos.add(result.getString(2));
              datos.add(result.getInt(3));
              datos.add(result.getInt(4));
              datos.add(result.getInt(5));
              datos.add(result.getString(6));
        }
         for (int i = 0; i < datos.size();i++)
         {
             System.out.println(datos.get(i));
         }

        return datos;
    }
    //CONSULTAR BASE DE DATOS POR CODIGO DEL PRODUCTO
    public ArrayList<Object> consultarProducto(int cod_producto)throws SQLException
    {
        ArrayList<Object>Productos = new ArrayList<>();

        //PreparedStatement declaracion = this.conn.prepareStatement(sql);
        //Statement statement = this.conn.createStatement();

        PreparedStatement ps = conn.prepareStatement("SELECT * FROM producto where cod_producto =?");
        ps.setInt(1, cod_producto);
        ResultSet result = ps.executeQuery();



        while(result.next())
        {
            Productos.add(result.getInt(1));
            Productos.add(result.getString(2));
            Productos.add(result.getInt(3));
            Productos.add(result.getInt(4));
            Productos.add(result.getInt(5));
            Productos.add(result.getString(6));
        }
        for (int i = 0; i < Productos.size();i++)
        {
            System.out.println(Productos.get(i));
        }



        return Productos;
    }



    //ACTUALIZACION DE LA BASE DE DATOS
    public void actualizacionDatos(String nombre,int val_compra,int val_venta, int cantidad, String categoria, int cod_producto)throws SQLException{
        String sql = "UPDATE producto SET nombre = ?,val_compra = ?, val_venta =  ?,cantidad = ?,categoria = ? WHERE  cod_producto =  ?";
        PreparedStatement statement = conn.prepareStatement(sql);


        statement.setString(1, nombre);
        statement.setInt(2, val_compra);
        statement.setInt(3, val_venta);
        statement.setInt(4, cantidad);
        statement.setString(5, categoria);
        statement.setInt(6, cod_producto);

        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("El registro fue actualizado exitosamente !");
        }
    }


    //BORRAR DATOS DE LA BASE DE DATOS

    public void eliminarProducto(int cod_producto)throws SQLException{
        String sql = "DELETE FROM producto WHERE cod_producto = ?"  ;
        PreparedStatement statement = this.conn.prepareStatement(sql);

        statement.setInt(1, cod_producto);
        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Borrado exitoso!");
        }
    }


    //getters y setters
    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
}

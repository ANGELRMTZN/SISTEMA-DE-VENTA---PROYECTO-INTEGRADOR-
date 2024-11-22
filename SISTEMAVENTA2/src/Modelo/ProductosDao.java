
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class ProductosDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarProductos(Productos pro) {
    String sql = "INSERT INTO productos (codigo, nombre, marca, talla, color, tipo, descripcion, proveedor, precioVenta, precioCompra, cantidad) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, pro.getCodigo());           // Código del producto
        ps.setString(2, pro.getNombre());           // Nombre del producto
        ps.setString(3, pro.getMarca());            // Marca del producto
        ps.setString(4, pro.getTalla());            // Talla del producto
        ps.setString(5, pro.getColor());            // Color del producto
        ps.setString(6, pro.getTipo());             // Tipo de producto
        ps.setString(7, pro.getDescripcion());      // Descripción del producto
        ps.setString(8, pro.getProveedor());        // Proveedor
        ps.setDouble(9, pro.getPrecioVenta());      // Precio de venta
        ps.setDouble(10, pro.getPrecioCompra());    // Precio de compra
        ps.setInt(11, pro.getCantidad());           // Cantidad
        ps.execute();
        return true;
    } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    

 public void ConsultarProveedor(JComboBox<String> proveedor) {
    String sql = "SELECT nombre, cedula FROM proveedor";  // Asegúrate de que la tabla 'proveedor' tiene una columna 'cedula'.

    try {
        con = cn.getConnection();  // Conexión a la base de datos.
        ps = con.prepareStatement(sql);  // Preparar la consulta SQL.
        rs = ps.executeQuery();  // Ejecutar la consulta.

        while (rs.next()) {  // Mientras haya filas en el resultado.
            String nombre = rs.getString("nombre");  // Obtener el nombre del proveedor.
            String cedula = rs.getString("cedula");  // Obtener la cédula del proveedor.

            // Obtener los últimos 4 dígitos de la cédula.
            String ultimos4Digitos = cedula.length() >= 4 ? cedula.substring(cedula.length() - 4) : cedula;

            // Concatenar el nombre con los últimos 4 dígitos de la cédula.
            String proveedorTexto = nombre + "-" + ultimos4Digitos;

            proveedor.addItem(proveedorTexto);  // Agregar la cadena al JComboBox.
        }
    } catch (SQLException e) {
        System.out.println(e.toString());  // Mostrar el error si ocurre.
    }
}


    
}

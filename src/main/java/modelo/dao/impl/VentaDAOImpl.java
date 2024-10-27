package modelo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import modelo.Venta;
import modelo.conexion.Conexion;
import modelo.dao.VentaDAO;

public class VentaDAOImpl extends Conexion implements VentaDAO{
    
    @Override
    public void create(List<Venta> ventas) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("INSERT INTO ventas(id_cliente, id_empleado, id_producto) VALUES(?, ?, ?)");

            for (Venta v : ventas) {
                declaracion.setInt(1, v.getIdCliente());
                declaracion.setInt(2, v.getIdEmpleado());
                declaracion.setInt(3, v.getIdProducto());
                
                declaracion.addBatch();
            }

            int[] filasAfectadas = declaracion.executeBatch();
            System.out.println(filasAfectadas.length + (filasAfectadas.length > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }

    @Override
    public List<Venta> read() throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<Venta> lista = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("SELECT * FROM ventas");

            resultado = declaracion.executeQuery();
            lista = new LinkedList<>();

            while (resultado.next()) {
                Venta v = new Venta(
                    resultado.getInt("id_venta"),
                    resultado.getInt("id_cliente"),
                    resultado.getInt("id_empleado"),
                    resultado.getInt("id_producto")
                );
                lista.add(v);
            }

        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            if (resultado != null) resultado.close();
            this.desconectar();
        }

        return lista;
    }

    @Override
    public void update(List<Venta> ventas) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("UPDATE ventas SET id_cliente = ?, id_empleado = ?, id_producto = ? WHERE id_venta = ?");

            for (Venta v : ventas) {
                declaracion.setInt(1, v.getIdCliente());
                declaracion.setInt(2, v.getIdEmpleado());
                declaracion.setInt(3, v.getIdProducto());
                
                declaracion.addBatch();
            }

            int[] filasAfectadas = declaracion.executeBatch();
            System.out.println(filasAfectadas.length + (filasAfectadas.length > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }

    @Override
    public void delete(List<Venta> ventas) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("DELETE FROM ventas WHERE id_venta = ?");

            for (Venta v : ventas) {
                declaracion.setInt(1, v.getId());
                declaracion.addBatch();
            }

            int[] filasAfectadas = declaracion.executeBatch();
            System.out.println(filasAfectadas.length + (filasAfectadas.length > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
}

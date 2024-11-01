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
    public long create(Venta v) throws Exception {
        PreparedStatement declaracion = null;
        ResultSet generatedKeys = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("INSERT INTO ventas(id_cliente, id_empleado, id_producto) VALUES(?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            declaracion.setLong(1, v.getIdCliente());
            declaracion.setLong(2, v.getIdEmpleado());
            declaracion.setLong(3, v.getIdProducto());

            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));

            if (filasAfectadas > 0) {
                generatedKeys = declaracion.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getLong(1);
                }
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (generatedKeys != null) generatedKeys.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
        return -1;
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
    public void update(Venta v) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("UPDATE ventas SET id_cliente = ?, id_empleado = ?, id_producto = ? WHERE id_venta = ?");

            declaracion.setLong(1, v.getIdCliente());
            declaracion.setLong(2, v.getIdEmpleado());
            declaracion.setLong(3, v.getIdProducto());

            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }

    @Override
    public void delete(Venta v) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("DELETE FROM ventas WHERE id_venta = ?");

            declaracion.setLong(1, v.getId());
            
            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
}

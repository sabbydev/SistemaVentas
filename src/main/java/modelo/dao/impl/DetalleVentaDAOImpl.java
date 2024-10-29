package modelo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import modelo.DetalleVenta;
import modelo.conexion.Conexion;
import modelo.dao.DetalleVentaDAO;

public class DetalleVentaDAOImpl extends Conexion implements DetalleVentaDAO{

    @Override
    public void create(DetalleVenta dv) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("INSERT INTO detalles_venta(id_venta, id_metodo_pago, precio_unitario, cantidad, monto_total) VALUES()");

            declaracion.setLong(1, dv.getIdVenta());
            declaracion.setLong(2, dv.getIdMetodoPago());
            declaracion.setDouble(3, dv.getPrecioUnitario());
            declaracion.setInt(4, dv.getCantidad());
            declaracion.setDouble(5, dv.getMontoTotal());
                
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
    public List<DetalleVenta> read() throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<DetalleVenta> lista = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("SELECT * FROM detalles_venta");

            resultado = declaracion.executeQuery();
            lista = new LinkedList<>();

            while (resultado.next()) {
                DetalleVenta dv = new DetalleVenta(
                    resultado.getInt("id_detalle_venta"),
                    resultado.getInt("id_venta"),
                    resultado.getInt("id_metodo_pago"),
                    resultado.getDouble("precio_unitario"),
                    resultado.getInt("cantidad"),
                    resultado.getObject("fecha_hora_venta", LocalDateTime.class)
                );
                lista.add(dv);
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
    public void update(DetalleVenta dv) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("INSERT INTO detalles_venta() VALUES()");

         
                
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
    public void delete(long id) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("DELETE FROM ventas WHERE id_detalle_venta = ?");

            declaracion.setLong(1, id);
            
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
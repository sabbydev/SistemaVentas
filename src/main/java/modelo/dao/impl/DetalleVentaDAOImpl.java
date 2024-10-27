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
    public void create(List<DetalleVenta> detallesVenta) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("INSERT INTO detalles_venta() VALUES()");

            for (DetalleVenta dv : detallesVenta) {
                
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
                    resultado.getDouble("precio_unitario"),
                    resultado.getInt("cantidad"),
                    resultado.getObject("fecha_hora_venta", LocalDateTime.class),
                    resultado.getString("metodo_pago")
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
    public void update(List<DetalleVenta> detallesVenta) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("INSERT INTO detalles_venta() VALUES()");

            for (DetalleVenta dv : detallesVenta) {
                
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
    public void delete(List<DetalleVenta> detallesVenta) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("DELETE FROM ventas WHERE id_detalle_venta = ?");

            for (DetalleVenta dv : detallesVenta) {
                declaracion.setInt(1, dv.getId());
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


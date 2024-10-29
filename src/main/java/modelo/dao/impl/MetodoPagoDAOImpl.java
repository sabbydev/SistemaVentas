package modelo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import modelo.MetodoPago;
import modelo.conexion.Conexion;
import modelo.dao.MetodoPagoDAO;

public class MetodoPagoDAOImpl extends Conexion implements MetodoPagoDAO {

    @Override
    public void create(List<MetodoPago> metodosPago) throws Exception {
    PreparedStatement declaracion = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("INSERT INTO metodos_pago(metodo, descripcion, estado) VALUES(?, ?, ?)");

            for (MetodoPago mp : metodosPago) {
                declaracion.setString(1, mp.getNombre());
                declaracion.setString(2, mp.getDescripcion());
                declaracion.setString(3, mp.getEstado());
                
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
    public List<MetodoPago> read() throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<MetodoPago> lista = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("SELECT * FROM metodos_pago");
            resultado = declaracion.executeQuery();
            lista = new LinkedList<>();
            
            while (resultado.next()) {
                MetodoPago mp = new MetodoPago(
                    resultado.getInt("id_metodo_pago"),
                    resultado.getString("metodo"),
                    resultado.getString("descripcion"),
                    resultado.getString("estado")
                );
                lista.add(mp);
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
    public void update(List<MetodoPago> metodosPago) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("UPDATE metodos_pago SET estado = ? WHERE id_metodo_pago = ?");

            for (MetodoPago mp : metodosPago) {
                declaracion.setString(1, mp.getEstado());
                declaracion.setInt(2, mp.getId());
                
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
    public void delete(List<MetodoPago> metodosPago) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("DELETE FROM metodos_pago WHERE id_metodo_pago = ?");

            for (MetodoPago mp : metodosPago) {
                declaracion.setInt(1, mp.getId());
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

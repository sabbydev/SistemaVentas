package modelo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.MetodoPago;
import modelo.conexion.Conexion;
import modelo.dao.MetodoPagoDAO;

public class MetodoPagoDAOImpl extends Conexion implements MetodoPagoDAO {

    @Override
    public void create(MetodoPago mp) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("INSERT INTO metodos_pago(nombre, descripcion, estado) VALUES(?, ?, ?)");

            declaracion.setString(1, mp.getNombre());
            declaracion.setString(2, mp.getDescripcion());
            declaracion.setString(3, mp.getEstado());
                
            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception ex) {
            throw ex;
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
            lista = new ArrayList<>();
            
            while (resultado.next()) {
                MetodoPago mp = new MetodoPago(
                    resultado.getInt("id_metodo_pago"),
                    resultado.getString("nombre"),
                    resultado.getString("descripcion"),
                    resultado.getString("estado")
                );
                lista.add(mp);
            }
            
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (declaracion != null) declaracion.close();
            if (resultado != null) resultado.close();
            this.desconectar();
        }

        return lista;
    }

    @Override
    public void update(MetodoPago mp) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("UPDATE metodos_pago SET estado = ? WHERE id_metodo_pago = ?");

            declaracion.setString(1, mp.getEstado());
            declaracion.setLong(2, mp.getId());

            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception ex) {
            throw ex;
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

            declaracion = this.conexion.prepareStatement("DELETE FROM metodos_pago WHERE id_metodo_pago = ?");

            
            declaracion.setLong(1, id);
            
            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
    
    @Override
    public List<String> obtenerNombresMetodosPago() throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<String> nombres = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("SELECT nombre FROM metodos_pago");
            
            resultado = declaracion.executeQuery();
            
            nombres = new ArrayList<>();
            
            while (resultado.next()) {
                nombres.add(resultado.getString("nombre"));
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (resultado != null) resultado.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
        
        return nombres;
    }
    
    @Override
    public long obtenerIdPorNombre(String nombre) throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        long id = -1;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("SELECT id FROM metodos_pago WHERE nombre = ?");
            declaracion.setString(1, nombre);

            resultado = declaracion.executeQuery();

            if (resultado.next()) {
                id = resultado.getLong("id");
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (resultado != null) resultado.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }

        return id;
    }
}

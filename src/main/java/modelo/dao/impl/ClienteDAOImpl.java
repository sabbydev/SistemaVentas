package modelo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import modelo.Cliente;
import modelo.conexion.Conexion;
import modelo.dao.ClienteDAO;

public class ClienteDAOImpl extends Conexion implements ClienteDAO {

    @Override
    public void create(List<Cliente> clientes) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("INSERT INTO clientes(idDoc, nombre, correo, telefono) VALUES(?, ?, ?, ?)");

            for (Cliente c : clientes) {
                declaracion.setString(1, c.getIdDoc());
                declaracion.setString(2, c.getNombre());
                declaracion.setString(3, c.getCorreo());
                declaracion.setString(4, c.getTelefono());
                
                declaracion.addBatch();
            }

            int[] filas = declaracion.executeBatch();
            System.out.println(filas.length + (filas.length > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }

    @Override
    public List<Cliente> read() throws Exception {
        List<Cliente> lista = null;
        PreparedStatement declaracion = null;
        ResultSet resultado = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("SELECT * FROM clientes");
            resultado = declaracion.executeQuery();

            lista = new LinkedList<>();

            while (resultado.next()) {
                Cliente c = new Cliente(resultado.getInt("id"), resultado.getString("idDoc"));
                c.setNombre(resultado.getString("nombre"));
                c.setCorreo(resultado.getString("correo"));
                c.setTelefono(resultado.getString("telefono"));
                lista.add(c);
            }

            declaracion.close();
            resultado.close();
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
    public void update(List<Cliente> clientes) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("UPDATE clientes SET nombre = ?, correo = ?, telefono = ? WHERE id = ?");

            for (Cliente c : clientes) {
                declaracion.setString(1, c.getNombre());
                declaracion.setString(2, c.getCorreo());
                declaracion.setString(3, c.getTelefono());
                declaracion.setInt(4, c.getId());
                
                declaracion.addBatch();
            }

            int[] filas = declaracion.executeBatch();
            System.out.println(filas.length + (filas.length > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }

    @Override
    public void delete(List<Cliente> clientes) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("DELETE FROM clientes WHERE id = ?");

            for (Cliente c : clientes) {
                declaracion.setInt(1, c.getId());
                declaracion.addBatch();
            }

            int[] filas = declaracion.executeBatch();
            System.out.println(filas.length + (filas.length > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
}

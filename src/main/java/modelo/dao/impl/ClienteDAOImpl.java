package modelo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import modelo.Cliente;
import modelo.conexion.Conexion;
import modelo.dao.ClienteDAO;

public class ClienteDAOImpl extends Conexion implements ClienteDAO{

    @Override
    public void create(Cliente c) throws Exception {
        PreparedStatement declaracion = null;
        
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("INSERT INTO clientes(dni, nombre, correo, telefono) VALUES(?, ?, ?, ?)");
            
            declaracion.setString(1, c.getDni());
            declaracion.setString(2, c.getNombre());
            declaracion.setString(3, c.getCorreo());
            declaracion.setString(4, c.getTelefono());
            
            declaracion.executeUpdate();
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
            
            while(resultado.next()) {
                Cliente c = new Cliente(resultado.getInt("id"), resultado.getString("dni"));
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
    public void update(Cliente c) throws Exception {
        PreparedStatement declaracion = null;
        
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("UPDATE clientes SET nombre = ?, correo = ?, telefono = ? WHERE id = ?");
            
            declaracion.setString(1, c.getNombre());
            declaracion.setString(2, c.getCorreo());
            declaracion.setString(3, c.getTelefono());
            declaracion.setInt(4, c.getId());
            
            declaracion.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }

    @Override
    public void delete(Cliente c) throws Exception {
        PreparedStatement declaracion = null;
        
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("DELETE FROM clientes WHERE id = ?");
            
            declaracion.setInt(1, c.getId());
            
            declaracion.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
}

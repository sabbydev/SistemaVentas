package modelo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;
import modelo.conexion.Conexion;
import modelo.dao.ProductoDAO;

public class ProductoDAOImpl extends Conexion implements ProductoDAO{
    @Override
    public void create(Producto p) throws Exception {
        PreparedStatement declaracion = null;
        
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("INSERT INTO productos(nombre, categoria, precio, descripcion) VALUES(?, ?, ?, ?)");
            
            declaracion.setString(1, p.getNombre());
            declaracion.setString(2, p.getCategoria());
            declaracion.setDouble(3, p.getPrecio());
            declaracion.setString(4, p.getDescripcion());
            
            declaracion.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
    
    @Override
    public List<Producto> read() throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<Producto> lista = null;
        
        try {
            this.conectar();
            declaracion = this.conexion.prepareStatement("SELECT * FROM productos");
            resultado = declaracion.executeQuery();
            
            lista = new ArrayList<>();
            
            while(resultado.next()) {
                Producto p = new Producto(resultado.getInt("id"),
                                            resultado.getString("nombre"),
                                            resultado.getString("categoria"),
                                            resultado.getDouble("precio"),
                                            resultado.getString("descripcion"),
                                            resultado.getObject("fecha_creacion", LocalDateTime.class));
                lista.add(p);
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
    public void update(Producto p) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("UPDATE productos SET nombre = ?, categoria = ?, precio = ?, descripcion = ? WHERE id = ?");
            
            declaracion.setString(1, p.getNombre());
            declaracion.setString(2, p.getCategoria());
            declaracion.setDouble(3, p.getPrecio());
            declaracion.setString(4, p.getDescripcion());
            declaracion.setInt(5, p.getId());
            
            declaracion.execute();
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }

    @Override
    public void delete(Producto p) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("DELETE FROM productos WHERE id = ?");
            
            declaracion.setInt(1, p.getId());
            
            declaracion.execute();
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
}

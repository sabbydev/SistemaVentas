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
    public List<Producto> read() throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<Producto> lista = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("""
                SELECT p1.*
                FROM productos p1
                INNER JOIN (
                    SELECT nombre, MAX(fecha_hora_creacion) AS max_date
                    FROM productos
                    GROUP BY nombre
                ) p2 ON p1.nombre = p2.nombre AND p1.fecha_hora_creacion = p2.max_date
                WHERE p1.id = (
                    SELECT MAX(p3.id)
                    FROM productos p3
                    WHERE p3.nombre = p1.nombre AND p3.fecha_hora_creacion = p1.fecha_hora_creacion
                );
            """);

            resultado = declaracion.executeQuery();
            lista = new ArrayList<>();

            while (resultado.next()) {
                Producto p = new Producto(
                    resultado.getInt("id_producto"),
                    resultado.getString("nombre"),
                    resultado.getString("categoria"),
                    resultado.getDouble("precio"),
                    resultado.getString("descripcion"),
                    resultado.getObject("fecha_hora_creacion", LocalDateTime.class)
                );
                lista.add(p);
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
    public void update(Producto p) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("INSERT INTO productos(nombre, categoria, precio, descripcion) VALUES(?, ?, ?, ?)");

            declaracion.setString(1, p.getNombre());
            declaracion.setString(2, p.getCategoria());
            declaracion.setDouble(3, p.getPrecio());
            declaracion.setString(4, p.getDescripcion());

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
    public void delete(int id) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("DELETE FROM productos WHERE id_producto = ?");

            declaracion.setInt(1, id);
            
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
    public Producto obtenerPorNombre(String nombre) throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        Producto producto = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("""
                SELECT p1.* 
                FROM productos p1 
                WHERE p1.nombre = ? 
                ORDER BY p1.fecha_hora_creacion DESC, p1.id_producto DESC 
                LIMIT 1
            """);
            declaracion.setString(1, nombre);

            resultado = declaracion.executeQuery();

            if (resultado.next()) {
                producto = new Producto(
                    resultado.getInt("id_producto"),
                    resultado.getString("nombre"),
                    resultado.getString("categoria"),
                    resultado.getDouble("precio"),
                    resultado.getString("descripcion"),
                    resultado.getObject("fecha_hora_creacion", LocalDateTime.class)
                );
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (resultado != null) resultado.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }

        return producto;
    }
    
    @Override
    public List<String> obtenerNombresProductosOrdenados() throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<String> nombres = null;

        try {
            this.conectar();
            declaracion = this.conexion.prepareStatement("SELECT nombre FROM productos ORDER BY nombre");
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
    
    public Producto buscarPorNombre(String nombre) throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("SELECT * FROM productos WHERE nombre = ?");
            resultado = declaracion.executeQuery();
            
            if (resultado.next()) {
                return new Producto(
                    resultado.getInt("id_producto"),
                    resultado.getString("nombre"),
                    resultado.getString("categoria"),
                    resultado.getDouble("precio"),
                    resultado.getString("descripcion"),
                    resultado.getObject("fecha_creacion", LocalDateTime.class)
                );
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (resultado != null) resultado.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
        
        return null;
    }
}
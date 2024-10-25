package modelo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import modelo.Empleado;
import modelo.conexion.Conexion;
import modelo.dao.EmpleadoDAO;

public class EmpleadoDAOImpl extends Conexion implements EmpleadoDAO{
    
    @Override
    public void create(Empleado em) throws Exception {
        PreparedStatement declaracion = null;
        
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("INSERT INTO empleados(dni, nombre, correo, cargo, salario) VALUES(?, ?, ?, ?, ?)");
            
            declaracion.setString(1, em.getDni());
            declaracion.setString(2, em.getNombre());
            declaracion.setString(3, em.getCorreo());
            declaracion.setString(4, em.getCargo());
            declaracion.setDouble(5, em.getSalario());
            
            declaracion.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
    
    @Override
    public List<Empleado> read() throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<Empleado> lista = null;
        
        try {
            this.conectar();
            declaracion = this.conexion.prepareStatement("SELECT * FROM empleados");
            resultado = declaracion.executeQuery();
            
            lista = new LinkedList<>();
            
            while(resultado.next()) {
                Empleado em = new Empleado(resultado.getInt("id"),
                                            resultado.getString("dni"),
                                            resultado.getString("nombre"),
                                            resultado.getString("correo"),
                                            resultado.getString("cargo"),
                                            resultado.getDouble("salario"));
                lista.add(em);
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
    public void update(Empleado em) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("UPDATE empleados SET nombre = ?, correo = ?, cargo = ?, salario = ? WHERE id = ?");
            
            declaracion.setString(1, em.getNombre());
            declaracion.setString(2, em.getCorreo());
            declaracion.setString(3, em.getCargo());
            declaracion.setDouble(4, em.getSalario());
            declaracion.setInt(5, em.getId());
            
            declaracion.execute();
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }

    @Override
    public void delete(Empleado em) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("DELETE FROM empleados WHERE id = ?");
            
            declaracion.setInt(1, em.getId());
            
            declaracion.execute();
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
}

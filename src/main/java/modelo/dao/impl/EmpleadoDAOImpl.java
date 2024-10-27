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
    public void create(List<Empleado> empleados) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("INSERT INTO empleados(dni, nombre, correo, rol, salario) VALUES(?, ?, ?, ?, ?)");

            for (Empleado em : empleados) {
                declaracion.setString(1, em.getDni());
                declaracion.setString(2, em.getNombre());
                declaracion.setString(3, em.getCorreo());
                declaracion.setString(4, em.getRol());
                declaracion.setDouble(5, em.getSalario());
                
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
                Empleado em = new Empleado(resultado.getInt("id_empleado"),
                                            resultado.getString("dni"),
                                            resultado.getString("nombre"),
                                            resultado.getString("correo"),
                                            resultado.getString("rol"),
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
    public void update(List<Empleado> empleados) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("UPDATE empleados SET nombre = ?, correo = ?, rol = ?, salario = ? WHERE id_empleado = ?");

            for (Empleado em : empleados) {
                declaracion.setString(1, em.getNombre());
                declaracion.setString(2, em.getCorreo());
                declaracion.setString(3, em.getRol());
                declaracion.setDouble(4, em.getSalario());
                declaracion.setInt(5, em.getId());
                
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
    public void delete(List<Empleado> empleados) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("DELETE FROM empleados WHERE id_empleado = ?");

            for (Empleado em : empleados) {
                declaracion.setInt(1, em.getId());
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
    
    public String getRol(String correo, String dni) throws Exception {
        String rol = null;
        PreparedStatement declaracion = null;
        ResultSet resultado = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("SELECT rol FROM empleados WHERE correo = ? AND dni = ?");
            
            declaracion.setString(1, correo);
            declaracion.setString(2, dni);

            resultado = declaracion.executeQuery();

            if (resultado.next()) {
                rol = resultado.getString("rol");
            } else {
                System.out.println("Empleado no encontrado con el correo y DNI proporcionados.");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (resultado != null) resultado.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }

        return rol;
    }
}

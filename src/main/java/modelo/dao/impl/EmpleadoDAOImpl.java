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
    public void create(Empleado e) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("INSERT INTO empleados(dni, nombre, correo, rol, salario) VALUES(?, ?, ?, ?, ?)");

            declaracion.setString(1, e.getDni());
            declaracion.setString(2, e.getNombre());
            declaracion.setString(3, e.getCorreo());
            declaracion.setString(4, e.getRol());
            declaracion.setDouble(5, e.getSalario());
                
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
    public void update(Empleado e) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("UPDATE empleados SET nombre = ?, correo = ?, rol = ?, salario = ? WHERE id_empleado = ?");

            declaracion.setString(1, e.getNombre());
            declaracion.setString(2, e.getCorreo());
            declaracion.setString(3, e.getRol());
            declaracion.setDouble(4, e.getSalario());
            declaracion.setLong(5, e.getId());

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
            
            declaracion = this.conexion.prepareStatement("DELETE FROM empleados WHERE id_empleado = ?");

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
    public Empleado obtenerEmpleado(long id) throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        Empleado e = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("SELECT id_empleado, rol, nombre, apellido, correo, dni FROM empleados WHERE id_empleado = ?");
            declaracion.setLong(1, id);

            resultado = declaracion.executeQuery();

            if (resultado.next()) {
                e = new Empleado(
                    resultado.getInt("id_empleado"),
                    resultado.getString("dni"),
                    resultado.getString("nombre"),
                    resultado.getString("correo"),
                    resultado.getString("rol"),
                    resultado.getDouble("salario")
                );
            } else {
                System.out.println("Empleado no encontrado con el ID proporcionado.");
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (resultado != null) resultado.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }

        return e;
    }
    
    public Empleado obtenerEmpleado(String correo, String dni) throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        Empleado e = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("SELECT id_empleado, rol FROM empleados WHERE correo = ? AND dni = ?");
            
            declaracion.setString(1, correo);
            declaracion.setString(2, dni);

            resultado = declaracion.executeQuery();

            if (resultado.next()) {
                long idEmpleado = resultado.getLong("id_empleado");
                String rol = resultado.getString("rol");
                
                e = new Empleado(idEmpleado, dni, "", correo, rol, 0);
            } else {
                System.out.println("Empleado no encontrado con el correo y DNI proporcionados.");
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (resultado != null) resultado.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }

        return e;
    }
}

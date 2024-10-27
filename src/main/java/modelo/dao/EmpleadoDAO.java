package modelo.dao;

import java.util.List;
import modelo.Empleado;

public interface EmpleadoDAO {
    public void create(List<Empleado> e) throws Exception;
    public List<Empleado> read() throws Exception;
    public void update(List<Empleado> e) throws Exception;
    public void delete(List<Empleado> e) throws Exception;
}
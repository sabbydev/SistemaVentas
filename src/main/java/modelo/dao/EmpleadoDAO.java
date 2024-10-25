package modelo.dao;

import java.util.List;
import modelo.Empleado;

public interface EmpleadoDAO {
    public void create(Empleado e) throws Exception;
    public List<Empleado> read() throws Exception;
    public void update(Empleado e) throws Exception;
    public void delete(Empleado e) throws Exception;
}

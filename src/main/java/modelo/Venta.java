package modelo;
public class Venta {
    private final long id;
    private final long idCliente;
    private final long idEmpleado;
    private final long idProducto;

    public Venta(long id, long idCliente, long idEmpleado, long idProducto) {
        this.id = id;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.idProducto = idProducto;
    }

    public long getId() {
        return id;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public long getIdProducto() {
        return idProducto;
    }
}

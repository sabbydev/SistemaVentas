package modelo;
public class Venta {
    private final int id;
    private final int idCliente;
    private final int idEmpleado;
    private final int idProducto;

    public Venta(int id, int idCliente, int idEmpleado, int idProducto) {
        this.id = id;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.idProducto = idProducto;
    }

    public int getId() {
        return id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getIdProducto() {
        return idProducto;
    }
}

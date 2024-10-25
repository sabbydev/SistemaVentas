package modelo;
import java.time.LocalDateTime;
public class Venta {
    private final int id;
    private final String idCliente;
    private final String idEmpleado;
    private final int idProducto;
    private final double precioUnitario;
    private final int cantidad;
    private final double montoTotal;
    private final LocalDateTime fechaHora;
    private final String metodoPago;

    public Venta(int id, String idCliente, String idEmpleado, int idProducto, double precioUnitario, int cantidad, double montoTotal, LocalDateTime fechaHora, String metodoPago) {
        this.id = id;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.idProducto = idProducto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.montoTotal = montoTotal;
        this.fechaHora = fechaHora;
        this.metodoPago = metodoPago;
    }

    public int getId() {
        return id;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
}

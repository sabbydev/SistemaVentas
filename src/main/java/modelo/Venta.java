package modelo;
import java.time.LocalDateTime;
public class Venta {
    private final String id;
    private String idCliente;
    private String idEmpleado;
    private String idProducto;
    private double precioUnitario;
    private int cantidad;
    private double montoTotal;
    private LocalDateTime fecha;
    private String metodoPago;

    public Venta(String id, String idCliente, String idEmpleado, String idProducto, double precioUnitario, int cantidad, double montoTotal, LocalDateTime fecha, String metodoPago) {
        this.id = id;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.idProducto = idProducto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.montoTotal = montoTotal;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
    }

    public String getId() {
        return id;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getIdProducto() {
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

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}

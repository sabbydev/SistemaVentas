package modelo;

import java.time.LocalDateTime;

public class DetalleVenta {
    private final int id;
    private final double precioUnitario;
    private final int cantidad;
    private final double montoTotal;
    private final LocalDateTime fechaHora;
    private final String metodoPago;

    public DetalleVenta(int id, double precioUnitario, int cantidad, LocalDateTime fechaHora, String metodoPago) {
        this.id = id;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.montoTotal = precioUnitario * cantidad;
        this.fechaHora = fechaHora;
        this.metodoPago = metodoPago;
    }

    public int getId() {
        return id;
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

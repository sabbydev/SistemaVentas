package modelo;

import java.time.LocalDateTime;

public class DetalleVenta {
    private final long id;
    private final long idVenta;
    private final long idMetodoPago;
    private final double precioUnitario;
    private final int cantidad;
    private final double montoTotal;
    private final LocalDateTime fechaHora;

    public DetalleVenta(long id, long idVenta, long idMetodoPago, double precioUnitario, int cantidad, LocalDateTime fechaHora) {
        this.id = id;
        this.idVenta = idVenta;
        this.idMetodoPago = idMetodoPago;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.montoTotal = precioUnitario * cantidad;
        this.fechaHora = fechaHora;
    }

    public long getId() {
        return id;
    }

    public long getIdVenta() {
        return idVenta;
    }
    
    public long getIdMetodoPago() {
        return idMetodoPago;
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
}
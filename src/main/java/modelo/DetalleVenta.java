package modelo;

import java.time.LocalDateTime;

public class DetalleVenta {
    private final int id;
    private final int idVenta;
    private final int idMetodoPago;
    private final double precioUnitario;
    private final int cantidad;
    private final double montoTotal;
    private final LocalDateTime fechaHora;

    public DetalleVenta(int id, int idVenta, int idMetodoPago, double precioUnitario, int cantidad, LocalDateTime fechaHora) {
        this.id = id;
        this.idVenta = idVenta;
        this.idMetodoPago = idMetodoPago;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.montoTotal = precioUnitario * cantidad;
        this.fechaHora = fechaHora;
    }

    public int getId() {
        return id;
    }

    public int getIdVenta() {
        return idVenta;
    }
    
    public int getIdMetodoPago() {
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

package modelo.dto;

public class DetalleVentaDTO {
    private final long idVenta;
    private final long idMetodoPago;
    private final double precioUnitario;
    private final int cantidad;
    private final double montoTotal;

    public DetalleVentaDTO(long idVenta, long idMetodoPago, double precioUnitario, int cantidad) {
        this.idVenta = idVenta;
        this.idMetodoPago = idMetodoPago;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.montoTotal = precioUnitario * cantidad;
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
}
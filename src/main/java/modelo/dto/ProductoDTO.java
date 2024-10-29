package modelo.dto;

import java.time.LocalDateTime;

public class ProductoDTO {
    private final int id;
    private final String nombre;
    private final String categoria;
    private final double precio;
    private final String descripcion;
    private final LocalDateTime fechaHora;

    public ProductoDTO(int id, String nombre, String categoria, double precio, String descripcion, LocalDateTime fechaHora) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}

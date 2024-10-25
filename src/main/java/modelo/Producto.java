package modelo;

import java.time.LocalDateTime;

public class Producto {
    private final int id;
    private final String nombre;
    private final String categoria;
    private final double precio;
    private final String descripcion;
    private final LocalDateTime fechaHoraCreacion;

    public Producto(int id, String nombre, String categoria, double precio, String descripcion, LocalDateTime fechaHoraCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.descripcion = descripcion;
        this.fechaHoraCreacion = fechaHoraCreacion;
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
    
    public LocalDateTime getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }
}

package modelo.dto;

public class ProductoDTO {
    private final String nombre;
    private final String categoria;
    private final double precio;
    private final String descripcion;

    public ProductoDTO(String nombre, String categoria, double precio, String descripcion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.descripcion = descripcion;
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
}

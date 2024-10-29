package modelo.dto;

import modelo.EstadoMetodoPago;
import modelo.NombreMetodoPago;

public class MetodoPagoDTO {
    private NombreMetodoPago nombre;
    private String descripcion;
    private EstadoMetodoPago estado;

    public MetodoPagoDTO(NombreMetodoPago nombre, String descripcion, EstadoMetodoPago estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public NombreMetodoPago getNombre() {
        return nombre;
    }

    public void setNombre(NombreMetodoPago nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoMetodoPago getEstado() {
        return estado;
    }

    public void setEstado(EstadoMetodoPago estado) {
        this.estado = estado;
    }
}

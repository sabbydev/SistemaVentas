package modelo;
public class MetodoPago {
    private final long id;
    private NombreMetodoPago nombre;
    private String descripcion;
    private EstadoMetodoPago estado;

    public MetodoPago(long id, String nombre, String descripcion, String estado) {
        this.id = id;
        
        try {
            this.nombre = NombreMetodoPago.valueOf(nombre);
        } catch (IllegalArgumentException e) {
            this.nombre = NombreMetodoPago.DESCONOCIDO;
        }
        
        this.descripcion = descripcion;
        
        try {
            this.estado = EstadoMetodoPago.valueOf(estado);
        } catch (IllegalArgumentException e) {
            this.estado = EstadoMetodoPago.ERROR;
        }
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre.name();
    }

    public void setNombre(String nombre) {
        try {
            this.nombre = NombreMetodoPago.valueOf(nombre);
        } catch (IllegalArgumentException e) {
            this.nombre = NombreMetodoPago.DESCONOCIDO;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado.name();
    }

    public void setEstado(String estado) {
        try {
            this.estado = EstadoMetodoPago.valueOf(estado);
        } catch (IllegalArgumentException e) {
            this.estado = EstadoMetodoPago.ERROR;
        }
    }
}

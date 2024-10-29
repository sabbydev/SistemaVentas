package modelo;
public class Cliente {
    private final int id;
    private final String idDoc;
    private String nombre;
    private String correo;
    private String telefono;

    public Cliente(int id, String idDoc, String nombre, String correo, String telefono) {
        this.id = id;
        this.idDoc = idDoc;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public int getId() {
        return id;
    }
    
    public String getIdDoc() {
        return idDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    } 
}
package modelo.dto;
public class EmpleadoDTO {
    private final long id;
    private final String dni;
    private String nombre;
    private String correo;
    private String rol;
    private double salario;

    public EmpleadoDTO(long id, String dni, String nombre, String correo, String rol, double salario) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.salario = salario;
    }

    public long getId() {
        return id;
    }

    public String getDni() {
        return dni;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    } 
}

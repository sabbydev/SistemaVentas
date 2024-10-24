package modelo;
public class Empleado {
    private final String id;
    private final String dni;
    private String nombre;
    private String correo;
    private String cargo;
    private double salario;

    public Empleado(String id, String dni, String correo, String nombre, String cargo, double salario) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String getId() {
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
        return nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}

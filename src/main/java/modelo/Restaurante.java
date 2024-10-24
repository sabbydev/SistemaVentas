package modelo;
import java.util.LinkedList;
public class Restaurante {
    private String ruc;
    private String nombre;
    private String razonSocial;
    private String direccion;
    private String telefono;
    private LinkedList<Cliente> clientes;
    private LinkedList<Empleado> empleados;
    private LinkedList<Producto> productos;
    private LinkedList<Venta> ventas;

    public Restaurante(String ruc, String nombre, String razonSocial, String direccion, String telefono, LinkedList<Cliente> clientes, LinkedList<Empleado> empleados, LinkedList<Producto> productos, LinkedList<Venta> ventas) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clientes = clientes;
        this.empleados = empleados;
        this.productos = productos;
        this.ventas = ventas;
    }

    public String getRuc() {
        return ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public LinkedList<Venta> getVentas() {
        return ventas;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    public void setVentas(LinkedList<Venta> ventas) {
        this.ventas = ventas;
    }    
}

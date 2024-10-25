package modelo;

import java.util.List;

public class Restaurante {
    private String ruc;
    private String nombre;
    private String razonSocial;
    private String direccion;
    private String telefono;
    private final List<Cliente> clientes;
    private final List<Empleado> empleados;
    private final List<Producto> productos;
    private final List<Venta> ventas;

    public Restaurante(String ruc, String nombre, String razonSocial, String direccion, String telefono, List<Cliente> clientes, List<Empleado> empleados, List<Producto> productos, List<Venta> ventas) {
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

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Venta> getVentas() {
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
}

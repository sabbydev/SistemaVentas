package modelo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import modelo.Venta;
import modelo.conexion.Conexion;
import modelo.dao.VentaDAO;

public class VentaDAOImpl extends Conexion implements VentaDAO{
    
    @Override
    public long create(Venta v) throws Exception {
        PreparedStatement declaracion = null;
        ResultSet generatedKeys = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("INSERT INTO ventas(id_cliente, id_empleado, id_producto) VALUES(?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            declaracion.setLong(1, v.getIdCliente());
            declaracion.setLong(2, v.getIdEmpleado());
            declaracion.setLong(3, v.getIdProducto());

            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));

            if (filasAfectadas > 0) {
                generatedKeys = declaracion.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getLong(1);
                }
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (generatedKeys != null) generatedKeys.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
        return -1;
    }

    @Override
    public List<Venta> read() throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<Venta> lista = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("SELECT * FROM ventas");

            resultado = declaracion.executeQuery();
            lista = new LinkedList<>();

            while (resultado.next()) {
                Venta v = new Venta(
                    resultado.getInt("id_venta"),
                    resultado.getInt("id_cliente"),
                    resultado.getInt("id_empleado"),
                    resultado.getInt("id_producto")
                );
                lista.add(v);
            }

        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            if (resultado != null) resultado.close();
            this.desconectar();
        }

        return lista;
    }

    @Override
    public void update(Venta v) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("UPDATE ventas SET id_cliente = ?, id_empleado = ?, id_producto = ? WHERE id_venta = ?");

            declaracion.setLong(1, v.getIdCliente());
            declaracion.setLong(2, v.getIdEmpleado());
            declaracion.setLong(3, v.getIdProducto());

            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }

    @Override
    public void delete(Venta v) throws Exception {
        PreparedStatement declaracion = null;
        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("DELETE FROM ventas WHERE id_venta = ?");

            declaracion.setLong(1, v.getId());
            
            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
    
    public List<Object[]> obtenerVentasConDetalles() throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<Object[]> matriz = null;

        try {
            this.conectar();

            // Query para combinar todas las tablas necesarias con JOIN
            String sql = """
                SELECT 
                    v.id_venta,
                    c.id_doc AS cliente_dni,
                    c.nombre AS cliente_nombre,
                    e.dni AS empleado_dni,
                    e.nombre AS empleado_nombre,
                    p.id_producto AS id_producto,
                    p.nombre AS producto_nombre,
                    dv.precio_unitario,
                    dv.cantidad,
                    dv.monto_total,
                    dv.fecha_hora,
                    mp.nombre AS metodo_pago
                FROM 
                    ventas v
                INNER JOIN 
                    detalle_ventas dv ON v.id_venta = dv.id_venta
                INNER JOIN 
                    clientes c ON v.id_cliente = c.id_cliente
                INNER JOIN 
                    empleados e ON v.id_empleado = e.id_empleado
                INNER JOIN 
                    productos p ON v.id_producto = p.id_producto
                INNER JOIN 
                    metodos_pago mp ON dv.id_metodo_pago = mp.id_metodo_pago
            """;

            declaracion = this.conexion.prepareStatement(sql);
            resultado = declaracion.executeQuery();

            matriz = new LinkedList<>();

            // Obtiene la cantidad de columnas del resultado
            int columnCount = resultado.getMetaData().getColumnCount();

            while (resultado.next()) {
                // Crea un arreglo para almacenar los datos de la fila actual
                Object[] fila = new Object[columnCount];

                // Recorre cada columna de la fila y almacena el valor
                for (int i = 1; i <= columnCount; i++) {
                    fila[i - 1] = resultado.getObject(i);
                }

                // Añade la fila a la matriz
                matriz.add(fila);
            }

        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            if (resultado != null) resultado.close();
            this.desconectar();
        }

        return matriz;
    }
    
    public Venta obtenerVenta(long id) throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        Venta venta = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("SELECT * FROM ventas ORDER BY id_venta = ? DESC LIMIT 1");
            declaracion.setLong(1, id);

            resultado = declaracion.executeQuery();

            if (resultado.next()) {
                venta = new Venta(
                    resultado.getInt("id_venta"),
                    resultado.getInt("id_cliente"),
                    resultado.getInt("id_empleado"),
                    resultado.getInt("id_producto")
                );
            }

        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            if (resultado != null) resultado.close();
            this.desconectar();
        }

        return venta;
    }
}

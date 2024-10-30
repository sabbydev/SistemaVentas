package vista.utilidadesVista;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GestorTablas {
    
    public static void deshabilitarEdicion(JTable tabla) {
        tabla.setDefaultEditor(Object.class, null);
    }
    
    public static void eliminarFilaConConfirmacion(JTable tabla) {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            Window parent = SwingUtilities.windowForComponent(tabla);

            int respuesta = JOptionPane.showConfirmDialog(
                parent,
                "¿Estás seguro de que deseas eliminar esta fila?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            if (respuesta == JOptionPane.YES_OPTION) {
                eliminarFila(tabla, filaSeleccionada);
            }
        }
    }
    
    public static void actualizarTabla(JTable tabla, List<Object[]> filas) {
        vaciarTabla(tabla);
    
        for (Object[] fila : filas) {
            insertarFila(tabla, fila);
        }
    }

    public static void vaciarTabla(JTable tabla) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        int filas = modeloTabla.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }

    public static void insertarFila(JTable tabla, Object[] fila) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        modeloTabla.addRow(fila);
    }
    
    public static void eliminarFila(JTable tabla, int fila) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        modeloTabla.removeRow(fila);
    }
    
    public static double calcularSumaColumna(JTable tabla, int columna) {
        double suma = 0.0;
        
        TableModel model = tabla.getModel();
        
        for (int i = 0; i < model.getRowCount(); i++) {
            String valorString = model.getValueAt(i, columna).toString();
            try {
                double valor = Double.parseDouble(valorString);
                suma += valor;
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el valor: " + valorString);
            }
        }
        
        return suma;
    }
    
    public static List<Integer> obtenerColumnaInt(JTable tabla, int columna) {
        List<Integer> listaColumna = new ArrayList<>();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int numeroFilas = modelo.getRowCount();

        for (int i = 0; i < numeroFilas; i++) {
            Object valorId = modelo.getValueAt(i, columna);
            if (valorId != null) {
                listaColumna.add(Integer.valueOf(valorId.toString()));
            } else {
                System.out.println("No se pudo recuperar el elemento " + (i+1) + " de la columna.");
            }
        }

        return listaColumna;
    }
    
    public static List<Long> obtenerColumnaLong(JTable tabla, int columna) {
        List<Long> listaColumna = new ArrayList<>();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int numeroFilas = modelo.getRowCount();

        for (int i = 0; i < numeroFilas; i++) {
            Object valorId = modelo.getValueAt(i, columna);
            if (valorId != null) {
                listaColumna.add(Long.valueOf(valorId.toString()));
            } else {
                System.out.println("No se pudo recuperar el elemento " + (i+1) + " de la columna.");
            }
        }

        return listaColumna;
    }
}
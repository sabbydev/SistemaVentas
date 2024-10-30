package vista.utilidadesVista;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class GestorEntradasUsuario {
    
    public static void limpiarCampos(JTextField... parametros) {
        for (JTextField t : parametros) {
            t.setText("");
        }
    }
    
    public static void reiniciarSeleccion(JComboBox... parametros) {
        for (JComboBox cb : parametros) {
            cb.setSelectedIndex(0);
        }
    }
}

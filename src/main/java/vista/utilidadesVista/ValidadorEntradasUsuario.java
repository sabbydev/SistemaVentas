package vista.utilidadesVista;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ValidadorEntradasUsuario {

    public static boolean seleccionCbEsValida(JComboBox<String> comboBox, String nombreCampo) {
        if (comboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona una opción en '" + nombreCampo + "'.");
            return false;
        }
        return true;
    }

    public static boolean campoCantidadEsValido(JTextField txtField, String nombreCampo) {
        if (!tieneContenido(txtField, nombreCampo)) {
            return false;
        }

        try {
            int valorInt = Integer.parseInt(txtField.getText());
            if (valorInt <= 0) {
                JOptionPane.showMessageDialog(null, nombreCampo + " debe ser un valor positivo.");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, nombreCampo + " debe ser un valor tipo numérico entero y positivo.");
            return false;
        }
        
        return true;
    }

    public static boolean campoDniRucEsValido(JTextField txtField, String nombreCampo) {
        String texto = txtField.getText().trim();
        String regex = "^[0-9]+$";

        if (!tieneContenido(txtField, nombreCampo)) {
            return false;
        }

        if (!LongitudDniRucValido(txtField, nombreCampo)) {
            return false;
        }

        return cumpleRegex(texto, regex, nombreCampo);
    }

    public static boolean campoNombrePersonaEsValida(JTextField textField, String nombreCampo) {
        if (!tieneContenido(textField, nombreCampo)) {
            return false;
        }

        String regex = "^[\\p{L} .'-]+$"; // Permite letras, espacios y algunos caracteres especiales

        if (!textField.getText().trim().matches(regex)) {
            JOptionPane.showMessageDialog(null,
                "El campo '" + nombreCampo + "' es inválido. Solo se permiten letras, espacios y los caracteres . ' - .",
                "Error de Validación",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    public static boolean campoNombreProductoEsValida(JTextField textField, String nombreCampo) {
        if (!tieneContenido(textField, nombreCampo)) {
            return false;
        }

        String regex = "^[a-zA-Z]+$";

        if (!textField.getText().trim().matches(regex)) {
            JOptionPane.showMessageDialog(null, "El campo " + nombreCampo + " es inválido. Solo se permiten letras sin tildes.");
            return false;
        }

        return true;
    }

    public static boolean campoCorreoEsValido(JTextField textField, String nombreCampo) {
        if (!tieneContenido(textField, nombreCampo)) {
            return false;
        }

        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
        return cumpleRegex(textField.getText().trim(), regex, nombreCampo);
    }
    
    public static boolean campoTelefonoEsValido(JTextField textField, String nombreCampo) {
        if (!tieneContenido(textField, nombreCampo)) {
            return false;
        }

        String regex = "^\\+?\\d{1,4}?[-.\\s]?\\(?\\d{1,4}?\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}$";

        return cumpleRegex(textField.getText().trim(), regex, nombreCampo);
    }
    
    private static boolean LongitudDniRucValido(JTextField textField, String nombreCampo) {
        int longitud = textField.getText().length();

        if (longitud == 8 || longitud == 11) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, nombreCampo + " es inválido. El DNI debe tener exactamente 8 dígitos y el RUC debe tener exactamente 11 dígitos.");
            return false;
        }
    }
    private static boolean tieneContenido(JTextField textField, String nombreCampo) {
        if (textField.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Completa el campo '" + nombreCampo + "'.");
            return false;
        }
        return true;
    }
    private static boolean cumpleRegex(String texto, String regex, String nombreCampo) {
        if (!texto.matches(regex)) {
            JOptionPane.showMessageDialog(null, "El campo " + nombreCampo + " es inválido. Solo se permiten dígitos.");
            return false;
        }
        
        return true;
    }
}
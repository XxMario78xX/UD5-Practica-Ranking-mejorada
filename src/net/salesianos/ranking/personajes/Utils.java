package net.salesianos.ranking.personajes;

import javax.swing.JOptionPane;

public class Utils {

    public static String pedirTexto(String mensaje) {
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null || entrada.trim().isEmpty()) {
                mostrarError("El texto no puede estar vacío. Inténtalo de nuevo.");
            }
        } while (entrada == null || entrada.trim().isEmpty());
        return entrada.trim();
    }

    public static int pedirNumero(String mensaje, int min, int max) {
        int numero = 0;
        boolean valido = false;
        do {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            try {
                numero = Integer.parseInt(entrada);
                if (numero >= min && numero <= max) {
                    valido = true;
                } else {
                    mostrarError("Debe ingresar un número entre " + min + " y " + max + ".");
                }
            } catch (NumberFormatException e) {
                mostrarError("Debe ingresar un número válido.");
            }
        } while (!valido);
        return numero;
    }

    public static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}

import javax.swing.*;
import net.salesianos.ranking.personajes.*;

public class Main {
    public static void main(String[] args) {
        GestorPersonajes gestor = new GestorPersonajes();
        boolean salir = false;

        while (!salir) {
            try {
                String opcion = JOptionPane.showInputDialog("""
                        -------------------------------
                        RANKING - BLACK CLOVER
                        -------------------------------
                        1. Añadir personaje
                        2. Editar personaje
                        3. Mostrar ranking
                        4. Eliminar personaje
                        Q. Salir
                        """);

                if (opcion == null) {
                    Utils.mostrarError("Usa la opción Q para salir.");
                    continue;
                }

                switch (opcion.trim().toUpperCase()) {
                    case "1" -> añadirPersonaje(gestor);
                    case "2" -> {
                        String nombre = Utils.pedirTexto("Nombre del personaje a editar:");
                        if (nombre != null)
                            gestor.editarPersonaje(nombre);
                    }
                    case "3" -> gestor.cargarPersonajesIniciales();
                    case "4" -> {
                        String nombre = Utils.pedirTexto("Nombre del personaje a eliminar:");
                        if (nombre != null)
                            gestor.eliminarPersonaje(nombre);
                    }
                    case "Q" -> salir = true;
                    default -> Utils.mostrarError("Opción no válida.");
                }
            } catch (Exception e) {
                Utils.mostrarError("Error inesperado: " + e.getMessage());
            }
        }

        JOptionPane.showMessageDialog(null, "¡Hasta luego, Adri!");
    }

    private static void añadirPersonaje(GestorPersonajes gestor) {
        String nombre = Utils.pedirTexto("Nombre del personaje:");
        if (nombre == null)
            return;
        String magia = Utils.pedirTexto("Tipo de magia:");
        if (magia == null)
            return;
        String reino = Utils.pedirTexto("Reino de origen:");
        if (reino == null)
            return;
        String rango = Utils.pedirTexto("Rango:");
        if (rango == null)
            return;
        String personalidad = Utils.pedirTexto("Descripción de personalidad:");
        if (personalidad == null)
            return;
        int puntuacion = Utils.pedirNumero("Puntuación (1-5):", 1, 5);
        if (puntuacion == -1)
            return;

        Personaje nuevo = new Personaje(nombre, magia, reino, rango, personalidad, puntuacion);
        gestor.añadirPersonaje(nuevo);
        JOptionPane.showMessageDialog(null, "¡Personaje añadido al ranking!");
    }
}
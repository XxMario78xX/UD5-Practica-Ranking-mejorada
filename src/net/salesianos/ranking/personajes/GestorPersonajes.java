package net.salesianos.ranking.personajes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class GestorPersonajes {

    private ArrayList<Personaje> personajes;


    public GestorPersonajes() {
        personajes = new ArrayList<>();
    }


    public void cargarPersonajesIniciales() {
        try {
            personajes.add(new Personaje("Mereoleona", "Fuego", "Imperio Ardiente", "Alto", "Determinado", 5));
            personajes.add(new Personaje("Asta", "Antimagia", "Gran Reino", "Medio", "Valiente", 4));
            personajes.add(new Personaje("Yami", "Oscuridad", "Tierra de Sombras", "Alto", "Filosófico", 4));
            personajes.add(new Personaje("Luck", "Suerte", "Fortunalia", "Medio", "Optimista", 3));
            personajes.add(new Personaje("Magna", "Fuerza", "Bosques Salvajes", "Bajo", "Impulsivo", 2));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar personajes iniciales: " + e.getMessage());
        }
    }


    public void añadirPersonaje(Personaje p) {
        personajes.add(p);
    }


    public String mostrarPersonajes() {
        if (personajes.isEmpty()) {
            return "No hay personajes para mostrar.";
        }
        ArrayList<Personaje> listaOrdenada = new ArrayList<>(personajes);
        Collections.sort(listaOrdenada);
        StringBuilder sb = new StringBuilder();
        for (Personaje p : listaOrdenada) {
            sb.append(p.toString());
            sb.append("\n-------------------------\n");
        }
        return sb.toString();
    }


    public boolean editarPersonaje(String nombre) {
        for (Personaje p : personajes) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                // Se piden nuevos valores para cada atributo
                String nuevoNombre = Utils.pedirTexto("Nuevo nombre (actual: " + p.getNombre() + "): ");
                String nuevaMagia = Utils.pedirTexto("Nueva magia (actual: " + p.getMagia() + "): ");
                String nuevoReino = Utils.pedirTexto("Nuevo reino (actual: " + p.getReino() + "): ");
                String nuevoRango = Utils.pedirTexto("Nuevo rango (actual: " + p.getRango() + "): ");
                String nuevaPersonalidad = Utils
                        .pedirTexto("Nueva personalidad (actual: " + p.getPersonalidad() + "): ");
                int nuevaPuntuacion = Utils
                        .pedirNumero("Nueva puntuación (actual: " + p.getPuntuacion() + ") - de 1 a 5: ", 1, 5);


                p.setNombre(nuevoNombre);
                p.setMagia(nuevaMagia);
                p.setReino(nuevoReino);
                p.setRango(nuevoRango);
                p.setPersonalidad(nuevaPersonalidad);
                p.setPuntuacion(nuevaPuntuacion);
                return true;
            }
        }
        return false;
    }


    public boolean eliminarPersonaje(String nombre) {
        Iterator<Personaje> it = personajes.iterator();
        while (it.hasNext()) {
            Personaje p = it.next();
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                return true;
            }
        }
        return false;
    }
}

package net.salesianos.ranking.personajes;

public class Personaje implements Comparable<Personaje> {
    private String nombre;
    private String magia;
    private String reino;
    private String rango;
    private String personalidad;
    private int puntuacion;

    public Personaje(String nombre, String magia, String reino, String rango, String personalidad, int puntuacion) {
        this.nombre = nombre;
        this.magia = magia;
        this.reino = reino;
        this.rango = rango;
        this.personalidad = personalidad;
        setPuntuacion(puntuacion); // Valida que la puntuación esté en el rango correcto
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        if (puntuacion < 1 || puntuacion > 5) {
            throw new IllegalArgumentException("La puntuación debe estar entre 1 y 5.");
        }
        this.puntuacion = puntuacion;
    }

    // INtento de poner en rojo a Mereoleona
    public String getNombreFormateado() {
        if ("Mereoleona".equalsIgnoreCase(this.nombre)) {
            return "<html><font color='red'>" + this.nombre + "</font></html>";
        }
        return this.nombre;
    }

    @Override
    public int compareTo(Personaje otro) {
        // El orden
        return Integer.compare(otro.getPuntuacion(), this.puntuacion);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombreFormateado() + "\n" +
                "Magia: " + magia + "\n" +
                "Reino: " + reino + "\n" +
                "Rango: " + rango + "\n" +
                "Personalidad: " + personalidad + "\n" +
                "Puntuación: " + puntuacion;
    }
}
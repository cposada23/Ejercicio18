package com.trainingsofka.ejercicio18;

public class VideoJuego implements Entregable {
    //sontitulo, horas estimadas, entregado, genero y compañia.
    /**
     * Constantes
     */
    private final  String TITULO_BASE = "";
    private final double HORAS_ESTIMADAS = 10.0;
    private final boolean ENTREGADO_BASE = false;
    private final boolean PRESTADO_BASE = false;
    private final String GENERO_BASE = "";
    private final String COMPANIA_BASE = "";




    private String titulo;
    private double horasEstimadas;
    private boolean entregado;
    private boolean prestado;
    private String genero;
    private String compania;

    public VideoJuego() {
        this.titulo = TITULO_BASE;
        this.horasEstimadas = HORAS_ESTIMADAS;
        this.entregado = ENTREGADO_BASE;
        this.genero = GENERO_BASE;
        this.compania = COMPANIA_BASE;
    }

    public VideoJuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = ENTREGADO_BASE;
        this.genero = GENERO_BASE;
        this.compania = COMPANIA_BASE;
    }

    public VideoJuego(String titulo, double horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = ENTREGADO_BASE;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = false;
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.entregado = true;
        this.prestado = false;
    }

    @Override
    public void compareTo(Object a) {
        VideoJuego videoJuego= (VideoJuego)a;
        double horasEstimadas = videoJuego.getHorasEstimadas();
        double diferencia = this.getHorasEstimadas() - horasEstimadas;
        System.out.printf("Diferencia en horas estimadas: %f", Math.abs(diferencia));
    }
}

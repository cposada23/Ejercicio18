

/**
 * @author Camilo Posada Angel
 */

package com.trainingsofka.ejercicio18;

/**
 * Serie
 */
public class Serie implements Entregable{

    /**
     * Constantes
     */

    private final int NUMERO_TEMPORADAS = 3;
    private final String TITULO_BASE = "";
    private final boolean ENTREGADO_BASE = false;
    private final String GENERO_BASE = "";
    private final String CREADOR_BASE = "";


    private String titulo;
    private int numero_temporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.titulo = TITULO_BASE;
        this.numero_temporadas = NUMERO_TEMPORADAS;
        this.entregado = ENTREGADO_BASE;
        this.genero = GENERO_BASE;
        this.creador = CREADOR_BASE;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numero_temporadas = NUMERO_TEMPORADAS;
        this.entregado = ENTREGADO_BASE;
        this.genero = GENERO_BASE;
    }


    public Serie(String titulo, int numero_temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numero_temporadas = numero_temporadas;
        this.entregado = ENTREGADO_BASE;
        this.genero = genero;
        this.creador = creador;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param numero_temporadas the numero_temporadas to set
     */
    public void setNumero_temporadas(int numero_temporadas) {
        this.numero_temporadas = numero_temporadas;
    }

    /**
     * @return the numero_temporadas
     */
    public int getNumero_temporadas() {
        return numero_temporadas;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param creador the creador to set
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * @return the creador
     */
    public String getCreador() {
        return creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numero_temporadas=" + numero_temporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void compareTo(Object a) {
        Serie serie = (Serie)a;
        int nTemporadas = serie.getNumero_temporadas();
        int diferencia = this.getNumero_temporadas() - nTemporadas;
        System.out.printf("Diferencia en el número de temporadas: %f Temporadas", Math.abs(diferencia));
    }
}
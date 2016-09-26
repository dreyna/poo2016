/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author programacion
 */
public class Libro {
    private int cod;
    private String titulo;
    private String autor;
    private int nejemplares;
    private int eprestados;

    public Libro(int cod, String titulo, String autor, int nejemplares, int eprestados) {
        this.cod = cod;
        this.titulo = titulo;
        this.autor = autor;
        this.nejemplares = nejemplares;
        this.eprestados = eprestados;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNejemplares() {
        return nejemplares;
    }

    public void setNejemplares(int nejemplares) {
        this.nejemplares = nejemplares;
    }

    public int getEprestados() {
        return eprestados;
    }

    public void setEprestados(int eprestados) {
        this.eprestados = eprestados;
    }
    
}

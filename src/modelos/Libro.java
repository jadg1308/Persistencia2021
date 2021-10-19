/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Duran
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int edicion;
    private String copyright;
    private int estado; // 1. Original, 2. Modificado, 3. Eliminado, 4. Nuevo
    

    public Libro() {
    }

    public Libro(String isbn, String titulo, int edicion, String copyright, int estado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.edicion = edicion;
        this.copyright = copyright;
        this.estado = estado;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}

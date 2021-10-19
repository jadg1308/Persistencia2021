/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author POO IIS 2021
 */
public class ISBNAutor {
    private int idAutor;
    private String isbn;

    public ISBNAutor() {
    }

    public ISBNAutor(int idAutor, String isbn) {
        this.idAutor = idAutor;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
    
}

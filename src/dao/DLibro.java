/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import modelos.Libro;

/**
 *
 * @author Duran
 */
public class DLibro {
    private Conexion conex = new Conexion();
    private PreparedStatement verLibros;
    private PreparedStatement insertarLibro;
    private PreparedStatement editarLibro;
    private PreparedStatement eliminarLibro;
    private ArrayList<Libro> listaLibro = new ArrayList();

    public DLibro() {
    }

    public ArrayList<Libro> getListaLibro() {
        return listaLibro;
    }
    
    public int agregarLibro(String codigo, String titulo, int edicion, String copyright){
        int b = 0;
        try{
            listaLibro.add(new Libro(
                    codigo,
                    titulo,
                    edicion,
                    copyright,
                    4
            ));
            b = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return b;
    }
    
    public int editarLibro(String codigo, String titulo, int edicion, String copyright){
        int b = 0;
        try{          
            for(Libro lib : listaLibro){
                if(lib.getIsbn() == codigo){
                    lib.setTitulo(titulo);
                    lib.setEstado(edicion);
                    lib.setCopyright(copyright);
                    lib.setEstado(2);
                    return 1;
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return b;
    }
    
    public int eliminarLibro(String codigo){
        int b = 0;
        try{
            for(Libro lib : listaLibro){
                if(lib.getIsbn() == codigo){
                    lib.setEstado(3);
                    return 1;
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return b;
    }
    
    public String[] buscarLibro(String codigo){
        String[] datosLibro = new String[4];
        try{
            for(Libro lib : listaLibro){
                if(lib.getIsbn() == codigo){
                    datosLibro[0] = lib.getIsbn();
                    datosLibro[1] = lib.getTitulo();
                    datosLibro[2] = ""+lib.getEdicion();
                    datosLibro[3] = lib.getCopyright();
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return datosLibro;
    }
}

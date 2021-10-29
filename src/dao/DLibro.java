/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Libro;

/**
 *
 * @author Duran
 */
public final class DLibro {
    private Connection conn ;
    private final Conexion conexion = new Conexion();
    private PreparedStatement verLibros;
    private PreparedStatement insertarLibro;
    private PreparedStatement editarLibro;
    private PreparedStatement eliminarLibro;
    private ArrayList<Libro> listaLibro = new ArrayList();

    public DLibro() {
        try {
            conn = conexion.obtenerConexion();
            verLibros = conn.prepareStatement("Select * from Libro");
            insertarLibro = conn.prepareStatement("Insert Into Libro(isbn,"
                    + " titulo, edicion, copyright) Values(?, ?, ?, ?)");
            editarLibro = conn.prepareStatement("Update Libro set titulo = ?,"
                    + " edicion = ?, copyright  = ? where isbn = ?");
            eliminarLibro = conn.prepareStatement("Delete From Libro where isbn = ?");
        } catch (SQLException ex) {
            Logger.getLogger(DLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaLibro = this.listarRegistros();
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
    
    public ArrayList<Libro> listarRegistros(){
        ArrayList<Libro> listado = null;
        ResultSet rs = null;
        try{
            rs = verLibros.executeQuery();
            listado =  new ArrayList();
            while(rs.next()){
                listado.add(new Libro(
                        rs.getString("isbn"),
                        rs.getString("titulo"),
                        rs.getInt("edicion"),
                        rs.getString("copyright"),
                        1
                ));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                rs.close();
            }catch(SQLException ex){
                conexion.close(conn);
            }
        }
        return listado;
    }
    
    public int agregarRegistroBD(Libro libro){
        int r = 0;
        try{
            insertarLibro.setString(1,  libro.getIsbn());
            insertarLibro.setString(2, libro.getTitulo());
            insertarLibro.setInt(3, libro.getEdicion());
            insertarLibro.setString(4, libro.getCopyright());
            r = insertarLibro.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al guardar en BD", 
                    JOptionPane.ERROR_MESSAGE);
            conexion.close(conn);
        }
        return r;
    }
    
    public int modificaRegistroBD(Libro libro){
        int r = 0;
        try{
            editarLibro.setString(1, libro.getTitulo());
            editarLibro.setInt(2, libro.getEdicion());
            editarLibro.setString(3, libro.getCopyright());
            editarLibro.setString(4, libro.getIsbn());
            r = editarLibro.executeUpdate();
        }catch(SQLException ex ){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al modificar en BD", 
                    JOptionPane.ERROR_MESSAGE);
            conexion.close(conn);
        }
        return r;
                
    }
    
    public int eliminarRegistroBD(Libro libro){
        int r = 0;
        try{
            eliminarLibro.setString(1, libro.getIsbn());
            r = eliminarLibro.executeUpdate();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al eliminar en BD", 
                    JOptionPane.ERROR_MESSAGE);
            conexion.close(conn);
        }
        return r;
                
    }
    
    public String actualizarBD(){
        String msn ="";
        String msnError = "Errores en:";
        int nuevo = 0, modificado = 0, eliminados = 0;
        int errorN = 0, errorM = 0, errorE = 0;
        
        for (Libro libro : listaLibro){
            switch(libro.getEstado()){
                case 1: 
                    //No se ocupo este registro por lo tanto no hago nada
                    break;
                case 2:
                    if(this.modificaRegistroBD(libro) != 0) modificado ++;
                    else{
                        errorM ++;
                        msnError += "- Error al modifcar el registro " + libro.getTitulo() + "\n";
                    }
                    break;
                case 3:
                    if(this.eliminarRegistroBD(libro)!= 0) eliminados ++;
                    else{
                        errorE++;
                        msnError += "- Error al eliminar el registro " + libro.getTitulo() + "\n";
                    }
                    break;
                case 4:
                    if(this.agregarRegistroBD(libro)!=0){
                        nuevo++;
                    }else{
                        errorN ++;
                        msnError += "-  Error al insertar el registro "+ libro.getTitulo() + "\n";
                        
                    }
                    break;
                default:
                    msnError += "Revise el registro " + libro.getTitulo()+ "\n";
                    break;
            }
        }
        msn = "Registros Guardados " + nuevo + "\n" +
                "Registros Modificados " + modificado + "\n" +
                "Registros Eliminados " + eliminados + "\n";
        
        if(!msnError.equals("Errores en:")){
            msn += "\n" + msnError;
        }
        listaLibro = this.listarRegistros();
        return msn;
    }
    
}

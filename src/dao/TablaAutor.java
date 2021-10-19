/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Autor;

/**
 *
 * @author POO IIS 2021
 */
public class TablaAutor {
    private ArrayList<Autor> lista;
    private final Conexion conexion = new Conexion();
    private Connection conn; // Gestiona la conexion.
    private PreparedStatement mostrarRegistros;
    private PreparedStatement insertarRegistro;
    private PreparedStatement modificarRegistro;
    private PreparedStatement eliminarRegistro;
    
    public TablaAutor(){
        try{
            conn = conexion.obtenerConexion();
            mostrarRegistros = conn.prepareStatement("Select * from Autor");
            insertarRegistro = conn.prepareStatement("Insert Into Autor(nombrePila,"
                    + " apellidoPaterno) Values(?, ?)");
            modificarRegistro = conn.prepareStatement("Update Autor set nombrePila = ?,"
                    + " apellidoPaterno = ? where idAutor = ?");
            eliminarRegistro = conn.prepareStatement("Delete From Autor where idAutor = ?");
            lista = new ArrayList<>();
            
            lista = listarRegistro();
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    /**
     * Agrega los registros de la tabla de Autor 
     * en una lista.
     * @return 
     */
    private ArrayList<Autor> listarRegistro() {
        ArrayList<Autor> result = null;
        ResultSet rs = null;
        try{
            rs = mostrarRegistros.executeQuery();
            result = new ArrayList<>();
            while(rs.next()){
                result.add(new Autor(
                        rs.getInt("idAutor"),
                        rs.getString("nombrePila"),
                        rs.getString("apellidoPaterno"),
                        1 // estado Original que viene desde la BD
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
        return result;
    }
    
    /**
     * Agrega un nuevo elemento a la lista.
     * @param nombrePila
     * @param apellidoPaterno
     * @return 
     */
    public int agregarALista(String nombrePila, String apellidoPaterno){
        try{
            lista.add(new Autor(0, 
                    nombrePila, 
                    apellidoPaterno, 
                    4 // estado Nuevo registro sin guardar en la BD 
                    ));
            return 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }  
        return 0;
    }
    
    /**
     * Edita un elemento de la lista
     * @param idAutor
     * @param nombrePila
     * @param apellidoPaterno
     * @return 
     */
    public int editarEnLista(int idAutor, String nombrePila, String apellidoPaterno){
        try{
            Autor autor = new Autor(
                    idAutor, 
                    nombrePila, 
                    apellidoPaterno, 
                    2 // estado Modificado en la lista, no guardado en la BD
            );
            for(Autor a: lista){
               if(a.getIdAutor()== autor.getIdAutor()){
                   a.setNombrePila(autor.getNombrePila());
                   a.setApellidoPaterno(autor.getApellidoPaterno());
                   if(a.getEstado()!=0) a.setEstado(autor.getEstado()); 
                   return 1;
               } 
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    
    /**
     * Edita el estado de un elemento de la lista
     * para poder ser eliminado en la base de datos
     * una vez el usuario actualice los registros.
     * @param idAutor
     * @return 
     */
    public int eliminarEnLista(int idAutor){
        try{
            for(Autor a : lista){
                if(a.getIdAutor() == idAutor){
                    a.setEstado(3); //estado Eliminado en la lista,
                    //aun no eliminado en la base de datos.
                    return 1;
                }         
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    
    public int agregarRegistroBD(Autor autor) {
        int result = 0;
        try {
            insertarRegistro.setString(1, autor.getNombrePila());
            insertarRegistro.setString(2, autor.getApellidoPaterno());
            result = insertarRegistro.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conexion.close(conn);
        }
        return result;
    }
    
    public int modificarRegistroBD(Autor autor) {
        int result = 0;
        try {
            modificarRegistro.setString(1, autor.getNombrePila());
            modificarRegistro.setString(2, autor.getApellidoPaterno());
            modificarRegistro.setInt(3, autor.getIdAutor());
            result = modificarRegistro.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conexion.close(conn);
        }
        return result;
    }
    
    public int eliminarRegistroBD(Autor autor) {
        int result = 0;
        try {
            eliminarRegistro.setInt(1, autor.getIdAutor());

            result = eliminarRegistro.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            conexion.close(conn);
        }
        return result;
    }
    
    public String actualizarBD() {
        String msn = "";
        String msnError = "Errores en: ";
        int nuevos = 0, modificados = 0, eliminados = 0;
        int errorNuevos = 0, errorModificados = 0, errorEliminados = 0;
        for (Autor autor : lista) { 
            switch (autor.getEstado()) {
                case 1:
                    //Si es original no hace nada
                    break;
                case 2:
                    //Estado modificado
                    if (this.modificarRegistroBD(autor) != 0) {
                        modificados++;
                    } else {
                        errorModificados++;
                        msnError += "\n - Error al modificar: " + autor.getNombrePila() 
                                + " " + autor.getApellidoPaterno();
                    }
                    break;
                case 3:
                    //Estado eliminado
                    if (this.eliminarRegistroBD(autor) != 0) {
                        eliminados++;
                    } else {
                        errorEliminados++;
                        msnError += "\n - Error al eliminar: " + autor.getNombrePila() 
                                + " " + autor.getApellidoPaterno();
                    }
                    break;
                case 4:
                    //Estado nuevo registro
                    if (this.agregarRegistroBD(autor) != 0) {
                        nuevos++;
                    } else {
                        errorNuevos++;
                        msnError += "\n -Error al agregar nuevo registro: "  
                                + autor.getNombrePila() + " " + autor.getApellidoPaterno();
                    }
                    break;
                default:
                    msnError+="\n Revise el registro: "+ autor.getNombrePila() 
                            + " " + autor.getApellidoPaterno();
                    break;
            }
        }
        msn = "Registros guardados: " + nuevos + "\nRegistros editados: "+ modificados+
                "\nRegistros eliminados: " + eliminados;
        
        if (!msnError.equals("Errores en: ")){
            msn+="\n"+ msnError;
        }        
        lista = this.listarRegistro();
        return msn;
    }

    public ArrayList<Autor> getLista() {
        return lista;
    }
    
    
    
}

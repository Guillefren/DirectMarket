/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexionbd;

import Logica.Proveedor;
import Logica.cliente;
import java.sql.ResultSet;
import java.util.LinkedList;
import Logica.Hoja;
import Logica.Compuesta;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Agustin
 */
public class getLista {
    
        public LinkedList<cliente> getListaCliente(){
        LinkedList<cliente> ListaCliente = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try{
            bd.conectarBase();
            //ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM USUARIOS WHERE TIPO = 'C'");
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM USUARIOS");
            while (rs.next()){
                cliente cli = new cliente();
                cli.setNick(rs.getString("NICK"));
                cli.setNombre(rs.getString("NOMBRE"));
                cli.setApellido(rs.getString("APELLIDO"));
                cli.setEmail(rs.getString("EMAIL"));
                cli.setImagen(rs.getString("IMAGEN"));
                java.sql.Date sqldate = rs.getDate("Nacimiento");
                Date d = new Date(sqldate.getTime());
                cli.setFnac(d);
                ListaCliente.add(cli);
                 }
        }catch (SQLException e){
            
        }
        bd.desconectarBaseDeDatos();
        
        return ListaCliente;
        }
    
   public LinkedList<Proveedor> getListaProveedor(){
        LinkedList<Proveedor> ListaProveedor = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try{
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM USUARIOS WHERE TIPO = 'P'");
            while (rs.next()){
                Proveedor prov = new Proveedor();
               
                prov.setNick(rs.getString("Nick"));
                prov.setApellido(rs.getString("Apellido"));
                prov.setEmail(rs.getString("Email"));
                prov.setImagen(rs.getString("Imagen"));
                prov.setLinkPagina(rs.getString("SitioWeb"));
                prov.setNombre(rs.getString("Nombre"));
                prov.setNombreCompañia(rs.getString("NombreCompañia"));
                
                java.sql.Date sqldate = rs.getDate("Nacimiento");
                Date d = new Date(sqldate.getTime());
                prov.setFnac(d);
                
                ListaProveedor.add(prov);
                
                
            }
        }catch (Exception e){
            
        }
        bd.desconectarBaseDeDatos();
        
        return ListaProveedor;
    
    }
    
    
    
    public LinkedList<Hoja> getListaHoja(){
        LinkedList<Hoja> ListaHoja = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try{
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM CATEGORIAS");
            while (rs.next()){
                Hoja hoj = new Hoja();
                ListaHoja.add(hoj);
                
            }
        }catch (Exception e){
            
        }
        bd.desconectarBaseDeDatos();
        
        return ListaHoja;
    
    }
    
    
    public LinkedList<Compuesta> getListaCompuesta(){
        LinkedList<Compuesta> ListaCompuesta = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try{
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM CATEGORIAS");
            while (rs.next()){
                Compuesta com = new Compuesta();
                ListaCompuesta.add(com);
                
            }
        }catch (Exception e){
            
        }
        bd.desconectarBaseDeDatos();
        
        return ListaCompuesta;
    
    }
    
}

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

import Logica.DataHoja;
import Logica.DataProducto;
import Logica.Money;
import Logica.producto;
import java.util.*;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM USUARIOS WHERE TIPO = 'c'");
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
                //System.out.print(cli.getData().getNombre());
                ListaCliente.add(cli);
                 }
        }catch (SQLException e){
            
        }
        bd.desconectarBaseDeDatos();
        
        return ListaCliente;
        }
    
   public List<Proveedor> getListaProveedor(){
        List<Proveedor> ListaProveedor = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try{
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM USUARIOS WHERE TIPO = 'p'");
            while (rs.next()){
                Proveedor prov = new Proveedor();
               
                prov.setNick(rs.getString("NICK"));
                prov.setApellido(rs.getString("APELLIDO"));
                System.out.print(prov.getNick());
                prov.setEmail(rs.getString("EMAIL"));
                prov.setImagen(rs.getString("IMAGEN"));
                prov.setLinkPagina(rs.getString("LINK_COMP"));
                prov.setNombre(rs.getString("NOMBRE"));
                prov.setNombreCompañia(rs.getString("NOM_COMP"));
                
                java.sql.Date sqldate = rs.getDate("NACIMIENTO");
                Date d = new Date(sqldate.getTime());
                prov.setFnac(d);
                
                ListaProveedor.add(prov);
                
            }
        }catch (Exception e){
            
        }
        bd.desconectarBaseDeDatos();
        
        return ListaProveedor;
    
    }
    
    
    
    public List<DataHoja> getListaHoja(){
        LinkedList<DataHoja> ListaHoja = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        
            bd.conectarBase();
            ResultSet rs;
            try {
                rs = bd.sentencia.executeQuery("SELECT * FROM CATEGORIA WHERE TIPO = 'h'");
                while (rs.next()){
                    DataHoja dh = new DataHoja();
                    //JOptionPane.showMessageDialog(null, rs.getString("NOMBRE"));
                    dh.setNombre(rs.getString("NOMBRE"));
                    //JOptionPane.showMessageDialog(null, hoj.getNombre());
                    dh.setPadre(rs.getString("PADRE"));
                    //JOptionPane.showMessageDialog(null, dh.getNombre());
                    ListaHoja.add(dh);
                }
            } catch (SQLException ex) {
                Logger.getLogger(getLista.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public List<DataProducto> getProductosxCat(String cat){
        List<DataProducto> prodsxcat = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try {
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM CATxPROD cp,PRODUCTO p WHERE cp.NOMBRE_PROD = p.NOMBRE AND cp.NOMBRE_CAT ='"+cat+"'");
            while (rs.next()){
                DataProducto dp = new DataProducto();
                dp.setNombre(rs.getString("NOMBRE"));
                prodsxcat.add(dp);
            }
        }catch (SQLException ex) {
                Logger.getLogger(getLista.class.getName()).log(Level.SEVERE, null, ex);
        }
        bd.desconectarBaseDeDatos();
        return prodsxcat;
    }
    
    public int getMaxNumOrdenCompra(){
        int num = -1;
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try {
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT MAX(NUMERO) FROM ORDENCOMPRA");
            rs.next();
            num = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(getLista.class.getName()).log(Level.SEVERE, null, ex);
        }
        bd.desconectarBaseDeDatos();
        return num;
    }
    
    public producto SeleccionarProducto(String p){
        producto prod = new producto();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try {
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM PRODUCTO WHERE NOMBRE = '"+p+"'");
            rs.next();
                prod.setNombre(rs.getString("NOMBRE"));
                Money prec = new Money();
                prec.setValor(Double.parseDouble(rs.getString("PRECIO")));
                prod.setPrecio(prec);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(getLista.class.getName()).log(Level.SEVERE, null, ex);
        }
        bd.desconectarBaseDeDatos();
        return prod;
    }
}
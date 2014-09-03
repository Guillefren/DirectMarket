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
import Logica.ControladorUsuario;

import Logica.DataHoja;
import Logica.DataProducto;
import Logica.Especificacion;
import Logica.Money;
import Logica.OrdenDeCompra;
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
                
             ResultSet rs1 = bd.sentencia.executeQuery("SELECT * FROM ORDENCOMPRA WHERE NOMBRE_CLI = '"+cli.getNombre()+"'");   
   //("SELECT * FROM CATxPROD cp,PRODUCTO p WHERE cp.NOMBRE_PROD = p.NOMBRE AND cp.NOMBRE_CAT ='"+cat+"'")
              while (rs1.next()){
              
                  OrdenDeCompra oc = new OrdenDeCompra();
                    java.sql.Date sqldate2 = rs1.getDate("FECHA");
                    Date d2 = new Date(sqldate2.getTime());
                    oc.setFecha(d2);
                
                  oc.setNumero(rs1.getInt("NUMERO"));
                  Money pr = new Money();
                  pr.setValor(Double.valueOf(rs1.getString("PREC_TOTAL")));
                  pr.setTipo("USD");
                  oc.setPrecioTotal(pr);
                  cli.addOrden(oc);
                  
              }
             
             
             
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
                
                
            ResultSet rs2 = bd.sentencia.executeQuery("SELECT * FROM PRODUCTOS WHERE NOMBRE_PROV = '"+prov.getNombre()+"'");    
                
                while(rs2.next()){
                
                
                
                }
            
            
                
                ListaProveedor.add(prov);
                
            }
        }catch (Exception e){
            
        }
        bd.desconectarBaseDeDatos();
        
        return ListaProveedor;
    
    }
    
    
    
    public List<Hoja> getListaHoja(){
        LinkedList<Hoja> ListaHoja = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        
            bd.conectarBase();
            ResultSet rs;
            try {
                rs = bd.sentencia.executeQuery("SELECT * FROM CATEGORIA WHERE TIPO = 'h'");
                while (rs.next()){
                    Hoja dh = new Hoja();
                    //JOptionPane.showMessageDialog(null, rs.getString("NOMBRE"));
                    dh.SetNombre(rs.getString("NOMBRE"));
                    //JOptionPane.showMessageDialog(null, hoj.getNombre());
                    dh.SetPadre(rs.getString("PADRE"));
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
                ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM CATEGORIA WHERE TIPO='c'");
        while (rs.next()){
                Compuesta comp = new Compuesta();
                //int cont = rs.getRow();
                comp.SetNombre(rs.getString("NOMBRE"));
                //comp.SetPadre(rs.getString("PADRE"));
                ListaCompuesta.add(comp);
        }
        }catch (Exception e){
                System.out.println("No anda guacho");
        }
        bd.desconectarBaseDeDatos();
        return ListaCompuesta;

    }
    
    public List<producto> getProductosxCat(String cat){
        List<producto> prodsxcat = new LinkedList();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        try {
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM CATxPROD cp,PRODUCTO p WHERE cp.NOMBRE_PROD = p.NOMBRE AND cp.NOMBRE_CAT ='"+cat+"'");
            while (rs.next()){
                producto p = new producto();
                p.setNombre(rs.getString("NOMBRE"));
                prodsxcat.add(p);
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
    
    
    public List<producto> getListaProductoSolo(){
        List<producto> ListaProductoSolo = new LinkedList();
        Especificacion esp = new Especificacion();
        Conexionbd.conexion bd = new Conexionbd.conexion();
        
            try{
            bd.conectarBase();
            ResultSet rs = bd.sentencia.executeQuery("SELECT * FROM PRODUCTO p,ESPECIFICACIONESxPROD e WHERE p.NOMBRE = e.NOMBRE_PROD");
            while (rs.next()){
                producto prod = new producto();
                prod.setNombre(rs.getString("NOMBRE"));
                prod.setDescripcion(rs.getString("DESCRIPCION"));
                prod.setNumRef(rs.getInt("NUM_REF"));
          //      prod.setImagen(rs.getString("IMAGENES"));
                
                
                String imag = rs.getString("IMAGENES");
                //JOptionPane.showMessageDialog(null, imag);
                List<String> imagenes = new LinkedList();
                StringTokenizer st2 = new StringTokenizer(imag,"-");
                while(st2.hasMoreTokens()){
                    imagenes.add(st2.nextToken());
                    //JOptionPane.showMessageDialog(null, st.nextToken());
                }
                 prod.setImagen(imagenes);
                
                
                double i = Double.parseDouble(rs.getString("PRECIO"));
                Money prec = new Money();
                prec.setValor(i);
                prod.setPrecio(prec);
                ControladorUsuario cu = new ControladorUsuario();
                Proveedor pr = new Proveedor();
                pr = cu.SeleccionarProv(rs.getString("NOMBRE_PROV"));
                prod.setProvee(pr);
                         
                ResultSet rs2 = bd.sentencia.executeQuery("SELECT * FROM CATxPROD WHERE NOMBRE_PROD = '"+prod.getNombre()+"'");
                List<Hoja> hojas = new LinkedList();
                while(rs2.next()){
                    String categ = rs2.getString("NOMBRE_CAT");
                    Hoja hoja = new Hoja();
                    hoja.SetNombre(categ);
                    hojas.add(hoja);
                    //JOptionPane.showMessageDialog(null, hoja.GetNombre());
                    prod.setHoja(hojas);
                }
               
                ListaProductoSolo.add(prod);
            }
        }catch (SQLException e){
        }
        bd.desconectarBaseDeDatos();
        
        return ListaProductoSolo;
    }
}
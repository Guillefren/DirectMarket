/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexionbd;
import Logica.cliente;
import Logica.Proveedor;
import Logica.Compuesta;
import Logica.Hoja;
import Logica.producto;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Agustin
 */
public class agregar {
     public void agregarcliente(cliente cli){
     Conexionbd.conexion bd;
     bd = new Conexionbd.conexion();
     bd.conectarBase();
         try {
           //  java.sql.Date.valueOf(cli.getNacimiento().toString())
         //cli.getNacimiento().getYear()+"-"+cli.getNacimiento().getMonth()+"-"+cli.getNacimiento().getDay()+
           java.sql.Date fecha = new java.sql.Date(cli.getNacimiento().getTime());
            String tipo = "c";  
              
              //cal.getTime().getYear()+"-"+cal.getTime().getMonth()+"-"+cal.getTime().getDay()
             bd.sentencia.executeQuery("INSERT INTO USUARIOS(nick,nombre,apellido,email,nacimiento,imagen,tipo)VALUES('"+cli.getNick()+"','"+cli.getNombre()+"','"+cli.getApellido()+"','"+cli.getEmail()+"','"+fecha+"','"+cli.getImagen()+"','"+tipo+"')");
         
         
         } catch (SQLException ex) {
             System.out.println("No se pudo agregar a Base de datos");
             Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
         }
         bd.desconectarBaseDeDatos();
     
     
     
     }
     public void agregarproveedor(Proveedor cli){
     Conexionbd.conexion bd;
     bd = new Conexionbd.conexion();
     bd.conectarBase();
         try {
             String tipo = "p";
             java.sql.Date fecha = new java.sql.Date(cli.getNacimiento().getTime());
             bd.sentencia.executeQuery("INSERT INTO USUARIOS(NICK, NOMBRE, APELLIDO,EMAIL,NACIMIENTO,NOM_COMP,LINK_COMP,IMAGEN,TIPO)VALUES('"+cli.getNick()+"','"+cli.getNombre()+"','"+cli.getApellido()+"','"+cli.getEmail()+"','"+fecha+"','"+cli.getNombreCompañia()+"','"+cli.getLinkPagina()+"','"+cli.getImagen()+"','"+tipo+"')");
         } catch (SQLException ex) {
             System.out.println("No se pudo agregar a Base de datos");
             Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
         }
     
         bd.desconectarBaseDeDatos();
     
     
     }
     
     public void agregarCompuesta(Compuesta comp){
     Conexionbd.conexion bd;
     bd = new Conexionbd.conexion();
     bd.conectarBase();
         try {
             
             bd.sentencia.executeQuery("INSERT INTO CATEGORIA(REF, NOMBRE, PADRE)VALUES('"+1+"','"+comp.getNombre()+"','"+comp.getPadre()+"')");
         } catch (SQLException ex) {
             
             Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
         }
     
         bd.desconectarBaseDeDatos();
     
     
     }
     
     public void agregarHoja(Hoja hoj){
     Conexionbd.conexion bd;
     bd = new Conexionbd.conexion();
     bd.conectarBase();
         try {
             
             bd.sentencia.executeQuery("INSERT INTO HOJA(REF, NOMBRE, PADRE)VALUES('"+1+"','"+hoj.getNombre()+"','"+0+"')");
         } catch (SQLException ex) {
             
             Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
         }
     
         bd.desconectarBaseDeDatos();
     
     
     }
     public void agregarproducto(producto p) {
         
             Conexionbd.conexion bd;
             bd = new Conexionbd.conexion();
             bd.conectarBase();
             try {
             bd.sentencia.executeQuery("INSERT INTO PRODUCTO(Nombre, NumRef,Descripcion, precio,Imagen)VALUES('"+p.getNombre()+"','"+p.getNumRef()+"','"+p.getDescripcion()+"','"+p.getPrecio()+"','"+p.getImagen()+"')");
             
             bd.desconectarBaseDeDatos();
         } catch (SQLException ex) {
             Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
     
     
}

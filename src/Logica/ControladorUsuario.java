/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import java.util.*; 
import Conexionbd.*;
/**
 *
 * @author Guilleeu
 */
public class ControladorUsuario {
    
    
    private List<cliente> ListaClientes;
    private List<Proveedor> ListaProveedores;
    
    
    public void ControladorUsuario(){
        
     ListaClientes = new LinkedList();
    ListaProveedores = new LinkedList();
    
    
    // sintaxis List<Persona> listalinked = new LinkedList<Persona>();
    }
  
   
    public void RegistrarCliente(String nick, String nombre, String apellido, String email, Date fnac, String Imagen){
    
        cliente c = new cliente();
        c.setDatos(nick, nombre, apellido, email, fnac, Imagen);
        //ListaClientes.add(c);
        agregar ag = new agregar();
        ag.agregarcliente(c);
        
    }
    
    public void SetTipoUsuario(String t){
    }
    
    public void RegistrarProveedor(String nick, String nombre, String apellido, String email, Date fnac, String Imagen, String nombreComp, String linkPag){
    
    Proveedor p = new Proveedor();
    p.setdatos(nick, nombre, apellido, email,fnac, Imagen, nombreComp,linkPag);
//    ListaProveedores.add(p);
    agregar ag = new agregar();
    ag.agregarproveedor(p);
    
    }
    
    public void CargarFoto(){
   
    }
    
    public List<DataCliente> ListarClientes(){
        
    getLista gl = new getLista();
    LinkedList<cliente> clientes = gl.getListaCliente();
    List<DataCliente> DataListaClientes = new LinkedList();
    DataCliente dc = new DataCliente();
        for(int i=0; i<clientes.size(); i++){
                cliente cc  = new cliente();
                cc = clientes.get(i);
                dc = cc.getData();
                DataListaClientes.add(dc);
        }
    
        return DataListaClientes;
            // no se si esta devolviendo bien la lista  
    }
    
    public cliente SeleccionarCliente(String nick){
    
         getLista gl = new getLista();
         ListaClientes = gl.getListaCliente();
         for (int i=0; i<ListaClientes.size(); i++){
                if (ListaClientes.get(i).nick == nick){
                    return ListaClientes.get(i);
                 }
              }
        return null;
    }
    
    public List<DataProveedor> ListarProveedores(){
        
        List<DataProveedor> dataListaProveedores = new LinkedList();
        getLista gl = new getLista();
        ListaProveedores = gl.getListaProveedor();
        
        Iterator it = ListaProveedores.iterator();
        DataProveedor dp = new DataProveedor();
        while(it.hasNext()){
            if ( it instanceof Proveedor){
                Proveedor p = new Proveedor();
                p = (Proveedor)it;
                dp = p.getData();
                dataListaProveedores.add(dp);
            
            }
            it.next();
        
        }
      
    return dataListaProveedores;
    }
    
    
    public DataProveedor SeleccionarProveedor(String nick){
        
        getLista gl = new getLista();
        ListaProveedores = gl.getListaProveedor();
        
       Iterator it = ListaProveedores.iterator();
       
       for(int i=0; i<=ListaProveedores.size();i++){
           Proveedor p = new Proveedor();
            if(it instanceof Proveedor){
                
                p = (Proveedor)it;
                if (p.getNick() == nick){
                    DataProveedor dp = new DataProveedor();
                    dp = p.getData();
                    return dp;
                }
            } 
       }
    return null;
    }
    
    
  /*  public List<OrdenDeCompra> ObtenerOrdenesdeCompra(){
    
    
    }
    public dataOrdenDeCompra SeleccionarOrdenCompra(OrdenDeCompra oc){
    
    
    
    }
    */
}

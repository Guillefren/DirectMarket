/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import java.util.*; 
/**
 *
 * @author Guilleeu
 */
public class ControladorUsuario {
    
    
    public List ListaClientes;
    public List ListaProveedores;
    
    
    public void ControladorUsuario(){
        
    List<cliente> ListaClientes = new LinkedList<cliente>();
    List<Proveedor> ListaProveedores = new LinkedList<Proveedor>();
    
    
    // sintaxis List<Persona> listalinked = new LinkedList<Persona>();
    }
  
   
    public void RegistrarCliente(String nick, String nombre, String apellido, String email, /*date fnac,*/ String Imagen){
    
        cliente c = new cliente();
        c.setDatos(nick, nombre, apellido, email, Imagen);
        ListaClientes.add(c);
       
    }
    
    public void SetTipoUsuario(String t){
    }
    
    public void RegistrarProveedor(String nick, String nombre, String apellido, String email, /*date fnac,*/ String Imagen, String nombreComp, String linkPag){
    
    Proveedor p = new Proveedor();
    p.setdatos(nick, nombre, apellido, email, Imagen, nombreComp,linkPag);
    ListaProveedores.add(p);
    
    }
    public void CargarFoto(){
   
    }
    
    public DataCliente ListarClientes(){
    
    List<DataCliente> DataListaClientes = new LinkedList<DataCliente>();
    DataCliente dc = new DataCliente();
    Iterator it = ListaClientes.iterator();
    while(it.hasNext())
            
    }
    SeleccionarCliente(string)
    ListarProveedores()
    SeleccionarProveedor(String)
    ObtenerOrdenesdeCompra()
    SeleccionarOrdenCompra(OrdenCompra)
    
}

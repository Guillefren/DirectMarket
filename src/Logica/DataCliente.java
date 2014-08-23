/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Guilleeu
 */
class DataCliente {
    
    private String nick;
    private String nombre;
    private String apellido;
    private String email;
    private String fnac;
    private String imagen;
    
    
    public void DataCliente(){
    nick = null;
    nombre = null;
    apellido = null;
    email = null;
    //fnac = null;
    imagen = null;
    }
    public void setDatos(String nick, String nombre, String apellido, String email, /*date fnac*/ String imagen){
    
    this.apellido = apellido;
    this.email = email;
    this.imagen = imagen;
    this.nick = nick;
    this.nombre = nombre;
    
    }
     public String getNick(){
        return nick;
    }
    public String getNombre(){
        return nombre;
    }
     public String getApellido(){
        return apellido;
    }
    public String getEmail(){
        return email;
    }
    public String getImagen(){
        return imagen;
    }
    
}

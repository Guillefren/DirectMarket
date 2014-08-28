package Logica;

/**
 *
 * @author Usuario
 */
class DataProducto {
    
    private String Nombre;
    private int NumRef;
    private String Descripcion;
    private Especificacion Esp;
    private Money Precio;
    private String Imagen;
    
    public void DataProducto(){
        Nombre=null;
        Descripcion=null;
        Esp=null;
        Precio = null;
        Imagen=null;
    }

    void setDataProd(String Nombre, int NumRef, String Descripcion, Especificacion Especif, Money Prec, String Imagen) {
        this.Nombre=Nombre;
        this.NumRef=NumRef;
        this.Descripcion=Descripcion;
        this.Esp=Especif;
      this.Precio = Prec;
         this.Imagen=Imagen;
    }
    
}

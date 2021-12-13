
package pojos;

/**
 *
 * @author kruz_
 */
public class productos {
    int idproducto;
    String Nombre;
    String cantidad;
    int precio;
    
    
    public productos(){}
    
    
    public productos(int idproducto,String Nombre,String cantidad,int precio){
    this.idproducto = idproducto;
        this.Nombre = Nombre;
        this.cantidad = cantidad;
        this.precio = precio;   

    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}

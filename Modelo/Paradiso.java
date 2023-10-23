package Modelo;

/**
 *
 * @author Jordán Osorio
 */

public class Paradiso extends Local{

    private Producto producto;

    public Paradiso(){
    }

    public Paradiso(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String toString() {
        return "Paradiso [producto=" + producto + "]";
    }
    
    
    
}

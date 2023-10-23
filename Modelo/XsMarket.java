package Modelo;

/**
 *
 * @author Jordán Osorio
 */

public class XsMarket extends Local{

    private Producto producto;

    

    public XsMarket() {
    }

    public XsMarket(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String toString() {
        return "XsMarket [producto=" + producto + "]";
    }

    


    
}

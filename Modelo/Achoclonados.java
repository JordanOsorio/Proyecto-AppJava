package Modelo;

/**|
 *
 * @author Jordán Osorio
 */

public class Achoclonados extends Local{

    private Producto producto;

    public Achoclonados(){
    } 

    public Achoclonados(Producto producto, int idLocal){
        super(idLocal);
        this.producto = producto;
    }

    public void setProducto(Producto producto){
        this.producto = producto;
    }

    public Producto getProducto(){
        return producto;
    }

    public String print(){
        return "Archoclonados: " + producto;
    }


    
}

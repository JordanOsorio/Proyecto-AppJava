package Main;

import Modelo.Achoclonados;
import Modelo.Producto;

/**
 *
 * @author Jordán Osorio
 */

public class Vista {


    public static void main(String arg[]){

        Producto producto = new Producto(1522,"hola","que pasa",100.0,"25-12-1993",25);
        Achoclonados achoclonado = new Achoclonados(producto,1500);




        System.out.println(achoclonado.print);
        System.out.println("holandaaaaaa");
        


        






    }

}
package Modelo;

import java.util.Date;

/**
 *
 * @author Jordán Osorio
 */

public class Producto {

    private int codProd;
    private String tipoProducto;
    private String nombreProducto;
    private Double precio;
    private Date fechaVencimiento;
    private int stock;

    public Producto(){
    }
    
    public Producto(int codProd, String tipoProducto,String nombreProducto,Double precio, Date fechaVencimiento, int stock){
        this.codProd = codProd;
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
        this.stock = stock;
    }

    public int getCodProd(){
        return codProd;
    }

    public void setCodProd(int codProd){
        this.codProd = codProd;
    }

    public String getTipoProducto(){
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto){
        this.tipoProducto = tipoProducto;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto [codProd=" + codProd + ", tipoProducto=" + tipoProducto + ", nombreProducto=" + nombreProducto
                + ", precio=" + precio + ", fechaVencimiento=" + fechaVencimiento + ", stock=" + stock + "]";
    }
    






    
}

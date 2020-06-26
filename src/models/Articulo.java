package models;

public class Articulo {
    private String nombre;
    private String descripcion;
    private float precioCompra;
    private float precioVenta;
    private short stockMax;
    private short stockMin;
    private short existencia;
    
    Conexion conexion;
    
    public Articulo(){
        this.conexion = new Conexion();
        System.out.print(this.conexion);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setPrecioCompra(float pCompra){
        this.precioCompra = pCompra;
    }
    public void setPrecioVenta(float pVenta){
        this.precioVenta = pVenta;
    }
    public void setStockMax(short stock){
        this.stockMax = stock;
    }
    public void setStockMin(short stock){
        this.stockMin = stock;
    }
    public void setExistencia(short existencia){
        this.existencia = existencia;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public float getPrecioCompra(){
        return this.precioCompra;
    }
    public float getPrecioVenta(){
        return this.precioVenta;
    }
    public short getStockMax(){
        return this.stockMax;
    }
    public short getStockMin(){
        return this.stockMin;
    }
    public short getExistencia(){
        return this.existencia;
    }
    
}

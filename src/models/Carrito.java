package models;

public class Carrito {
    private String nProducto;
    private String mProducto;
    private int cantidadP;
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setnProducto(String nProducto) {
        this.nProducto = nProducto;
    }

    public void setmProducto(String mProducto) {
        this.mProducto = mProducto;
    }

    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
    }

    public Carrito() {
    }

    public Carrito(String nProducto, String mProducto, int cantidadP,int precio) {
        this.nProducto = nProducto;
        this.mProducto = mProducto;
        this.cantidadP = cantidadP;
        this.precio=precio;
    }
    public void imprimirD(){
        System.out.println("Productos "+this.nProducto+"Modelo "+this.mProducto+"Cantidad "+this.cantidadP+"Precio "+this.precio);
    }
}

package models;

public class Inventario {
    private String nombreP;
    private String modeloP;
    private int cantidad;
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getModeloP() {
        return modeloP;
    }

    public void setModeloP(String modeloP) {
        this.modeloP = modeloP;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Inventario() {

    }

    public Inventario(String nombreP, String modeloP, int cantidad,int precio) {
        this.nombreP = nombreP;
        this.modeloP = modeloP;
        this.cantidad = cantidad;
        this.precio= precio;
    }

    public void imprimir2(){
        System.out.println("Producto: "+nombreP+"modelo: "+modeloP+"Disponibles: "+cantidad+"Precio: "+precio+"MXN");

    }
}

package models;

public class Catalogo {
    private String nombreP;
    private String modeloP;
    private int cantidad;
    private int  precio;

    public Catalogo(String nombreP, String modeloP, int cantidad, int precio) {
        this.nombreP = nombreP;
        this.modeloP = modeloP;
        this.cantidad = cantidad;
        this.precio = precio;
    }

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

    public Catalogo() {

    }
    public void imprimir(){
        System.out.println("Producto: "+nombreP+"modelo: "+modeloP+"Disponibles: "+cantidad+"Precio: "+precio+"MXN");

    }

}

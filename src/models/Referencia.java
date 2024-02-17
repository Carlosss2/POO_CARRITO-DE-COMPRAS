package models;

import java.util.ArrayList;

public class Referencia {
    private int ID;
    private String producto;
    private int precio;
    private int total;
    private boolean verificacion;

    public boolean isVerificacion() {
        return verificacion;
    }

    public void setVerificacion(boolean verificacion) {
        this.verificacion = verificacion;
    }

    private ArrayList<Carrito> carrito = new ArrayList<Carrito>();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Referencia() {
    }



    public void imprimirD(){
        System.out.println("Los ID disponibles son: "+ID);
    }
}

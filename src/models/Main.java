package models;

import models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner teclado=new Scanner(System.in);
        ArrayList<Usuario> list = new ArrayList<Usuario>();
        ArrayList<Catalogo> listT = new ArrayList<Catalogo>();
        ArrayList<Inventario> listC = new ArrayList<Inventario>();
        ArrayList<Carrito> carrito = new ArrayList<Carrito>();
        ArrayList<Referencia> referencias = new ArrayList<Referencia>();
        Usuario usuario=new Usuario();
        Administrador administrador=new Administrador();

        Inventario catalogo2=new Inventario();
        Carrito carrito1=new Carrito();
        Referencia referencia=new Referencia();
        int ID;

        do {
            System.out.println("---------------------CARRITO DE COMPRAS------------------------");
            System.out.println("1.Registrate");
            System.out.println("2.Iniciar sesion");
            System.out.println("3.Acceder como admistrador");
            System.out.println("4.Salir");
            System.out.println("---------------------------------------------");
            System.out.println("Seleccione");
            int opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    String nombre=teclado.next();
                    usuario.setNombre(nombre);
                    System.out.println("Ingrese su apellido: ");
                    String apellido=teclado.next();
                    usuario.setApellido(apellido);
                    System.out.println("Cree una contraseña: ");
                    String contraseña=teclado.next();
                    usuario.setContraseña(contraseña);
                    list.add(usuario);
                    System.out.println("Bienvenido a CARRITO "+nombre);
                    break;
                case 2:

                        System.out.println("---------------------------------------");
                        System.out.println("Ingrese su nombre");
                        String nombre1=teclado.next();
                        System.out.println("Ingrese su apellido");
                        String apellido1=teclado.next();
                        System.out.println("Ingrese su contraseña");
                        String contraseña1=teclado.next();

                        if (nombre1.equals(usuario.getNombre()) && apellido1.equals(usuario.getApellido()) && contraseña1.equals(usuario.getContraseña())) {
                            boolean flag3=true;
                            do {
                                System.out.println("---------------------------CARRITO DE COMPRAS-------------------------");
                                System.out.println("------------------------------------------------PRODUCTOS-------------");
                                System.out.println("1.Productos");
                                System.out.println("2.Salir");

                                int opcion2= teclado.nextInt();
                                switch (opcion2){
                                    case 1:
                                        boolean bandera=true;
                                        do {
                                        System.out.println("------------------------PRODUCTOS-------------------------------");
                                        System.out.println("Telefonia");

                                        for (int i = 0; i < listT.size(); i++) {
                                            System.out.print((i + 1) + ". ");
                                            listT.get(i).imprimir();
                                        }

                                            System.out.println("Equipos de computo");
                                            for (int i = 0; i < listC.size(); i++) {
                                                System.out.print((i + 1) + ". ");
                                                listC.get(i).imprimir2();
                                                System.out.println("-----------------------------------------------------------");
                                            }
                                            System.out.println("1.agregar productos a mi carrito");
                                            System.out.println("2.ver carrito");
                                            System.out.println("3.Salir");
                                            int desicion= teclado.nextInt();
                                            switch (desicion){
                                                case 1:
                                                    System.out.println("nombre del producto a agregar");
                                                    String nProducto=teclado.next();
                                                    carrito1.setnProducto(nProducto);
                                                    System.out.println("modelo del producto");
                                                    String mProducto= teclado.next();
                                                    carrito1.setmProducto(mProducto);
                                                    for (Catalogo catalogo1:listT){
                                                        if (nProducto.equals(catalogo1.getNombreP())&&mProducto.equals(catalogo1.getModeloP())) {
                                                            catalogo1.setNombreP(nProducto);
                                                            catalogo1.setModeloP(mProducto);
                                                            System.out.println("Cantidad del producto a agregar");
                                                            int cantidadP= teclado.nextInt();
                                                            catalogo1.setCantidad(cantidadP);
                                                            carrito1.setCantidadP(cantidadP);
                                                            carrito1.setPrecio(catalogo1.getPrecio());
                                                            carrito.add(carrito1);

                                                        }
                                                    }
                                                    break;
                                                case 2:
                                                    boolean flag4=true;
                                                    System.out.println("---------------------MI--CARRITO-------------------");
                                                    for (Carrito carrito2:carrito){
                                                        carrito2.imprimirD();
                                                    }
                                                    do {
                                                        System.out.println("1.Realizar compra");
                                                        System.out.println("2.Mis compras");
                                                        System.out.println("3.Salir");
                                                        int proceso= teclado.nextInt();
                                                        boolean verificacion=false;
                                                        switch (proceso){
                                                            case 1:

                                                                System.out.println("Producto: ");
                                                                for (Carrito  carrito2:carrito){
                                                                    carrito2.imprimirD();
                                                                }
                                                                int total= carrito1.getPrecio();
                                                                System.out.println("Total= "+total);
                                                                ID=1001;
                                                                referencia.setID(ID);
                                                                System.out.println("ingrese 1 para confirmar");
                                                                int desicion1=teclado.nextInt();
                                                                if (desicion1==1){
                                                                    System.out.println("su compra esta en proceso");
                                                                    ID++;
                                                                    System.out.println("su compra genero el ID: "+ID);
                                                                    referencia.setID(ID);
                                                                }
                                                                break;
                                                            case 2:
                                                                System.out.println("Compras: ");
                                                                for (Carrito  carrito2:carrito){
                                                                    carrito2.imprimirD();
                                                                }
                                                                if (verificacion==true){
                                                                    System.out.println("Su compra llegara en 6 dias");
                                                                }else {
                                                                    System.out.println("Compra en proceso");
                                                                }
                                                                break;
                                                            case 3:
                                                                flag4=false;
                                                                break;

                                                        }

                                                    }while (flag4==true);

                                                    break;
                                                case 3:
                                                    bandera=false;
                                                    break;
                                            }
                                        }while (bandera==true);
                                        break;
                                    case 2:
                                        flag3=false;

                                        break;


                                }

                            }while (flag3==true);

                        }else {
                            System.out.println("Ingreso un dato incorrecto contraseña/usuario");
                        }





                    break;
                case 3:
                    System.out.println("Ingrese su usuario");
                    String usuario1= teclado.next();
                    System.out.println("Ingrese su contraseña");
                    String contraseña2=teclado.next();
                    if (usuario1.equals(administrador.getUsuario())&&contraseña2.equals(administrador.getContraseña())){
                        boolean flag2=true;
                        do {
                            System.out.println("-------------------------------------------------------------");
                            System.out.println("Bienvenido jefe");
                            System.out.println("QUE HAREMOS HOY?");
                            System.out.println("1.Agregar productos");
                            System.out.println("2.Validar compra");
                            System.out.println("3.Ver productos");
                            System.out.println("4.Salir");
                            System.out.println("-----------------------------------------------------------------");
                            int opcion3= teclado.nextInt();
                            switch (opcion3){
                                case 1:
                                    System.out.println("Tipo de productos");
                                    System.out.println("1.Telefonia");
                                    System.out.println("2.Equipos de computo");
                                    System.out.println("3.Salir");
                                    int opcion5= teclado.nextInt();
                                    switch (opcion5){
                                        case 1:
                                            System.out.println("Nombre producto: ");
                                            String nombreP= teclado.next();
                                            System.out.println("Modelo producto: ");
                                            String modeloP=teclado.next();
                                            System.out.println("Cantidad de producto");
                                            int cantidad=teclado.nextInt();
                                            System.out.println("Precio: ");
                                            int precio= teclado.nextInt();
                                            System.out.println("Producto registrado con exito");
                                            Catalogo catalogo1=new Catalogo(nombreP,modeloP,cantidad,precio);
                                            listT.add(catalogo1);
                                            break;
                                        case 2:
                                            System.out.println("Nombre producto: ");
                                            String nombreP1= teclado.next();
                                            System.out.println("Modelo producto: ");
                                            String modeloP1=teclado.next();
                                            System.out.println("Cantidad de producto");
                                            int cantidad1=teclado.nextInt();
                                            System.out.println("Precio: ");
                                            int precio1= teclado.nextInt();
                                            System.out.println("Producto registrado con exito");
                                            Inventario catalogoN=new Inventario(nombreP1,modeloP1,cantidad1,precio1);
                                            listC.add(catalogoN);
                                            break;
                                        case 3:
                                            flag2=false;
                                            break;

                                    }
                                    break;
                                case 2:
                                    boolean validacion;
                                    for (Referencia referencia1:referencias){
                                        referencia1.imprimirD();
                                    }
                                    System.out.println("ingrese ID: ");
                                    int ID2= teclado.nextInt();
                                    if (ID2 ==referencia.getID()){
                                        System.out.println("Ingrese 1 para validar las compras-ingrese 2 para denegar");
                                        int validar= teclado.nextInt();
                                        if (validar==1){
                                            validacion=true;
                                            System.out.println("Compra validada");
                                            referencia.setVerificacion(validacion);
                                        }else {
                                            validacion=false;

                                            referencia.setVerificacion(validacion);
                                        }

                                    }else {
                                        System.out.println("ID no existe");
                                    }

                                    break;

                                case 3:
                                    System.out.println("------------------------PRODUCTOS-------------------------------");
                                    System.out.println("Telefonia");
                                    for (int i = 0; i < listT.size(); i++) {
                                        System.out.print((i + 1) + ". ");
                                        listT.get(i).imprimir();
                                    }
                                    System.out.println("Equipos de computo");
                                    for (int i = 0; i < listC.size(); i++) {
                                        System.out.print((i + 1) + ". ");
                                        listC.get(i).imprimir2();
                                    }
                                    break;
                                case 4:
                                    flag2=false;
                                    break;

                            }

                        }while (flag2==true);


                    }else {
                        System.out.println("Dato incorrecto contraseña/usuario");
                    }
                    break;
                case 4:
                    flag=false;
                    break;
            }

        }while (flag==true);

    }
}
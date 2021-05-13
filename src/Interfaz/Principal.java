package Interfaz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import datos.Carrito;
import datos.Cliente;
import datos.Equipamento;
import datos.Indumentaria;
import datos.Producto;
import datos.Deporte;
import java.util.Iterator;

public class Principal {
	
	public static void Bienvenida() {
        System.out.println("Bienvenido a Nuestra tienda de deportes");
    }
	
	public static void menu() {
    	System.out.println();
        System.out.println("Men� principal");
        System.out.println("Seleccione una de las siguientes opciones: \n" + 
                            "1. Consultar productos \n" +
                            "2. Portal de compra \n" +
                            "3. Salir");
	}
	
	public static int EntradaMenu (){
        try {
        	Scanner sc = new Scanner(System.in);
        	sc.close();
        	int elegido = sc.nextInt();
        	return elegido;}
        catch (Exception e) {
        	return -1;

        }
    }
	public static void consultarProductos(ArrayList<Producto> productos) {
		System.out.println("Productos:");
		int c = 0;
		for (Producto i: productos) {
			System.out.println(" " +(c+1)+ ". " + i.getNombre());
			c++;};
	}
	public static void consultarProductos(ArrayList<Producto> productos, int i) {
		try {
		System.out.println("El producto es:");
		System.out.println(productos.get(i-1));
		} catch (Exception e) {
			mostrarError();
		}
	}

	public static void consultarDeportes(TreeSet<Deporte> deportes){
		System.out.println("Deportes: \n");
		Iterator<Deporte> it = deportes.iterator();
     	while(it.hasNext()){
        	System.out.println(it.next().getNombre());
     	}
		System.out.println();
	}

	public static void consultarBodegaEquipamiento(HashSet<Equipamento> bodega){
		System.out.println("Deportes: \n");
		Iterator<Equipamento> it = bodega.iterator();
     	while(it.hasNext()){
        	System.out.println(it.next().getNombre());
     	}
		System.out.println();
	}

	public static void consultarBodegaIndumentaria(HashSet<Indumentaria> bodega){
		System.out.println("Deportes: \n");
		Iterator<Indumentaria> it = bodega.iterator();
     	while(it.hasNext()){
        	System.out.println(it.next().getNombre());
     	}
		System.out.println();
	}

	public static void consultarProductos(HashMap<String, Indumentaria> Ropa){
		System.out.println("Productos de Indumentaria: \n");
		for (String llave : Ropa.keySet()) {
			Indumentaria valor = Ropa.get(llave);
			System.out.println("Llave = " + llave + ", Artículo = " + valor.getNombre());
		}
		System.out.println();
	}

	public static void consultarProductosEquipamiento(HashMap<String, Equipamento> equipo){
		System.out.println("Productos de Equipamiento: \n");
		for (String llave : equipo.keySet()) {
			Equipamento valor = equipo.get(llave);
			System.out.println("Llave = " + llave + ", Artículo = " + valor.getNombre());
		}
		System.out.println();
	}

	public static void menuConsultarProductoEspecifico() {
		System.out.println();
        System.out.println("Escriba el numero del producto que quiere consultar");
	}
	public static void menuConsulta() {
		System.out.println();
        System.out.println("Men� de Consulta");
        System.out.println("Seleccione una de las siguientes opciones: \n" + 
                            "1. ver producto \n" +
                            "2. volver \n" +
                            "3. Salir");
	}
	public static void menuCompra() {
		System.out.println();
        System.out.println("Men� de Compra");
        System.out.println("Seleccione una de las siguientes opciones: \n" + 
                            "1. Elegir productos \n" +
                            "2. ver carrito \n" +
                            "3. volver \n" +
                            "4. Salir");
	}

	public static void menuEstanterias() {
		System.out.println();
        System.out.println("Selección de Productos");
        System.out.println("Seleccione una de las siguientes opciones: \n" + 
                            "|||||Equipamiento||||| \n" +
                            " 1. Ver implemento \n" +
                            "2. Ver transporte \n" +
                            "3. Ver protección \n" +
                            "|||||Indumentaria||||| \n" +
                            "4. Tren superior \n" +
                            "5. Tren inferior \n" +
                            "6. Calzado \n" +
                            "7. Accesorios \n" +
                            "8. Volver");     
	}

	public static void opcionAdd() {
		System.out.println("Presione 1 para añadir el producto a su carrito" + 
							"\n Presione 2 para volver a la selección");
	}

	public static void addCarrito(ArrayList<Producto> productosCliente, Carrito carrito, int opcion) {
		int elemento = opcion-1;
		carrito.addItem(productosCliente.get(elemento));
		//System.out.println(productosCliente.get(elemento).getClass().getSimpleName());
	}
	
	public static void asignarCarrito(Cliente cliente, Carrito carrito) {
		cliente.setCarrito(carrito);
	}

	public static void mostrarError() {
		System.out.println("Entrada Invalida");
	}
}

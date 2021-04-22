package Interfaz;

import java.util.ArrayList;
import java.util.Scanner;

import datos.Producto;

public class Principal {
	
	public static void Bienvenida() {
        System.out.println("Bienvenido a Nuestra tienda de deportes");
    }
	
	public static void menu() {
    	System.out.println();
        System.out.println("Menú principal");
        System.out.println("Seleccione una de las siguientes opciones: \n" + 
                            "1. Consultar productos \n" +
                            "2. Portal de compra \n" +
                            "3. Salir");
	}
	
	public static int EntradaMenu (){
        try {
        	Scanner sc = new Scanner(System.in);
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
	public static void menuConsultarProductoEspecifico() {
		System.out.println();
        System.out.println("Escriba el numero del producto que quiere consultar");
	}
	public static void menuConsulta() {
		System.out.println();
        System.out.println("Menú de Consulta");
        System.out.println("Seleccione una de las siguientes opciones: \n" + 
                            "1. ver producto \n" +
                            "2. volver \n" +
                            "3. Salir");
	}
	public static void menuCompra() {
		System.out.println();
        System.out.println("Menú de Compra");
        System.out.println("Seleccione una de las siguientes opciones: \n" + 
                            "1. Elegir productos \n" +
                            "2. ver carrito \n" +
                            "3. volver \n" +
                            "4. Salir");
	}
	public static void mostrarError() {
		System.out.println("Entrada Invalida");
	}
}

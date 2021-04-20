package Interfaz;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
		int elegido = sc.nextInt();
		return elegido;      
    }
	public static void consultarProductos() {
		System.out.println("en construcción");
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

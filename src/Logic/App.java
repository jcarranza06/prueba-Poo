package Logic;
import datos.*;

import java.util.ArrayList;

import Interfaz.*;
public class App {
	 public static void main(String[] args) throws Exception {
		 System.out.println("hola mundo");
		 Principal.Bienvenida();
		 
		 ArrayList<Producto> productos = new ArrayList<Producto>();
		 
		 Deporte futbol = new Deporte("futbol", "Deporte en equipo de pelota");
		 Deporte tennis = new Deporte("tennis", "Deporte de pelota");
		 Deporte natacion = new Deporte("natacion", "Deporte acuatico");
		
		 Implemento balonGolty = new Implemento("Balon talla 8", 30000, 1, futbol, "Golty");
		 
		 productos.add(balonGolty);
		 
		 int entrada = 0;
		 while (entrada!=3){//ciclo menu principal
			 int entradaMenuConsulta = 0;
			 int entradaMenuCompra = 0;
			 Principal.menu();
			 entrada = Principal.EntradaMenu();
			 
			 if (entrada == 1) {//entrada al menu de consulta
				 while (entradaMenuConsulta != 2) {//ciclo menu consulta
					 Principal.consultarProductos(productos);//mostrar todos los productos de la tienda
					 Principal.menuConsulta();
					 entradaMenuConsulta = Principal.EntradaMenu();
					 if (entradaMenuConsulta == 1) {
						 Principal.menuConsultarProductoEspecifico();
						 int productoConsulta = Principal.EntradaMenu();
						 Principal.consultarProductos(productos, productoConsulta);// se consulta el producto por su index de la lista productos 
					 }else if (entradaMenuConsulta == 2) {
						 //volver
						 continue;
					 }else if (entradaMenuConsulta == 3) {
						 //salir
						 entradaMenuConsulta = 2;
						 entrada = 3;
					 }else {
						 Principal.mostrarError();
					 }
			 	}
			 }else if(entrada == 2) {//entrada al menu de compra
				 while (entradaMenuCompra != 3) {//ciclo menu de compra
					 Principal.menuCompra();
					 entradaMenuCompra = Principal.EntradaMenu();
					 if (entradaMenuCompra == 1) {
						 //elegir productos para el carrito
						 System.out.println("en construccion");
					 }else if (entradaMenuCompra ==2) {
						 //ver el carrito
						 System.out.println("en construccion");
					 }else if (entradaMenuCompra == 3) {
						 //volver
						 continue;
					 }else if (entradaMenuCompra == 4) {
						 //salir
						 entradaMenuCompra = 3;
						 entrada = 3;
					 }else {
						 Principal.mostrarError();
					 }
				 }
			 }else if(entrada == 3) {//salir 
				 continue;
			 }else {
				 Principal.mostrarError();
			 }
		}
	}
}




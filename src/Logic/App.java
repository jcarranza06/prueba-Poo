package Logic;
import datos.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import Interfaz.*;
public class App {
	 public static void main(String[] args) throws Exception {
		 System.out.println("hola mundo");
		 Principal.Bienvenida();

		 HashMap<String, Equipamento> productoEquipamiento = new HashMap<String, Equipamento>();
		 HashMap<String, Indumentaria> productoIndumentaria = new HashMap<String, Indumentaria>();

		 HashSet<Deporte> deportes = new HashSet<Deporte>();

		 HashSet<Equipamento> bodegaEquipamiento = new HashSet<Equipamento>();
		 HashSet<Indumentaria> bodegaIndumentaria = new HashSet<Indumentaria>();

		 //Estantes
		 ArrayList<Producto> estanteImplemento = new ArrayList<Producto>();
		 ArrayList<Producto> estanteTransporte = new ArrayList<Producto>();
		 ArrayList<Producto> estanteProteccion = new ArrayList<Producto>();

		 ArrayList<Producto> estanteTrenInf = new ArrayList<Producto>();
		 ArrayList<Producto> estanteTrenSup = new ArrayList<Producto>();
		 ArrayList<Producto> estanteCalzado = new ArrayList<Producto>();
		 ArrayList<Producto> estanteAccesorios = new ArrayList<Producto>();
		 //Estantes

		 ArrayList<Producto> productos = new ArrayList<Producto>();
		 
		 Deporte futbol = new Deporte("futbol", "Deporte en equipo de pelota");
		 Deporte tennis = new Deporte("tennis", "Deporte de pelota");
		 Deporte natacion = new Deporte("natacion", "Deporte acuatico");
		 Deporte baloncesto = new Deporte("baloncesto", "Deporte en equipo de pelota");
		 Deporte ciclismo = new Deporte("ciclismo", "Deporte de velocípedo");
		 Deporte patinaje = new Deporte("Patinaje", "Deporte de patines o similares");

		 deportes.add(futbol);
		 deportes.add(tennis);
		 deportes.add(natacion);
		 deportes.add(baloncesto);
		 deportes.add(ciclismo);
		 deportes.add(patinaje);
		
		 Implemento balonGolty = new Implemento("Balon talla 8", 30000, 1, futbol, "Golty");
		 Implemento raquetaWilson = new Implemento("Raqueta Wilson Roger Federer", 95000, 2, tennis, "Wilson");
		 Implemento balonWilson = new Implemento("Balón Wilson Evolution", 75000, 3, baloncesto, "Wilson");

		 Transporte bicicletaRuta = new Transporte("Bicicleta Tribals", 3000000, 4, ciclismo, "Bicicleta de ruta");
		 Transporte patineta = new Transporte("Patineta Tony Hawk", 500000, 5, patinaje, "Patinaje acrobático");
		 Transporte patinesSemiprofesionales = new Transporte("Patines SwanLake", 200000, 6, patinaje, "Patinaje clásico");

		 Proteccion casco = new Proteccion("Casco Trail", 45000, 7, "Plástico-Poliestierno", ciclismo);
		 Proteccion coderas = new Proteccion("Coderas Trail", 25000, 8, "Plástico-Poliestierno", patinaje);
		 Proteccion rodilleras = new Proteccion("Rodilleras Trail", 25000, 9, "Plástico-Poliestierno", patinaje);

		 Tren_superior blusaDeportiva = new Tren_superior("Blusa UnderArmour", 50000, 10, "Naranja", "S", "Mujer");
		 Tren_superior chaquetaClimbing = new Tren_superior("Chaqueta Quiksilver", 120000, 11, "Gris", "L", "Hombre");
		 Tren_superior buzoLycra = new Tren_superior("Buzo Lycra Adidas", 60000, 12, "Azul", "M", "Hombre");

		 Tren_inferior pantalonSudadera = new Tren_inferior("Leggings UnderArmour", 45000, 13, "Negro", "S", "Mujer");
		 Tren_inferior pantalonetaTenis = new Tren_inferior("Pantaloneta Nike", 40000, 14, "Blanco", "M", "Mujer");
		 Tren_inferior shortsLycra = new Tren_inferior("Shorts Lycra Adidas", 50000, 15, "Azul", "M", "Hombre");

		 Calzado  zapatillasRunning = new Calzado("Zapatillas Adidas Evolve", 350000, 16, "Blanco-Rojo", "39", "Hombre", "Running");
		 Calzado  botasClimbing = new Calzado("Botas Caterpillar Climbing", 400000, 17, "Marrón", "42", "Hombre", "Climbing");
		 Calzado  guayosFutbol5 = new Calzado("Botines Nike Fut. 5", 275000, 18, "Verde", "38", "Mujer", "Fútbol");

		 Accesorios bandaCabello = new Accesorios("Banda Nike", 20000, 19, "Blanco", "Ajustable", "Unisex");
		 Accesorios munequera = new Accesorios("Muñequera terapéutica Met", 70000, 20, "Negro", "Ajustable", "Unisex");
		 Accesorios gafasDeportivas = new Accesorios("Gafas UV Reflector Ray Ban", 18000, 21, "Blanco-Naranja", "Ajustable", "Unisex");

		 //productoIndumentaria.put("UndArmBlu", blusaDeportiva);

		 //Llenando Estantes
		 
		 
		 productos.add(balonGolty);
		 productos.add(raquetaWilson);
		 productos.add(balonWilson);
		 //Añadiéndolo a su respectivo estante
		 productoEquipamiento.put("balGol",balonGolty);
		 productoEquipamiento.put("raqWil",raquetaWilson);
		 productoEquipamiento.put("balWil",balonWilson);

		 productoEquipamiento.put("biciRu", bicicletaRuta);
		 productoEquipamiento.put("pat", patineta);
		 productoEquipamiento.put("patSemPro", patinesSemiprofesionales);

		 productoEquipamiento.put("cas",casco);
		 productoEquipamiento.put("cod",coderas);
		 productoEquipamiento.put("rod",rodilleras);

		 productoIndumentaria.put("bluDep", blusaDeportiva);
		 productoIndumentaria.put("chaClimb", chaquetaClimbing);
		 productoIndumentaria.put("buzLyc", buzoLycra);

		 productoIndumentaria.put("panSud", pantalonSudadera);
		 productoIndumentaria.put("panTen", pantalonetaTenis);
		 productoIndumentaria.put("shoLyc", shortsLycra);

		 productoIndumentaria.put("zapRun", zapatillasRunning);
		 productoIndumentaria.put("botClimb", botasClimbing);
		 productoIndumentaria.put("guFut5", guayosFutbol5);

		 productoIndumentaria.put("banCab", bandaCabello);
		 productoIndumentaria.put("mun", munequera);
		 productoIndumentaria.put("gafDep", gafasDeportivas);

		 for (Equipamento equipo : productoEquipamiento.values()) {
			String tip = equipo.getClass().getSimpleName();
			bodegaEquipamiento.add(equipo);
			if (tip.equals("Implemento")){
			   estanteImplemento.add(equipo);
			}
			else if(tip.equals("Transporte")) {
			   estanteTransporte.add(equipo);
			}
			else if(tip.equals("Proteccion")) {
			   estanteProteccion.add(equipo);
			}
	   }
		 
		 for (Indumentaria ropa : productoIndumentaria.values()) {
			 String tipo = ropa.getClass().getSimpleName();
			 bodegaIndumentaria.add(ropa);
			 if (tipo.equals("Tren_superior")){
				estanteTrenSup.add(ropa);
			 }
			 else if(tipo.equals("Tren_inferior")) {
				estanteTrenInf.add(ropa);
			 }
			 else if(tipo.equals("Calzado")) {
				estanteCalzado.add(ropa);
			 }
			 else if(tipo.equals("Accesorios")) {
				estanteAccesorios.add(ropa);
			 }
		}

		 //Clientes
		 Carrito DeMario = new Carrito();
		 Cliente Mario = new Cliente(DeMario, "Mario", 805694752);


		 int entrada = 0;
		 while (entrada!=3){//ciclo menu principal
			 int entradaMenuConsulta = 0;
			 int entradaMenuCompra = 0;

			 int entradaSeccion = 0;

			 Principal.menu();
			 entrada = Principal.EntradaMenu();
			 
			 if (entrada == 1) {//entrada al menu de consulta
				 while (entradaMenuConsulta != 2) {//ciclo menu consulta
					 //Principal.consultarProductos(productos);//mostrar todos los productos de la tienda
					 Principal.consultarProductos(productoIndumentaria);
					 Principal.consultarProductosEquipamiento(productoEquipamiento);
					 Principal.consultarProductos(deportes);
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
						 while (entradaSeccion != 8) {
					        Principal.menuEstanterias();
					        entradaSeccion = Principal.EntradaMenu();
					        switch (entradaSeccion) {
					            case 1:
					                Principal.consultarProductos(estanteImplemento);
									Principal.menuConsultarProductoEspecifico();
									int opcion = Principal.EntradaMenu();
									Principal.consultarProductos(estanteImplemento, opcion);
									Principal.opcionAdd();
									int anadir = Principal.EntradaMenu();
									switch (anadir){
										case 1:
											//DeMario.addItem(estanteImplemento.get(opcion-1));
											Principal.addCarrito(estanteImplemento, DeMario, opcion);
											break;
										case 2:
											continue;
									}
									break;
					            case 2:
					                Principal.consultarProductos(estanteTransporte);
									Principal.menuConsultarProductoEspecifico();
									opcion = Principal.EntradaMenu();
									Principal.consultarProductos(estanteTransporte, opcion);
									Principal.opcionAdd();
									anadir = Principal.EntradaMenu();
									switch (anadir){
										case 1:
											//DeMario.addItem(estanteImplemento.get(opcion-1));
											Principal.addCarrito(estanteTransporte, DeMario, opcion);
											break;
										case 2:
											continue;
									}
									break;
					            case 3:
					                Principal.consultarProductos(estanteProteccion);
									Principal.menuConsultarProductoEspecifico();
									opcion = Principal.EntradaMenu();
									Principal.consultarProductos(estanteProteccion, opcion);
									Principal.opcionAdd();
									anadir = Principal.EntradaMenu();
									switch (anadir){
										case 1:
											//DeMario.addItem(estanteImplemento.get(opcion-1));
											Principal.addCarrito(estanteProteccion, DeMario, opcion);
											break;
										case 2:
											continue;
									}
									break;
					            case 4:
					                Principal.consultarProductos(estanteTrenSup);
									Principal.menuConsultarProductoEspecifico();
									opcion = Principal.EntradaMenu();
									Principal.consultarProductos(estanteTrenSup, opcion);
									Principal.opcionAdd();
									anadir = Principal.EntradaMenu();
									switch (anadir){
										case 1:
											//DeMario.addItem(estanteImplemento.get(opcion-1));
											Principal.addCarrito(estanteTrenSup, DeMario, opcion);
											break;
										case 2:
											continue;
									}
									break;
					            case 5:
					                Principal.consultarProductos(estanteTrenInf);
									Principal.menuConsultarProductoEspecifico();
									opcion = Principal.EntradaMenu();
									Principal.consultarProductos(estanteTrenInf, opcion);
									Principal.opcionAdd();
									anadir = Principal.EntradaMenu();
									switch (anadir){
										case 1:
											//DeMario.addItem(estanteImplemento.get(opcion-1));
											Principal.addCarrito(estanteTrenInf, DeMario, opcion);
											break;
										case 2:
											continue;
									}
									break;
					            case 6:
					                Principal.consultarProductos(estanteCalzado);
									Principal.menuConsultarProductoEspecifico();
									opcion = Principal.EntradaMenu();
									Principal.consultarProductos(estanteCalzado, opcion);
									Principal.opcionAdd();
									anadir = Principal.EntradaMenu();
									switch (anadir){
										case 1:
											//DeMario.addItem(estanteImplemento.get(opcion-1));
											Principal.addCarrito(estanteCalzado, DeMario, opcion);
											break;
										case 2:
											continue;
									}
									break;
					            case 7:
					                Principal.consultarProductos(estanteAccesorios);
									Principal.menuConsultarProductoEspecifico();
									opcion = Principal.EntradaMenu();
									Principal.consultarProductos(estanteAccesorios, opcion);
									Principal.opcionAdd();
									anadir = Principal.EntradaMenu();
									switch (anadir){
										case 1:
											//DeMario.addItem(estanteImplemento.get(opcion-1));
											Principal.addCarrito(estanteAccesorios, DeMario, opcion);
											break;
										case 2:
											continue;
									}
									break;
					            case 8:
					                continue;
								default:
									System.out.println("Opción inválida");
					        }
						 }

					 }else if (entradaMenuCompra ==2) {
						 //ver el carrito
						 System.out.println(DeMario);
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




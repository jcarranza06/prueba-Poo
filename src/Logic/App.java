package Logic;
import datos.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import Interfaz.*;

public class App {
	 public static void main(String[] args) throws Exception {
		 Principal.Bienvenida();

		 HashMap<String, Equipamento> productoEquipamiento = new HashMap<String, Equipamento>();
		 HashMap<String, Indumentaria> productoIndumentaria = new HashMap<String, Indumentaria>();

		 //TreeSet<Deporte> deportes = new TreeSet<Deporte>();
		 HashSet<Equipamento> bodegaEquipamiento = new HashSet<Equipamento>();
		 HashSet< Indumentaria> bodegaIndumentaria = new HashSet<Indumentaria>();

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
/*
		 deportes.add(futbol);
		 deportes.add(tennis);
		 deportes.add(natacion);
		 deportes.add(baloncesto);
		 deportes.add(ciclismo);
		 deportes.add(patinaje);*/
		
		 Implemento balonGolty = new Implemento("Balon talla 8", 30000, 1, futbol,"Grande","Amarillo", "Golty","Pierna","Cuero");
		 Implemento raquetaWilson = new Implemento("Raqueta Wilson Roger Federer", 95000, 2, tennis,"Pequena", "Blanca","Wilson","Mano","Cuero");
		 Implemento balonWilson = new Implemento("Balón Wilson Evolution", 75000, 3, baloncesto,"Grande","Naranja", "Wilson","Mano","Cuero");

		 Transporte bicicletaRuta = new Transporte("Bicicleta Tribals", 3000000, 4, ciclismo,"Grande","Plateado", "Bicicleta de ruta","Terrestre","Profesional");
		 Transporte patineta = new Transporte("Patineta Tony Hawk", 500000, 5, patinaje, "Mediano","Azul","Patinaje acrobático","Terrestre","Amateur");
		 Transporte patinesSemiprofesionales = new Transporte("Patines SwanLake", 200000, 6, patinaje,"Grande","Negros", "Patinaje clásico", "Terrestre","Amateur");

		 Proteccion casco = new Proteccion("Casco Trail", 45000, 7, "Plástico-Poliestierno", ciclismo,"Pequeno","Gris","Cabeza", "Certificado");
		 Proteccion coderas = new Proteccion("Coderas Trail", 25000, 8, "Plástico-Poliestierno", patinaje,"Grande","Negro","Codos","Sin certificado");
		 Proteccion rodilleras = new Proteccion("Rodilleras Trail", 25000, 9, "Plástico-Poliestierno", patinaje,"Medio","Negro","Rodillas","Certificado");

		 Tren_superior blusaDeportiva = new Tren_superior("Blusa UnderArmour", 50000, 10, "Naranja", "S", "Mujer","Ajustada", true, "Cortas");
		 Tren_superior chaquetaClimbing = new Tren_superior("Chaqueta Quiksilver", 120000, 11, "Gris", "L", "Hombre","Suelta", false, "Largas");
		 Tren_superior buzoLycra = new Tren_superior("Buzo Lycra Adidas", 60000, 12, "Azul", "M", "Hombre", "Ajustado",false,"Largas");

		 Tren_inferior pantalonSudadera = new Tren_inferior("Leggings UnderArmour", 45000, 13, "Negro", "S", "Mujer","Ajustados",true,"Largos");
		 Tren_inferior pantalonetaTenis = new Tren_inferior("Pantaloneta Nike", 40000, 14, "Blanco", "M", "Mujer","Suelta",true, "Cortos");
		 Tren_inferior shortsLycra = new Tren_inferior("Shorts Lycra Adidas", 50000, 15, "Azul", "M", "Hombre", "Ajustados", false, "Largos");

		 Calzado  zapatillasRunning = new Calzado("Zapatillas Adidas Evolve", 350000, 16, "Blanco-Rojo", "39", "Hombre", "Running","Adidas","Premium");
		 Calzado  botasClimbing = new Calzado("Botas Caterpillar Climbing", 400000, 17, "Marrón", "42", "Hombre", "Climbing","Caterpillar","Premium");
		 Calzado  guayosFutbol5 = new Calzado("Botines Nike Fut. 5", 275000, 18, "Verde", "38", "Mujer", "Fútbol","Nike","Normal");

		 Accesorios bandaCabello = new Accesorios("Banda Nike", 20000, 19, "Blanco", "Ajustable", "Unisex","Algodon","Deportivo","Circular, minimalista");
		 Accesorios munequera = new Accesorios("Muñequera terapéutica Met", 70000, 20, "Negro", "Ajustable", "Unisex","Algodon","Terapeutico","Ovalada");
		 Accesorios gafasDeportivas = new Accesorios("Gafas UV Reflector Ray Ban", 18000, 21, "Blanco-Naranja", "Ajustable", "Unisex","Titanio","Lujo","Lentes circulares, con relieve en el marco");

		 //Llenando Estantes
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
		 
		 Cliente Mario = new Cliente("Mario Alfonso", 805694752);
		 Carrito carritoMario = new Carrito(10, Mario);
		 Principal.asignarCarrito(Mario, carritoMario);
		 
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
					 //Falta menú
					 //Principal.consultarProductos(productoIndumentaria);
					 //Principal.consultarProductosEquipamiento(productoEquipamiento);
					 //Principal.consultarDeportes(deportes);
					 Principal.consultarBodegaEquipamiento(bodegaEquipamiento);
					 Principal.consultarBodegaIndumentaria(bodegaIndumentaria);
					 Principal.menuConsulta();
					 
					 entradaMenuConsulta = Principal.EntradaMenu();
					 if (entradaMenuConsulta == 1) {
						 Principal.menuConsultarProductoEspecificoNombre();
						 //int productoConsulta = Principal.EntradaMenu();
						 //Principal.consultarProductos(productos, productoConsulta);// se consulta el producto por su index de la lista productos 
						 String entradaPorNombre = Principal.EntradaMenuString();
						 Principal.devolverPorNombre(estanteImplemento, entradaPorNombre);
						 Principal.devolverPorNombre(estanteTransporte, entradaPorNombre);
						 Principal.devolverPorNombre(estanteProteccion, entradaPorNombre);
						 Principal.devolverPorNombre(estanteTrenInf, entradaPorNombre);
						 Principal.devolverPorNombre(estanteTrenSup, entradaPorNombre);
						 Principal.devolverPorNombre(estanteCalzado, entradaPorNombre);
						 Principal.devolverPorNombre(estanteAccesorios, entradaPorNombre);
						 
						 entradaMenuConsulta =2;
						 continue;
						 
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
					        entradaSeccion = 8;
					        entradaSeccion = Principal.EntradaMenu();
					        
					        ArrayList<Producto> estanteParaSeleccion = new ArrayList<Producto>();
					        boolean eleg = false;
					        switch (entradaSeccion) {
					        case 1:
					        	estanteParaSeleccion = estanteImplemento;
					        	eleg = true;
					        	break;
					        case 2:
					        	estanteParaSeleccion = estanteTransporte;
					        	eleg = true;
					        	break;
					        case 3:
					        	estanteParaSeleccion = estanteProteccion;
					        	eleg = true;
					        	break;
					        case 4:
					        	estanteParaSeleccion = estanteTrenSup;
					        	eleg = true;
					        	break;
					        case 5:
					        	estanteParaSeleccion = estanteTrenInf;
					        	eleg = true;
					        	break;
					        case 6:
					        	estanteParaSeleccion = estanteCalzado;
					        	eleg = true;
					        	break;
					        case 7:
					        	estanteParaSeleccion = estanteAccesorios;
					        	eleg = true;
					        	break;
					        case 8:
					        	
					        	continue;
					        	
					        default:
					        	System.out.println("Opción inválida");
					        }
					        
					        
					        if (eleg) {
					        	Principal.consultarProductos(estanteParaSeleccion);
					        	Principal.menuConsultarProductoEspecifico();
					        	int[] opcion = Principal.EntradaMenuS();
							
					        	if (opcion.length >= 2) {
					        		for (int i =0; i< opcion.length ;i++ ) {
					        			Principal.addCarrito(estanteParaSeleccion, carritoMario, opcion[i]);
					        		}
					        		Principal.mensajeExitoso();
					        	}else {
					        	try {
					        	Principal.consultarProductos(estanteParaSeleccion, opcion[0]);
					        	if (opcion.length > 0) {
					        		//System.out.println(opcion[0]);
					        	Principal.opcionAdd();
					        	int anadir = Principal.EntradaMenu();
					        	switch (anadir){
									case 1:
										//DeMario.addItem(estanteImplemento.get(opcion-1));
										Principal.addCarrito(estanteParaSeleccion, carritoMario, opcion[0]);
										break;
									case 2:
										continue;
					        				}
					        			}}catch(Exception e){
					        				Principal.mostrarError();
					        			}
					        		}
					        	}
					        
					        
					        entradaSeccion=0;
						 }

					 }else if (entradaMenuCompra ==2) {
						 //ver el carrito2
						 System.out.println(carritoMario);
						 
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




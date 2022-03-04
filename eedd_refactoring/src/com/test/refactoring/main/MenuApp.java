package com.test.refactoring.main;

import java.util.Random;
import java.util.Scanner;

import com.test.refactoring.Business.Camion;
import com.test.refactoring.Business.Coche;
import com.test.refactoring.utils.Utils;

public class MenuApp {
	/**
	 * Recibe el Main principal donde se piden todos los datos de
	 * nombre,apellido,numero de coches,numero de camiones
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		mostrarPresentacion();

		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = sc.nextLine();

		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fechaActual());
		System.out.println("/*** " + Utils.horaActual());
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");

		System.out.println("Introduce el n�mero de coches : ");
		int numCoches = sc.nextInt();
		Coche[] listaCoches = new Coche[numCoches];
		for (int i = 0; i < numCoches; i++) {
			listaCoches[i] = new Coche();
			listaCoches[i].acelerar(20);
		}

		System.out.println("Introduce el n�mero de camiones : ");
		int numCamiones = sc.nextInt();
		Camion[] listaCamiones = new Camion[numCamiones];
		for (int i = 0; i < numCamiones; i++) {
			listaCamiones[i] = new Camion();
			listaCamiones[i].acelerar(15);
		}

		detenerVehiculos(listaCoches);
		detenerVehiculos(listaCamiones);

		sc.close();

	}

	/**
	 * Recibe el método mostrar Presentación donde nos dice que hay que eliminar los
	 * olores
	 */

	private static void mostrarPresentacion() {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}

	/**
	 * Recibe el método detener vehiculos que nos dice los coches que están
	 * detenidos
	 * 
	 * @param listaCoches
	 */

	private static void detenerVehiculos(Coche[] listaCoches) {
		for (int i = 0; i < listaCoches.length; i++) {
			listaCoches[i].detener();
		}
	}

	/**
	 * Recibe el método detener vehiculos que nos dice los camiones que están
	 * detenidos
	 * 
	 * @param listaCamiones
	 */

	private static void detenerVehiculos(Camion[] listaCamiones) {
		for (int i = 0; i < listaCamiones.length; i++) {
			listaCamiones[i].detener();
		}
	}

}

package BoletinColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Crear una clase llamada Empleado, con los atributos nombre y sueldo. Realizar
		 * un programa que pida por pantalla 4 empleados y hacer un listado donde se
		 * muestre un listado ordenado en orden ascendente y descendente teniendo en
		 * cuenta el sueldo como criterio de ordenación
		 */
		ArrayList<Empleado> lista = new ArrayList <Empleado>();
		
		for (int i = 0; i < 4; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduce sueldo: ");
			double sueldo = sc.nextDouble();
			
			Empleado e = new Empleado(nombre, sueldo);
			lista.add(e);
		}

		
		//DATOS DE EJEMPLO
		/*Empleado e= new Empleado ("pedro",500.0);
		lista.add(e);
		
		e = new Empleado ("juan",30.0);
		lista.add(e);
		
		e= new Empleado ("maria",200.0);
		lista.add(e);
		
		e= new Empleado ("gema",15.0);
		lista.add(e);*/
		//FIN DATOS EJEMPLO 
		
		
		//orden ASCENDENTE
		Collections.sort(lista);
		System.out.println("Ascendente: "+lista.toString());
		
		//orden DESCENDENTE
		Collections.reverse(lista);
		System.out.println("Descendente: "+lista.toString());
		
	}

}

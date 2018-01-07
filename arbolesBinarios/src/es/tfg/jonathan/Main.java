package es.tfg.jonathan;

import java.security.acl.Permission;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import es.tfg.arboles.Arbol;
import es.tfg.ficheros.Fichero;

/**
 * 
 * @author JCY
 *
 */
public class Main {
	
	/**
	 * Funci�n principal cuya complejidad es O(n) donde n es el n�mero de nodos del �rbol (longitud del array)
	 * @param args
	 */
	public static void main(String[] args) {
		// Atributos para gestionar el fichero
   		String nombreFich = "jonathan3.txt";
	    Fichero fichero = new Fichero(nombreFich);
	    String lineaFichero = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el n�mero de niveles que tendr� su �rbol: ");
		int numNiveles = sc.nextInt();
		int numNodos = (int) (Math.pow(2, numNiveles)); // Gracias a los niveles del �rbol sacamos el n�mero de nodos
		double penalizacion = 2;
		double peso = 0;
		
		ArrayList<Integer> origen = new ArrayList<Integer>(Collections.nCopies(numNodos, 0)); // Inicializamos un array de 'numNodos' posiciones y lo inicializamos a 0
		ArrayList<Integer> mutante = new ArrayList<Integer>(Collections.nCopies(numNodos, 0)); // Tambi�n lo inicializamos porque si no salta error (obvio)
		
		mutante.set(0, (int) peso); // En la primera posici�n meteremos el peso, que al principio ser� 0
		for(int i = 1; i < numNodos; i++) // El resto lo inicializamos de forma aleatoria
			mutante.set(i, randInt(0, 1)); 

		for(int i = 1; i < numNodos; i++){ // Calculamos el peso del mutante
			if(i == penalizacion) // Comprobamos si es necesario actualizar la penalizaci�n (porque hemos "descendido" un nivel en el �rbol)
				penalizacion = penalizacion * 2; 
			if(origen.get(i) != mutante.get(i)){ // Si los elementos i-�simos son distintos
				peso = peso + (1/penalizacion); // Actualizamos el peso del muntante: nuevo peso = peso actual + 1/penalizacion
			}
		}
		
		// Actualizamos el peso del mutante en la primera posicion
		//mutante.add(0, (int) peso);
		// A modo de prueba, se imprimen ambos arrays y el peso total del mutante
		System.out.println("Array Origen: ");
		for(int i = 1; i < numNodos; i++)
			System.out.print(" " + origen.get(i) + " ");
		
		System.out.println("");
		
		System.out.println("Array Mutante: ");
		
		lineaFichero += ""+ Double.toString(peso).replace('.', ',') +" ";
		for(int i = 1; i < numNodos; i++) {
			System.out.print(" " + mutante.get(i) + " ");
			lineaFichero += " " + mutante.get(i) + " "; 
		}
		
		
		System.out.println("");
		System.out.println("Peso del mutante: " + peso);
		
		
		// Guardamos el mutante
		fichero.abrirFicheroOut(nombreFich);
		fichero.escribirFila(lineaFichero);
		fichero.cerrarFicheroOut();
		
		// Leer fichero
		fichero.abrirFicheroIn();
		double pesoFichero = fichero.leerDouble(fichero.getScanner());
		ArrayList<Integer> mutanteFichero = fichero.leerListaEnteros(fichero.getScanner());
	
		fichero.cerrarFicheroIn();
		System.out.println(pesoFichero);
		System.out.println(mutanteFichero);
		
	}
	
	/**
	 * Generador de n�meros aleatorios entre el intervalo [min, max]
	 * @param min
	 * @param max
	 * @return
	 */
	public static int randInt(int min, int max){
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
	}
}

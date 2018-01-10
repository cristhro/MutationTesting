package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import javax.management.openmbean.OpenDataException;
import org.omg.PortableServer.THREAD_POLICY_ID;
import data.CustomFileRead;
import data.CustomFileWrite;

public class Engine {
	private String fileName;
    private CustomFileWrite fileWrite;
    private CustomFileRead fileRead;
	private double weighMutant;
	private double weighTest;
	private int nodes;
	private int levels;
	Scanner sc;
	Scanner in;

	/**
	 * Constructora sin argumentos
	 * @throws IOException 
	 */
	public Engine() throws IOException {
		this.sc = new Scanner(System.in);
		this.weighMutant = 0;
		this.weighTest = 0;
		this.nodes = 0;
		this.levels = 0;
	}
	
	/**
	 * Función principal de 'Engine' que controla la ejecución y cuya complejidad es O(n),
	 * donde n es el número de nodos que tiene el árbol
	 * @throws IOException 
	 */
	public void start() throws IOException{
		System.out.println("Elija una opción: \n" + 
				" (1) generar mutante \n" + 
				" (2) aplicar test suite");
		if(this.sc.nextInt() == 1)
			generateMutant();
		else
			applyTest();
	}
	
	/**
	 * Lleva a cabo la generación de un mutante (o muchos) y lo almacena
	 * @throws IOException 
	 */
	public void generateMutant() throws IOException{
		int totalArrays, op;
		System.out.println("Elija una opción: \n" + 
				" (1) uno, mucha profundidad \n" + 
				" (2) algunos, podrían repetirse \n" + 
				" (3) todos, poca profundidad");
		op = this.sc.nextInt();
		System.out.println("Introduzca el número de niveles: ");
		this.levels = this.sc.nextInt();
		this.nodes = (int) (Math.pow(2, this.levels));
		ArrayList<Integer> origen = initializeOrigen();
		
		if(op == 3){
			
		}else{
			if(op == 2){
				System.out.println("Introduzca el número de árboles: ");
				totalArrays = this.sc.nextInt();	
			}else
				totalArrays = 1;
			for(int i = 0; i < totalArrays; i++){
				this.fileName = "prueba" + i + ".txt";
				this.fileWrite = new CustomFileWrite(this.fileName);
				ArrayList<Integer> mutant = initializeMutant();
				calculateWeigh(origen, mutant);
				saveMutant(mutant);
				this.weighMutant = 0; // Reiniciamos el peso
			}
		}
		System.out.println("He terminado de generar.");
	}
	
	/**
	 * Aplica un test suite elegido por el usuario
	 * @throws IOException 
	 */
	public void applyTest() throws IOException{
		// Leer el mutante desde fichero
		this.fileRead = new CustomFileRead("prueba0.txt");
		this.in = new Scanner(this.fileRead);
		this.weighMutant = this.fileRead.readDouble(this.in);
		ArrayList<Integer> mutant = this.fileRead.readArray(this.in);
		
		//this.nodes = (int) (Math.pow(2, 3));
		//ArrayList<Integer> mutant = initializeMutant();
		
		ArrayList<Integer> origen = new ArrayList<Integer>(Collections.nCopies(mutant.size(), 0));
		
		// Pedir un test suite al usuario
		System.out.println("Introduzca la longitud del test (debe ser menor al números de niveles): ");
		int longTest = this.sc.nextInt();
		ArrayList<Integer> positions = new ArrayList<Integer>(Collections.nCopies(longTest, 1)); // Creamos un array para almacenar las posiciones a evaluar
		positions.set(0, 1); // Obviamente, en la primera posición siempre irá la raíz del árbol
		System.out.println("A continuación, deberá escoger el camino que desea testear. Para ello, pulse (a) para ir \n"
				+ "a la izquierda o (b) para ir a la derecha en el árbol, tantas veces como la longitud de su test (-1 por la raíz).");
		char op;
		for(int i = 1; i < longTest; i++){
			op = this.sc.next().charAt(0);
			if(op == 'a') // Si elige ir hacia la izquierda
				positions.set(i, positions.get(i-1)*2); // Metemos el índice del hijo izquierdo
			else // si elige ir hacia la derecha
				positions.set(i, (positions.get(i-1)*2) + 1); // Metemos el índice del hijo derecho	
		}
		
		// Según el test suite, comparar los arrays 'origen' y 'mutant'
		int j = 0;
		boolean keep = true;
		while(keep && j < positions.size()){ // Mientras no le hayamos matado o queden posiciones por comprobar
			if(origen.get(positions.get(j)) != mutant.get(positions.get(j))){
				keep = false;
				// Falta calcular el peso
			}
			j++;
		}
		System.out.println("He terminado de aplicar el test.");
	}
	
	/**
	 * Almacena el array 'mutant' en el fichero de escritura
	 * @param file
	 * @param fileName
	 * @param mutant
	 * @param weigh
	 */
	public void saveMutant(ArrayList<Integer> mutant){
		String text = "";
		text += Double.toString(this.weighMutant) + " 0 "; // Reemplazamos el punto por una coma
		for(int i = 1; i < mutant.size(); i++) // Almacenamos el array
			text += mutant.get(i) + " "; 
		text += mutant.get(0); // Metemos el -1 al final del texto
	
		this.fileWrite.writeFile(this.fileWrite, text);
		this.fileWrite.closeFileWrite(this.fileWrite);
	}
	
	/**
	 * Calcula el peso del mutante comparándolo con el origen
	 * @param origen
	 * @param mutant
	 * @return
	 */
	public void calculateWeigh(ArrayList<Integer> origen, ArrayList<Integer> mutant){
		double penalty = 2;
		for(int i = 1; i < this.nodes; i++){ 
			if(i == penalty) // Comprobamos si es necesario actualizar la penalización (porque hemos "descendido" en el árbol)
				penalty = penalty * 2; 
			if(origen.get(i) != mutant.get(i)) // Si los elementos i-ésimos son distintos
				this.weighMutant = this.weighMutant + (1/penalty); // Actualizamos el peso del muntante; new weigh = weigh + 1/penalty
		}
	}
	
	/**
	 * Inicializa el array original
	 * @param nodes
	 * @return
	 */
	public ArrayList<Integer> initializeOrigen(){
		ArrayList<Integer> origen = new ArrayList<Integer>(Collections.nCopies(this.nodes, 0));
		return origen;
	}
	
	/**
	 * Inicializa un mutante
	 * @param nodes
	 * @return
	 */
	public ArrayList<Integer> initializeMutant(){
		ArrayList<Integer> mutant = new ArrayList<Integer>(Collections.nCopies(this.nodes, 0));
		for(int i = 1; i < this.nodes; i++) // Inicializamos de forma aleatoria
			mutant.set(i, randInt(0, 1));
		mutant.set(0, -1); // En la primera posición metemos -1 porque será útil al escribir en fichero
		return mutant;
	}
	
	/**
	 * Generador de números aleatorios entre el intervalo [min, max]
	 * @param min
	 * @param max
	 * @return
	 */
	public static int randInt(int min, int max){
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
	}
}

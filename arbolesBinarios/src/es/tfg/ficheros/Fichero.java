package es.tfg.ficheros;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero implements IFichero{
	private File ficheroIn;
	private FileWriter ficheroOut;
	private int finDeLinea;
	private Scanner in;
	
	public Fichero() {
		super();
	}
	public Fichero(String nombreFichero) {
		super();
		this.ficheroIn = new File(getCurrentPath() + nombreFichero);
		this.finDeLinea = -1;
	}
	public Fichero(String nombreFichero, int finDeLinea) {
		super();
		this.ficheroIn =  new File(getCurrentPath() + nombreFichero);;
		this.finDeLinea = finDeLinea;
	}
	
	/*
	 * Precondicion que el 'scanner' este instanciado.
	 * */
	@Override
	public int leerEntero(Scanner in) {
		return in.nextInt();
	}

	/*
	 * Precondicion que el 'scanner' este instanciado.
	 * */
	@Override
	public ArrayList<Integer> leerListaEnteros(Scanner in) {
		ArrayList<Integer> lista = new ArrayList<Integer>();

			// Leemos los enteros
			int entero = leerEntero(in);
			
			while(entero != this.finDeLinea) {
				if (entero != -1) {
					lista.add(entero);
				}
				// Leo el siguiente entero	
				entero = leerEntero(in);
			}
			
		return lista;
	}

	@Override
	public ArrayList<ArrayList<Integer>> ejecutarLeerColeccionListasEnteros() {
		ArrayList<ArrayList<Integer>> coleccionListas = new ArrayList<ArrayList<Integer>>();
		Scanner in = null;
		
		try {
			// Creamos el scanner
			in = new Scanner(this.ficheroIn);
			
			// Leemos los enteros
			while(in.hasNextInt()){
				ArrayList<Integer> lista = leerListaEnteros(in);
				coleccionListas.add(lista);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: No se pudo leer el fichero." + e.getMessage());
			in.close();
		}finally {
			
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (in != null)
					in.close();
			} catch (Exception ex2) {
				System.out.println("ERROR: no se pudo cerrar el fichero" + ex2.getMessage());
			}
		}
		return coleccionListas;
	}
	
	public static void main(String[] args) {
	
			String nombreFichero = "fichero.txt";
			String nombreFicheroOut = "fichero4.txt";
			Fichero f = new Fichero(nombreFichero);
			
			ArrayList<ArrayList<Integer>> l = f.ejecutarLeerColeccionListasEnteros();
			f.ejecutarGuardarColeccionListasEnteros(l, nombreFicheroOut);	
			
			System.out.println(l.toString());
	}
	@Override
	public void setFinDeLinea(int finDeLine) {
		this.finDeLinea = finDeLine;
	}
	@Override
	public void ejecutarGuardarColeccionListasEnteros(ArrayList<ArrayList<Integer>> coleccionEnteros, String nombreFichOut) {
		
		/** FORMA 1 DE ESCRITURA **/
		FileWriter fichero = null;
		
		try {
			fichero = new FileWriter(getCurrentPath() + nombreFichOut);
			
			// Escribimos linea a linea en el fichero
			for (ArrayList<Integer> linea : coleccionEnteros) {
				for (Integer entero : linea) {
					fichero.write(""+entero+" ");
					
				}
				fichero.write(""+-1+"\n");
			}

			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
	private String getCurrentPath() {
		String current=null;
		try {
			current = new java.io.File( "." ).getCanonicalPath();
		} catch (IOException e) {
			System.out.println("ERROR: Error al obtener el path del fichero");
		}
		return current + "/src/es/tfg/ficheros/datos/";
	}
	@Override
	public void abrirFicheroOut(String nombreFichOut) {
		try {
			this.ficheroOut = new FileWriter(getCurrentPath() + nombreFichOut);

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: (abrirFicheroOut) " + ex.getMessage());
		}
		
	}
	@Override
	public void cerrarFicheroOut() {
		try {
			this.ficheroOut.close();
		} catch (IOException e) {
			System.out.println("Mensaje de la excepción: (cerrarFicheroOut) " + e.getMessage());
			e.printStackTrace();
		}
	}
	@Override
	public void escribirFila(String linea) {
		try {
			this.ficheroOut.write(linea + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void abrirFicheroIn(String nombreFichIn) throws FileNotFoundException {
		this.in = new Scanner(this.ficheroIn);
	}
	@Override
	public void cerrarFicheroIn() {
		this.in.close();
	}
	@Override
	public Scanner getScanner() {
		// TODO Auto-generated method stub
		return this.in;
	}
}

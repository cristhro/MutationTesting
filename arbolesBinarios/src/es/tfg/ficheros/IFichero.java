package es.tfg.ficheros;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public interface IFichero {
	// funciones de lectura
	public void abrirFicheroIn() ;
	public void cerrarFicheroIn();
	public int leerEntero(Scanner in);
	public Double leerDouble(Scanner in);
	public void setFinDeLinea(int finDeLine);
	public ArrayList<Integer> leerListaEnteros(Scanner in);
	public ArrayList<Double> leerListaDoubles(Scanner in);
	public ArrayList<ArrayList<Integer>> ejecutarLeerColeccionListasEnteros();
	public Scanner getScanner();
	
	// funciones de escritura
	public void escribirFila(String linea);
	public void abrirFicheroOut(String nombreFichOut);
	public void cerrarFicheroOut();
	public void ejecutarGuardarColeccionListasEnteros(ArrayList<ArrayList<Integer>> coleccionEnteros, String nombreFichOut);
	

}

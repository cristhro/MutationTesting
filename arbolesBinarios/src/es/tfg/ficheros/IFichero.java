package es.tfg.ficheros;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public interface IFichero {
	public void abrirFicheroIn(String nombreFichIn) throws FileNotFoundException;
	public void cerrarFicheroIn();
	public int leerEntero(Scanner in);
	public void setFinDeLinea(int finDeLine);
	public ArrayList<Integer> leerListaEnteros(Scanner in);
	public ArrayList<ArrayList<Integer>> ejecutarLeerColeccionListasEnteros();
	public void ejecutarGuardarColeccionListasEnteros(ArrayList<ArrayList<Integer>> coleccionEnteros, String nombreFichOut);
	
	public void escribirFila(String linea);
	public void abrirFicheroOut(String nombreFichOut);
	public void cerrarFicheroOut();
	public Scanner getScanner();
}

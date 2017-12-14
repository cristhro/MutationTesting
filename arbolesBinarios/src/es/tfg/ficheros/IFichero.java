package es.tfg.ficheros;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public interface IFichero {
	public int leerEntero(Scanner in);
	public void setFinDeLinea(int finDeLine);
	public ArrayList<Integer> leerListaEnteros(Scanner in);
	public ArrayList<ArrayList<Integer>> ejecutarLeerColeccionListasEnteros();
	public void ejecutarGuardarColeccionListasEnteros(ArrayList<ArrayList<Integer>> coleccionEnteros, String nombreFichOut);
	public Boolean guardarListaEnteros();
}

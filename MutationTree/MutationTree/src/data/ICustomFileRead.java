package data;

import java.util.ArrayList;
import java.util.Scanner;

public interface ICustomFileRead {
	/** Abre el fichero de lectura */
	public abstract void openFile(CustomFileRead file);
	/** Cierra el fichero de lectura */
	public abstract void closeFileRead(CustomFileRead file);
	/** Lee un array del fichero de lectura */
	public abstract ArrayList<Integer> readArray(Scanner in);
	/** Lee un double de fichero de lectura*/
	public abstract Double readDouble(Scanner in);
	/**  */
	public abstract ArrayList<ArrayList<Integer>> ejecutarLeerColeccionListasEnteros();
	/**  */
	public abstract void ejecutarGuardarColeccionListasEnteros(ArrayList<ArrayList<Integer>> coleccionEnteros, String fileOut);
}

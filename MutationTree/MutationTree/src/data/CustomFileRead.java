package data;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomFileRead extends FileReader implements ICustomFileRead{
	private int endLine;
	
	/**
	 * Constructora que recibe nombre de fichero
	 * @param name
	 * @throws IOException 
	 */
	public CustomFileRead(String name) throws IOException {
		super(new java.io.File( "." ).getCanonicalPath() + "/src/data/files/" + name);
		this.endLine = -1;
	}
	
	@Override
	public Double readDouble(Scanner in) {
		return in.nextDouble();
	}

	@Override
	public ArrayList<Integer> readArray(Scanner in) {
		ArrayList<Integer> mutant = new ArrayList<Integer>();
		int element = in.nextInt();
		/*do {
			if (element != endLine)
				mutant.add(element);
			element = in.nextInt();
		} while (element != endLine);*/
			while(element != endLine) {
				if (element != endLine)
					mutant.add(element);
				element = in.nextInt();
			}
		return mutant;
	}
	
	@Override
	public void openFile(CustomFileRead file) {
		// TODO Auto-generated method stub
	}

	@Override
	public void closeFileRead(CustomFileRead file) {
		try {
			file.close();
		} catch (IOException e) {
			System.out.println("Error - closeFileWrite: " + e.getMessage());
		}
	}

	@Override
	public ArrayList<ArrayList<Integer>> ejecutarLeerColeccionListasEnteros() {
		ArrayList<ArrayList<Integer>> coleccionListas = new ArrayList<ArrayList<Integer>>();
		Scanner in = null;
	/*	
		try {
			// Creamos el scanner
			in = new Scanner(this.fileIn);
			
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
		}*/
		return coleccionListas;
	}
	
	@Override
	public void ejecutarGuardarColeccionListasEnteros(ArrayList<ArrayList<Integer>> coleccionEnteros, String nombreFichOut) {
		/*
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
		}*/
	}
}
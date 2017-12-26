package es.tfg.mutantes;

import java.util.ArrayList;
import java.util.LinkedList;

import es.tfg.arboles.Arbol;

public interface IMutantes {
	 public ArrayList<LinkedList<Integer>> generarColeccionListasMutantes();
	 public void generarFicheroMutantes(String nombreFich);
	 public ArrayList<Arbol> getColeccionArbolMutantes(ArrayList<LinkedList<Integer>> coleccionListasMutantes);
}

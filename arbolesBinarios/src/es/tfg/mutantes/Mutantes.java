package es.tfg.mutantes;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import es.tfg.arboles.Arbol;
import es.tfg.ficheros.Fichero;

public class Mutantes  implements IMutantes{
	
	//genero dos ficheros: fichero1 , fichero2
	 private ArrayList<LinkedList<Integer> > conjuntoMutantes = new ArrayList<LinkedList<Integer>>();
	 private LinkedList<Integer> listaValores =new LinkedList<Integer>();
	 
	 public Mutantes() {
		super();
		listaValores.add(1);
		listaValores.add(2);
		listaValores.add(3);
		listaValores.add(4);
		listaValores.add(5);
		listaValores.add(6);
		listaValores.add(7);
		listaValores.add(8);
	}
	
	 public Mutantes(LinkedList<Integer> listaValores) {
			super();
			this.listaValores = listaValores;
	}
	
	private ArrayList<LinkedList<Integer>> getMutantes(LinkedList<Integer> list){
		
		/** FORMA 1 DE ESCRITURA **/
		
		if(list.size() == 1){
			//escribir lista en el fichero1
			
			conjuntoMutantes.add(list);
		}else{
			int cabeza = list.remove(0);
			getMutantes(list);
			generaAux(cabeza);
		}	
		
		return conjuntoMutantes;
	}
	private void getMutantes(String a, LinkedList<Integer> conjunto, Fichero fichero) {
        if (conjunto.size()==1)
        {
        		String linea = a+ " " +conjunto.get(0) + " -1 ";
        		fichero.escribirFila(linea);
        }
        for (int i=0;i<conjunto.size();i++)
        {
            Integer b = conjunto.remove(i);
            getMutantes (a+ " " + b, conjunto, fichero);
            conjunto.add(i,b);
        }
    }

	private  void generaAux( int cabeza) {
		ArrayList<LinkedList<Integer>> tempConjunto = new ArrayList<LinkedList<Integer>>();
		
		//leer fichero1, la siguiente vez, fichero2, siguiente fichero1 ...
		for(LinkedList<Integer> x : conjuntoMutantes){
			int posiciones = x.size()+1;
			for(int i = 0; i<posiciones;i++){
				LinkedList<Integer> nuevoHijo = new LinkedList<Integer>(x);
				nuevoHijo.add(i, cabeza);
				tempConjunto.add(nuevoHijo);
			}
		}
		conjuntoMutantes = tempConjunto;
	}
	

	@Override
	public ArrayList<LinkedList<Integer>> generarColeccionListasMutantes() {
		return getMutantes(this.listaValores);
	}

	@Override
	public ArrayList<Arbol> getColeccionArbolMutantes(ArrayList<LinkedList<Integer>> coleccionListasMutantes) {
		ArrayList<Arbol> coleccionArboles = new ArrayList<Arbol>();
		
		for(LinkedList<Integer> mutante : coleccionListasMutantes){
			Arbol arbolBinario = new Arbol(mutante);
			coleccionArboles.add(arbolBinario);
		}
		return coleccionArboles;
	}
	
	@Override
	public void generarFicheroMutantes(String nombreFich) {
		Fichero fichero = new Fichero();
		fichero.abrirFicheroOut(nombreFich);

        this.getMutantes("", this.listaValores, fichero);
        
        fichero.cerrarFicheroOut();
	}
	public static void main(String[] args) {
		Mutantes mutantes = new Mutantes();
		mutantes.generarFicheroMutantes("mutantes.txt");
	}

}



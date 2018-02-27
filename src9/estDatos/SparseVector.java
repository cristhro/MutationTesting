package estDatos;


public interface SparseVector {
    
	/**
	 * Retorna la dimensión del vector
	 * @return la dimensión del vector
	 */
	int size ();
   
	/**
	 * Retorna el número de elementos no "nulos" del vector
	 * @return el número de elementos no "nulos" del vector
	 */	
    int activeElements();


	/**
	 * Retorna el valor por defecto del vector
	 * @return el valor por defecto del vector
	 */	
     double defaultValue();	 
    
	/**
	 * Añade un par (posición, valor) al vector
	 * @param i la posición del elemento en el vector
	 * @param value el valor a añadir
	 * @throws IndexOutOfBoundsException si la posición es incorrecta
	 */
    void put(int i, double value);	

	/**
	 * Retorna el valor del vector en una posición determinada
	 * @param i la posición en el vector
	 * @throws IndexOutOfBoundsException si la posición es incorrecta
	 * @return el valor de la posición indicada
	 */
    double get(int i);
    
		
	/**
	 * Retorna un vector resultado del producto de un escalar por un vector
	 * @param alpha el escalar para multiplicar por el vector receptor
	 * @return el vector alpha*this
	 */
    SparseVector scale(double alpha);
    
	/**
	 * Retorna un vector resultado de la suma de dos vectores 
	 * @param b el vector para sumar al vector receptor
	 * @return el vector this+v
	 * @throws RuntimeException si las dimensiones de los vectores no coinciden
	 */
    SparseVector plus(SparseVector v);
    
	/**
	 * Retorna el producto escalar de dos vectores
	 * @param b el vector para operar con this
	 * @return el producto escalar this*v
	 * @throws RuntimeException si las dimensiones de los vectores no coinciden
	 */
    double dot(SparseVector v) ;
    
    // Igual que el anterior siguiendo el esquema de mezcla
    double dotMerge(SparseVector v);
}	
		

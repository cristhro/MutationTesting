package estDatos;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapVector implements SparseVector {
	//diccionario de pares 
	TreeMap<Integer, Double> data; 
	//dimensión de vector 
	int dim; 
	//valor que se repite (no se guarda)
	double nullValue; 
	 
	
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.dim;
	}

	public MapVector( int dim, double nullValue) {
		this.data=new TreeMap<Integer, Double>();
		this.dim = dim;
		this.nullValue = nullValue;
	}
	
	public MapVector(MapVector d){
		this.data=new TreeMap<Integer, Double>();
		this.dim=d.size();
		this.nullValue=d.nullValue;
	}

	

	@Override
	public int activeElements() {
		// TODO Auto-generated method stub
		return this.data.size();
	}

	@Override
	public double defaultValue() {
		
		// TODO Auto-generated method stub
		
		return nullValue;
	}

	@Override
	public void put(int i, double value) {
		// TODO Auto-generated method stub
		if(i>=0 && i<=this.size()){

		}
		if(value==this.defaultValue()){
			this.data.remove(i);
		}
		this.data.put(i, value);

	}

	@Override
	public double get(int i) {
		// TODO Auto-generated method stub
		if(i<0 || i>this.size()-1){
			throw new IndexOutOfBoundsException();
		}
		if(!(this.data.containsKey(i))){
			return nullValue;	
			}
		return this.data.get(i);
		//return 0;
	}

	@Override
	public SparseVector scale(double alpha) {
		// TODO Auto-generated method stub
		Iterator<Map.Entry<Integer,Double>> i=this.data.entrySet().iterator();
		MapVector nuevo=new MapVector(this);
		for(Map.Entry<Integer, Double> x: nuevo.data.entrySet()){
			x.setValue(i.next().getValue()*alpha);
		}
		
		return nuevo;
	}

	@Override
	public SparseVector plus(SparseVector v) {
		// TODO Auto-generated method stub
		if(v.size()!=this.size()){
			throw new RuntimeException();
		}
		
		Iterator<Map.Entry<Integer,Double>> i=this.data.entrySet().iterator();
		MapVector nuevo=new MapVector(this);
		MapVector tempDeV=new MapVector((MapVector)v);
		for(Map.Entry<Integer, Double> x: tempDeV.data.entrySet()){
			x.setValue(i.next().getValue()+x.getKey().intValue());
		}
		return nuevo;
	}

	@Override
	public double dot(SparseVector v) {
		// TODO Auto-generated method stub
		if(v.size()!=this.size()){
			throw new RuntimeException();
		}
		Iterator<Map.Entry<Integer,Double>> i=this.data.entrySet().iterator();
		MapVector nuevo=new MapVector(this);
		MapVector tempDeV=new MapVector((MapVector)v);
		for(Map.Entry<Integer, Double> x: tempDeV.data.entrySet()){
			x.setValue(i.next().getValue()* x.getKey().intValue());
		}
		double suma=0;
		Iterator<Map.Entry<Integer,Double>> j=nuevo.data.entrySet().iterator();
		while(j.hasNext()){
			suma+=j.next().getValue();
		}
		return suma;
	}

	
	@Override
	public double dotMerge(SparseVector v) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		
		return data.toString();
	}

}

package es.tfg.arboles;
import java.util.ArrayList;

public class Datos {
    private int pos;
    private int valor;
    private ArrayList <Integer> caminoOutputs;
    private ArrayList <Integer> caminoInputs;
    
    public Datos() {
		super();
	}
	public Datos(int pos, int valor) {
        this.pos = pos;
        this.valor = valor;
        this.caminoOutputs = new ArrayList <Integer>();
        this.caminoInputs = new ArrayList <Integer>();
    }
    public Datos(int pos, int valor, ArrayList <Integer> camino) {
        this.pos = pos;
        this.valor = valor;
        this.caminoOutputs = camino;
        this.caminoInputs = new ArrayList <Integer>();
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public ArrayList<Integer> getCaminoOutputs() {
		return caminoOutputs;
	}

	public void setCaminoCaminoOutputs(ArrayList<Integer> camino) {
		this.caminoOutputs = camino;
	}
	
	public ArrayList<Integer> getCaminoInputs() {
		return caminoInputs;
	}
	public void setCaminoInputs(ArrayList<Integer> caminoInputs) {
		this.caminoInputs = caminoInputs;
	}
	public void setCaminoOutputs(ArrayList<Integer> caminoOutputs) {
		this.caminoOutputs = caminoOutputs;
	}
	@Override
    public String toString() {
		
        return  ""+ this.valor;
        /*"Datos{" +
                "pos=" + pos +
                ", valor=" + valor +
                "  camino=" + camino +
                '}';*/
    }
}

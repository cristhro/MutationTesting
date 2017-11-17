import java.util.ArrayList;

public class Datos {
    private int pos;
    private int valor;
    private ArrayList <Integer> camino;
    
    public Datos() {
		super();
	}
	public Datos(int pos, int valor) {
        this.pos = pos;
        this.valor = valor;
        this.camino = new ArrayList <Integer>();
    }
    public Datos(int pos, int valor, ArrayList <Integer> camino) {
        this.pos = pos;
        this.valor = valor;
        this.camino = camino;
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
    
    public ArrayList<Integer> getCamino() {
		return camino;
	}

	public void setCamino(ArrayList<Integer> camino) {
		this.camino = camino;
	}

	@Override
    public String toString() {
        return "Datos{" +
                "pos=" + pos +
                ", valor=" + valor +
                "  camino=" + camino +
                '}';
    }
}

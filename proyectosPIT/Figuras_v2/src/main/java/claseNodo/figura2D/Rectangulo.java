package claseNodo.figura2D;


public class Rectangulo implements Figura2D {
	private double ladoCorto=0;
	private double ladoLargo=0;
	
	public Rectangulo(double ladoCorto, double ladoLargo) {
		super();
		this.ladoCorto = ladoCorto;
		this.ladoLargo = ladoLargo;
	}
	
	public Rectangulo(Rectangulo r) {
		ladoLargo=r.getLadoLargo();
		ladoCorto=r.getLadoCorto();
	}

	
	public double getArea2D() {
		// TODO Auto-generated method stub
		return ladoCorto*ladoLargo;
	}

	
	public double perimetro() {
		// TODO Auto-generated method stub
		return ladoCorto*2+ladoLargo*2;
	}


	public double getLadoCorto() {
		return ladoCorto;
	}

	public void setLadoCorto(double ladoCorto) {
		this.ladoCorto = ladoCorto;
	}

	public double getLadoLargo() {
		return ladoLargo;
	}

	public void setLadoLargo(double ladoLargo) {
		this.ladoLargo = ladoLargo;
	}

	
	public String toString() {
		return "Rectangulo [ladoCorto=" + ladoCorto + ", ladoLargo=" + ladoLargo + ", getArea2D()=" + getArea2D()
				+ ", perimetro()=" + perimetro() + ", getLadoCorto()=" + getLadoCorto() + ", getLadoLargo()="
				+ getLadoLargo() + "]";
	}
	
	

}

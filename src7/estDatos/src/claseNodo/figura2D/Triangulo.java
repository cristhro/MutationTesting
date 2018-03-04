package claseNodo.figura2D;


public class Triangulo implements Figura2D{
	private double ladoBase=0;
	private double altura=0;
	private double lateralIz=0;
	private double lateralDer=0;
	
	public Triangulo(double ladoBase, double altura, double lateralIz, double lateralDer) {
		super();
		this.ladoBase = ladoBase;
		this.altura = altura;
		this.lateralIz = lateralIz;
		this.lateralDer = lateralDer;
	}
	
	public Triangulo(Triangulo t) {
		this.ladoBase = t.ladoBase;
		this.altura = t.altura;
		this.lateralIz = t.lateralIz;
		this.lateralDer = t.lateralDer;
	}

	@Override
	public double getArea2D() {
		// TODO Auto-generated method stub
		return ladoBase*altura;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lateralIz+lateralDer+ladoBase;
	}


	
}

package clases;

public class Rectangulo implements FiguraGeometrica {
	private double base;
	private double altura;
	
	
	
	/**
	 * @param base
	 * @param altura
	 */
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}





}

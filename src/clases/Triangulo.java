package clases;

public class Triangulo implements FiguraGeometrica{
	private double base;
	private double altura;
	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura / 2;
	}
	
	
	
}

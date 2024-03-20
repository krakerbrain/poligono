package clases;

public class Circulo implements FiguraGeometrica{

	private double radio;
	
	
	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		this.radio = radio;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * radio * radio;
	}

	
	
}

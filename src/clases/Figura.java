package clases;

public class Figura {
	private FiguraGeometrica figuraGeometrica;

	/**
	 * @param figuraGeometrica
	 */
	public Figura(FiguraGeometrica figuraGeometrica) {
		this.figuraGeometrica = figuraGeometrica;
	}
	
	public double calcularArea() {
		return figuraGeometrica.calcularArea();
	}
	

	
}

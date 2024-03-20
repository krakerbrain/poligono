package figuras;

import clases.Circulo;
import clases.Figura;
import clases.Rectangulo;
import clases.Triangulo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		

		
		Figura figura1 = new Figura(new Circulo(10));
		Figura figura2 = new Figura(new Rectangulo(2,5));
		Figura figura3 = new Figura(new Triangulo(3,5));
		
		System.out.println("Circulo: " + figura1.calcularArea());
		System.out.println("Rectangulo: " + figura2.calcularArea());
		System.out.println("Triangulo: " + figura3.calcularArea());
		
		
		
	}
	


}

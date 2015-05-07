package javaDoc;

/**
 * 
 * @author Aitor
 *
 */

// las variables globales para poder calcular el area de un circulo
public class Circulo {
	private double centroX;
	private double centroY;
	private double radio;

	/**
	 * hace locales las variables
	 * 
	 * @param cx
	 * @param cy
	 * @param r
	 */
	public Circulo(double cx, double cy, double r) {
		centroX = cx;
		centroY = cy;
		radio = r;
	}

	public double getCentroX() {

		return centroX;
	}

	/**
	 * aqui se hace el calculo para obtener el area
	 * 
	 * @return
	 */
	public double getCircunferencia() {
		return 2 * Math.PI * radio;
	}

	/**
	 * obtenemos la posicion del centro
	 * 
	 * @param deltaX
	 * @param deltaY
	 */
	public void mueve(double deltaX, double deltaY) {
		centroX = centroX + deltaX;
		centroY = centroY + deltaY;
	}

	/**
	 * 
	 * @param s
	 */
	public void escala(double s) {
		radio = radio * s;
	}
}
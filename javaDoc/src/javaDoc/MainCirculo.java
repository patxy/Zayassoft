package javaDoc;

public class MainCirculo {

	public static void main(String[] args) {
		/**
		 * creamos un objeto circulo y le damos valores a sus atributos le
		 * decimos q nos muestre el area y nos de la posicion de su centro
		 */
		Circulo c = new Circulo(2, 3, 4);
		System.out.println(c.getCentroX());
		System.out.println(c.getCircunferencia());

	}

}

import java.util.Scanner;

public class ZayaSoft {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c;
		int x;
		int y;
		int suma=a+b;
		System.out.println(suma);
		System.out.println("hola");
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("escribe un numero");
		x=teclado.nextInt();
		System.out.println("escribe otro numero");
		y=teclado.nextInt();
		
		System.out.println("1-sumar");
		System.out.println("2-restar");
		System.out.println("3-multiplicar");
		System.out.println("4-dividir");
		System.out.println("escoje una opcion");
		c=teclado.nextInt();
		switch(c){
		case(1):
			int sssuma=x+y;
			System.out.println("el resultado de "+x+" mas "+y+" es = "+sssuma);
			break;
		case(2):
			int resta=x-y;
			System.out.println("el resultado de "+x+" menos "+y+" es = "+resta);
			break;
		case(3):
			int multiplicacion=x*y;
			System.out.println("el producto de "+x+" e "+y+" es = "+multiplicacion);
			break;
		case(4):
			int division=x/y;
			System.out.println("la division de "+x+" e "+y+" es = "+division);
			break;
		}
	}

}

import java.util.Scanner;
/**
 * 
 * @author Aitor
 * version final
 */
public class ZayaSoft {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n;
		n=t.nextInt();
		String s=new String();
		s=MODULO1.cosa(n);
		System.out.println(s);
		//abre la calculadora
		VentanaCalculadora calculadora = new VentanaCalculadora();
        calculadora.setVisible(true);
        
	}

}

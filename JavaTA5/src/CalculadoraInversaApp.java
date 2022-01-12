import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		String valora = JOptionPane.showInputDialog("Introduce el primer numero");
		double numa=Double.parseDouble(valora);
		System.out.println(valora);
		System.out.println(numa);
		String valorb = JOptionPane.showInputDialog("Introduce el segundo numero");
		double numb=Double.parseDouble(valorb);
		String operacion = JOptionPane.showInputDialog("Introduce el signo aritmetico");
		switch(operacion) {
		case "+":
			suma(numa,numb);
			break;
		case "-":
			resta(numa,numb);
			break;
		case "*":
			multiplicacion(numa, numb);
			break;
		case "/":
			division(numa, numb);
			break;
		case "^":
			exponente(numa, numb);
			break;
		case "%":
			modulo(numa, numb);
			break;
		default:
			System.out.println("Error");
		}
	}
	public static void suma(double a,double b) {
		double c = 0;
		c = a+b;
		System.out.println("La suma es ="+ c);
	}
	public static void resta(double a,double b) {
		double c = 0;
		c = a-b;
		System.out.println("La resta es ="+ c);
	}
	public static void multiplicacion(double a,double b) {
		double c = 0;
		c = a*b;
		System.out.println("La multiplicacion es ="+ c);
	}
	public static void division(double a,double b) {
		double c = 0;
		c = a/b;
		System.out.println("La division es ="+ c);
	}
	public static void exponente(double a,double b) {
		double c = 0;
		c = Math.pow(a, b);
		System.out.println("El resultado es ="+ c);
	}
	public static void modulo(double a,double b) {
		double c = 0;
		c = a%b;
		System.out.println("El modulo es ="+ c);
	}
	
}

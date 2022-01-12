import javax.swing.JOptionPane;
/* 

@author Albert Perez

*/
public class Ej6 {
	final public static double iva = 0.21;
	public static void main(String[] args) {
		String text=JOptionPane.showInputDialog("Introduce el precio sin iva");
		double num=Double.parseDouble(text);
		double precio = num*iva;
		JOptionPane.showMessageDialog(null,precio+num);
	}

}

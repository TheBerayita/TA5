import javax.swing.JOptionPane;
/* 

@author Albert Perez

*/
public class Ej4 {
	final public static double npi = Math.PI;
	
	public static void main(String[] args) {
		int nradio=0;
		String radio=JOptionPane.showInputDialog("Introduce el radio");
		nradio=Integer.parseInt(radio);
		double area=0;
		area=npi*Math.pow(nradio, 2);
		
		JOptionPane.showMessageDialog(null, area);
	}

}

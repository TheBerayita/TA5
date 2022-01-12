import javax.swing.JOptionPane;
/* 

@author Albert Perez

*/
public class Ej10 {
	public static void main(String[] args) {
		String textnumeroventas = JOptionPane.showInputDialog("Introduce un numero de ventas");
		int numeroventas = Integer.parseInt(textnumeroventas);
		int total = 0;
		for (int i = 0; i < numeroventas; i++) {
			String textcosteventas = JOptionPane.showInputDialog("Introduce coste venta");
			int coste = Integer.parseInt(textcosteventas);
			total = total + coste;
		}
		System.out.println("Numero de ventas: " + numeroventas);
		System.out.println("Total coste ventas= " + total);
	}

}

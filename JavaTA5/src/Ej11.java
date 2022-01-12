import javax.swing.JOptionPane;
/* 

@author Albert Perez

*/
public class Ej11 {

	public static void main(String[] args) {
		String dia = new String(JOptionPane.showInputDialog("Introduce el dia"));
		dia = dia.toLowerCase();
		switch (dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			JOptionPane.showMessageDialog(null, "Es laboral");
			break;
		case "sabado":
		case "domingo":
			JOptionPane.showMessageDialog(null, "Es fin de semana");
			break;

		default:
			JOptionPane.showMessageDialog(null, "No encontrado");
			break;

		}

	}

}

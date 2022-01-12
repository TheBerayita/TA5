import javax.swing.JOptionPane;

public class Ej12 {

	public static void main(String[] args) {
		String passbuena="Hola";
		
		for(int i=0;i<3;i++) {
			String pass = JOptionPane.showInputDialog("Introduce la contraseña");
			if(pass.equals(passbuena)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Incorrecto");
			}
		}
		JOptionPane.showMessageDialog(null, "Has fallado 3 veces");
	}

}

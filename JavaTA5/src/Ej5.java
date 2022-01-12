import javax.swing.JOptionPane;

public class Ej5 {

	public static void main(String[] args) {
		String text=JOptionPane.showInputDialog("Introduce el numero");
		int num=Integer.parseInt(text);
		
		if (num%2==0) {
			JOptionPane.showMessageDialog(null,"El numero es divisible entre 2");
		}else if(num%2 !=0) {
			JOptionPane.showMessageDialog(null,"El numero no es divisible entre 2");
		}else {
			JOptionPane.showMessageDialog(null,"Error");
		}

	}

}

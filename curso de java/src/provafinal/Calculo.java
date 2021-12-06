package provafinal;

import javax.swing.JOptionPane;

public class Calculo {
	public void potencia(int b, int p) {
		int count, result=b;
		for(count=1;count<p;count++) {
			result = b * result;
		}
		JOptionPane.showMessageDialog(null,"O resultado é :"+ result);
	}
}

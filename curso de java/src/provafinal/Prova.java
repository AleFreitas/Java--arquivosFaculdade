package provafinal;

import javax.swing.JOptionPane;

public class Prova {
	public void principal() {
		Calculo cl = new Calculo();
		int base,potencia;
		base = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor base"));
		potencia = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor potencia"));
		cl.potencia(base, potencia);
	}
}

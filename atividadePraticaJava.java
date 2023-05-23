import javax.swing.*;
public class atividadePraticaJava {
	
	public static void main (String entrada[]) {
		
		int number1, div, potencia;
		double number2;
		String textoDiv, textoPot;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero:"));
		
		div = number1 / (int)number2;
		potencia = (int)Math.pow(number1, number2);
		
		textoDiv = String.format("O resultado da divisão entre %d e %.2f é igual a %d", number1, number2, div);
		textoPot = String.format("E o resultado da potenciação entre %d elevado a %.2f é igual a %d", number1, number2, potencia);

		System.out.println(div + " " + potencia);
		
		System.exit(0);
	}
}
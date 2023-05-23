import javax.swing.*;
public class atividadePraticaJava {
	
	public static void main (String entrada[]) {
		//Declaraçãao de Variáveis
		int number1, div, potencia;
		double number2;
		String textoDiv, textoPot;
		
		//Entrada de dados
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero:"));
		
		//Processamento
		div = number1 / (int)number2;
		potencia = (int)Math.pow(number1, number2);
		
		//Saída de Dados
		textoDiv = String.format("O resultado da divisão entre %d e %.0f é igual a %d.", number1, number2, div);
		textoPot = String.format(" E o resultado da potenciação entre %d elevado a %.0f é igual a %d", number1, number2, potencia);

		JOptionPane.showMessageDialog(null, textoDiv + " " + textoPot);
		
		System.exit(0);
	}
}

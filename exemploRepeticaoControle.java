import javax.swing.*;
public class exemploRepeticaoControle 
{
	
	public static void main (String entrada []) 
	{
		int i;
		Double multiplicador, tabuada;
		char option;
		String loopEscolhido = " ", resposta = " ", inicialMsg = "Digite 1 para repetição com FOR; 2 para repetição com WHILE; 3 para repetição com o DO WHILE";

		multiplicador = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para verificar sua tabuada: "));
	
		do {
			option = JOptionPane.showInputDialog(inicialMsg).charAt(0);
			switch (option) {

				case '1': {
					loopEscolhido = String.format("Tabuada do %.1f com FOR.\n", multiplicador);
					for (i = 1 ; i<=10 ; i++) {
						tabuada = multiplicador * i;
						resposta = resposta + String.format("%.1f X %d = %.1f\n", multiplicador,i,tabuada); 
					}
					break;
				}
	
				case '2' : {
					loopEscolhido = String.format("Tabuada do %.1f com WHILE.\n", multiplicador);
					i = 1;
					while(i <= 10) {
						tabuada = multiplicador * i;
						resposta = resposta +  String.format("%.1f X %d = %.1f\n", multiplicador,i,tabuada);
						i++; 
					}
	
				break;	
				}
	
				case '3' : {
					loopEscolhido = String.format("Tabuada do %.1f com DO/WHILE.\n", multiplicador);
					i = 1;
					do {
						tabuada = multiplicador * i;
						resposta = resposta +  String.format("%.1f X %d = %.1f\n", multiplicador,i,tabuada);
						i++; 
	
					} while (i <= 10);	
	
				break;	
				}
	
				default: {
						JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
						
					}
					break;
				}

		} while((option != '1') && (option != '2') && (option != '3'  ));
				 		
		JOptionPane.showMessageDialog(null ,loopEscolhido + resposta);

		System.exit(0);
	}
}

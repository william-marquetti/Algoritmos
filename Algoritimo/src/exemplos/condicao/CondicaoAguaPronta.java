package exemplos.condicao;

public class CondicaoAguaPronta {
	
	public static void main(String[] args) {
		
		String _estadoAguaFervendo = "Fervendo";
		String _estadoAguaMorna = "Morna";
		String agua = "Morna";
		if(!_estadoAguaFervendo.equals(agua) || _estadoAguaMorna.equals(agua)){
			System.out.println("�gua pronta para o caf�.");
		} else {
			System.out.println("�gua n�o est� pronta para o caf�");
		}
		
	}

}

package serpro.gov.br;

public class Pizza {	
	private static String sabor;
	
	public Pizza (String sabor) {		
		this.setSabor(sabor);
	}
	
	static double calcularPreco() {
		double preco = 0.0;
		if (getSabor() == "Portuguesa") preco = 40.00;		
		else if (getSabor() == "Mussarela") preco =  35.00;	   
		else if (getSabor() == "Marguerita") preco = 42.00;
		else if (getSabor() == "Quatro Queijos") preco = 45.00;
		else if (getSabor() == "Calabresa") preco = 37.00;
		return preco;
	}

	public static String getSabor() {
		return sabor;
	}

	public static void setSabor(String sabor) {
		Pizza.sabor = sabor;
	}

}

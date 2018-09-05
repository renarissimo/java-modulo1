public class Paciente {

	double peso;
	double altura;
	String classificacao;
	String nome;

	
	public Paciente(double peso, double altura) { //construtor
		this.peso = peso;
		this.altura = altura;
	}
	
	double calcularIMC() {		
		double imc = peso / (altura * altura);
		return imc;
	}

	String diagonostico () {
		    String classificacao = "Peso";
	    	double imc = calcularIMC(); 
	    	if (imc < 16) {
	    		classificacao = "Baixo peso muito grave";
	    	} else if (imc > 16 & imc <= 16.99){
	    		classificacao = "Baixo peso grave";
	    	} else if (imc > 17 & imc <= 18.49){
	    		classificacao = "Baixo peso";
	    	} else if (imc > 18.50 & imc <= 24.99){
	    		classificacao = "Peso Normal";
	    	} else if (imc > 25 & imc <= 29.99){
	    		classificacao = "Sobrepeso";
	    	} else if (imc > 29.99 ){
	    		classificacao = "Obesidade";
	    	}
	    	return classificacao;
	}
	
	 void imprimir(){
         System.out.println("A classificação é " +nome+ " com o diagnóstico de " +diagonostico()); 
     }
}	
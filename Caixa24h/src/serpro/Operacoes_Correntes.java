package serpro;

public class Operacoes_Correntes {
	
	private String Operacoes;
	private double Valor;
	    
	    public Operacoes_Correntes(String Operacoes, Double Valor) {
	   	 this.Operacoes = Operacoes;
	   	 this.Valor = Valor;
	    }
	    
	    public String getOperacoesCorrentes() {
	   	 return Operacoes;
	   	}
	    
	    public double getOperacoesCorrentesValor() {
		   	 return Valor;
		}
}
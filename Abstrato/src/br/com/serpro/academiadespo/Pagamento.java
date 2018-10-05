package br.com.serpro.academiadespo;

public abstract class Pagamento {
	int Qtde;
	
	public abstract String getTipoPagto();
	
	public int getQtde() {
		return Qtde;
		
	}		
	public void setQtde(int Qtde) {
		this.Qtde = Qtde;
	}
}


package br.gov.serpro.curso;

public class Cheque extends Pagamento {
   
	private String nomeBanco;
	private int IDBanco;
	
	public Cheque(String nomeBanco, int IDBanco) {
         this.nomeBanco = nomeBanco;
         this.IDBanco = IDBanco;
	}
	
	public boolean isAutorizado() {
		return true;
	}

}

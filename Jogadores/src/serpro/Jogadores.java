package serpro;

public class Jogadores implements Comparable<Jogadores> {

	  String nome;
	  Integer gol;
	  
	 
	  Jogadores(String Nome, int gol){
		this.nome = Nome;
		this.gol = gol;		
	  }
				

	@Override
	public int compareTo(Jogadores jg) {
		// TODO Auto-generated method stub
		 int last = this.gol.compareTo(jg.gol);  
	     return last == 0 ? this.gol.compareTo(jg.gol) : last;
	}
	
	protected String getNome() {
		return nome;
	}
	
	protected Integer getGol() {
		return gol;
	}

	}
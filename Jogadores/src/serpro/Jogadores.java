package serpro;

public class Jogadores implements Comparable<Jogadores> {

	  String Nome;
	  Integer gol;
	  
	 
	  Jogadores(String Nome, int gol){
		this.Nome = Nome;
		this.gol = gol;		
	  }
				

	@Override
	public int compareTo(Jogadores jg) {
		// TODO Auto-generated method stub
		 int last = this.gol.compareTo(jg.gol);  
	     return last == 0 ? this.gol.compareTo(jg.gol) : last;
	}
	}
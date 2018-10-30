package serpro;

public class Informal implements FormatadorNome{
	String nome;
	String sobrenome;
	
	// Informal: retorna somente o primeiro nome
	
	public Informal(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return (sobrenome);
	}
}

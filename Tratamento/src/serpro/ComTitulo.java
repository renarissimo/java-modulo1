package serpro;

public class ComTitulo implements FormatadorNome {
	String nome;
	String sobrenome;
	String titulo;
	
	public ComTitulo(String nome, String sobrenome, String titulo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.titulo = titulo;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		return(titulo + nome + sobrenome);
	}	
}

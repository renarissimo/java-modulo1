package serpro;

public class Autoridade {
	private String nome;
	private String sobrenome;
	private FormatadorNome fn;
	
		
	public Autoridade(String nome, String sobrenome, FormatadorNome fn) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.fn = fn;
	}

	public String getTratamento() {
		return fn.formatarNome(nome, sobrenome);
	}

}

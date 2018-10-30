package serpro;

public class Autoridade {
	String nome;
	String sobrenome;
	FormatadorNome fn;
	
	public String getTratamento() {
		return fn.formatarNome(nome, sobrenome);
	}

}

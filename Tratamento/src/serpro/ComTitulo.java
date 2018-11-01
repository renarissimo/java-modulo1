package serpro;

public class ComTitulo implements FormatadorNome {
	
	String titulo;
	
	public ComTitulo(String titulo) {		
		this.titulo = titulo;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		StringBuilder retorno = new StringBuilder(); 
		retorno.append(titulo)
				.append(" ")
				.append(nome)
				.append(" ")
				.append(sobrenome);
		return(retorno.toString()); // Retornar tudo em um único espaço de memória.
	}	
}

package serpro;

public class Respeitoso implements FormatadorNome{
	String nome;
	String sobrenome;
	String sexo;
	
	public Respeitoso(String nome, String sobrenome, String sexo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
	}

	/*
	Respeitoso: deve receber em seu construtor a informação se é masculino ou feminino, 
	e retornar "Sr." ou "Sra." seguido do sobrenome*/
		
	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (sexo == "M") {
			return("Sr " + nome + sobrenome);	
		}else if (sexo == "F") {
			return("Sra " + nome + sobrenome);
	}else
		return ("Indefinido");
	}
}	

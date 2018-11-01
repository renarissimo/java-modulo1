package serpro;

public class Respeitoso implements FormatadorNome{
	String sexo;
	
	public Respeitoso(String sexo) {		
		this.sexo = sexo;
	}

	/*
	Respeitoso: deve receber em seu construtor a informação se é masculino ou feminino, 
	e retornar "Sr." ou "Sra." seguido do sobrenome*/
		
	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (sexo == "M") {
			return("Sr " + sobrenome);	
		}else if (sexo == "F") {
			return("Sra " + sobrenome);
	}else
		return ("Indefinido");
	}
}	

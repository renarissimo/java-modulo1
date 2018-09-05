
public class Principal {
	public static void main(String[] args) {
		Paciente pessoa = new Paciente(77,1.77);	
		pessoa.nome = "P1";
		pessoa.calcularIMC();
		pessoa.diagonostico();
		pessoa.imprimir();
		
		Paciente pessoa2 = new Paciente(62,1.64);
		pessoa2.nome = "P2";
		pessoa2.calcularIMC();
		pessoa2.diagonostico();
		pessoa2.imprimir();
	}

}

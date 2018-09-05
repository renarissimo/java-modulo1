
public class TestaIMC {
	public static void main(String[] args) {
		IMC pessoa = new IMC(77,1.77);	
		pessoa.nome = "P1";
		pessoa.calcularIMC();
		pessoa.diagonostico();
		pessoa.imprimir();
		
		IMC pessoa2 = new IMC(62,1.64);
		pessoa2.nome = "P2";
		pessoa2.calcularIMC();
		pessoa2.diagonostico();
		pessoa2.imprimir();
	}

}

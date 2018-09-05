
public class TestaIMC {
	public static void main(String[] args) {
		IMC pessoa = new IMC();
		pessoa.altura = 1.77;
		pessoa.peso = 77;
		pessoa.calcularIMC();
		pessoa.diagonostico();
		pessoa.imprimir();
	}

}

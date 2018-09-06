package serpro.gov.br;

public class Pedido {
	String sabor;
	double distancia;
	double preco;
	boolean fds;
	
	
	public Pedido (String sabor, double distancia, double preco, boolean fds) {
		this.sabor = sabor;
		this.distancia = distancia;
		this.preco = preco;
		this.fds = fds;
	}	

	static double calcularPedido() {
		double valorTotal = 0.0;
		valorTotal = (Pizza.calcularPreco() + Entrega.calcularEntrega());
		return valorTotal;								
	}	
}

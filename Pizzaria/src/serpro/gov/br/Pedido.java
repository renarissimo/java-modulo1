package serpro.gov.br;

public class Pedido {
	Pizza pizza;
	Entrega entrega;
	
	public Pedido (Pizza pizza, Entrega entrega) {
		this.pizza = pizza;
		this.entrega = entrega;
	}	

	double calcularPedido() {
		double valorTotal = 0.0;
		valorTotal = (pizza.calcularPreco() + entrega.calcularEntrega());
		return valorTotal;								
	}	
}

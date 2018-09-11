package serpro.gov.br;

public class Pedido {
	Entrega entrega;
	Pizza pizza;		
	
	public Pedido (Entrega entrega, Pizza pizza) {
		this.entrega = entrega;
		this.pizza = pizza;		
	}	

	double calcularPedido() {
		double valorTotal = 0.0;
		valorTotal = (pizza.calcularPreco() + entrega.calcularEntrega());
		return valorTotal;								
	}	
}

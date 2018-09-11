package serpro.gov.br;

public class Principal {
	
	public static void main(String[] args) {
		Pizza pizza = new Pizza("Portuguesa");
		Entrega entrega = new Entrega(5.0,false);
		
		Pedido pedido1 = new Pedido(entrega, pizza);
		System.out.println("O Valor do pedido e = " + pedido1.calcularPedido());    
	}
}

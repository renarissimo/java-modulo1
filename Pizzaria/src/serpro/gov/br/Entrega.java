package serpro.gov.br;

public class Entrega {
	double distancia;
	double preco;
	boolean fds;


     public Entrega(double distancia, double preco, boolean fds) {
    	 this.distancia = distancia;
    	 this.preco = preco;
    	 this.fds = fds;
     }
     
     double calcularEntrega() {
    	 if (fds == true)
    	 return((distancia * preco) * 1.2);
    	 else return((distancia * preco) * 1);	 
    	 }
     }

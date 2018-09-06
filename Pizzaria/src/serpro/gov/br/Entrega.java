package serpro.gov.br;

public class Entrega {
	private static double distancia;
	private static double preco;
	private static boolean fds;


     public Entrega(double distancia, double preco, boolean fds) {
    	 Entrega.setDistancia(distancia);
    	 this.setPreco(preco);
    	 this.setFds(fds);
     }
     
     static double calcularEntrega() {
    	 if (isFds() == true)
    	 return((getDistancia() * getPreco()) * 1.2);
    	 else return((getDistancia() * getPreco()) * 1);	 
    	 }

	public static double getDistancia() {
		return distancia;
	}

	public static void setDistancia(double distancia) {
		Entrega.distancia = distancia;
	}

	public static double getPreco() {
		return preco;
	}

	public static void setPreco(double preco) {
		Entrega.preco = preco;
	}

	public static boolean isFds() {
		return fds;
	}

	public static void setFds(boolean fds) {
		Entrega.fds = fds;
	}
     }

package serpro.gov.br;

public class Entrega {
	double distancia;
	boolean fds;

	public Entrega(double distancia,  boolean fds) {
		this.distancia = distancia;		
		this.fds = fds;
	}

	double calcularEntrega() {
		if (isFds() == true)
			return (getDistancia() * 1.2);
		else
			return (getDistancia());
	}

	public double getDistancia() {
		return distancia;
	}
	

	public boolean isFds() {
		return fds;
	}
}

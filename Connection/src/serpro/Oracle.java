package serpro;

public class Oracle implements Connection{

	@Override
	public void rollback() {
		System.out.println("Rollback no Oracle");
		
	}

	@Override
	public void commit() {
		System.out.println("Commit no Oracle");
		
	}

	@Override
	public void connect() {
		System.out.println("Conectando no Oracle");
		
	}

}

package serpro;

public class MySQL implements Connection{

	@Override
	public void rollback() {
		System.out.println("Rollback no MySQL");
		
	}

	@Override
	public void commit() {
		System.out.println("Commit no MySQL");
		
	}

	@Override
	public void connect() {
		System.out.println("Conectando no MySQL");
		
	}

}

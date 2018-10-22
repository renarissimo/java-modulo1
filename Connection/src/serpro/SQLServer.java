package serpro;

public class SQLServer implements Connection{

	@Override
	public void rollback() {
		System.out.println("Rollback no SQLServer");
		
	}

	@Override
	public void commit() {
		System.out.println("Commit no SQL Server");
		
	}

	@Override
	public void connect() {
		System.out.println("Conectando no SQLServer");
		
	}

}

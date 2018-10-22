package serpro;

public class Principal {
	
	public static void Conectar(Connection conectar) {
		conectar.connect();
		conectar.commit();
		conectar.rollback();
	}	
		
	public static void main(String[] args) {         
	   Conectar(new MySQL());
	   Conectar(new Oracle());
	   Conectar(new SQLServer());								
         }		    
	 			
	}		


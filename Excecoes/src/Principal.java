public class Principal {
	
	public static void main(String[] args) {
	   a(-100);
	   System.out.println("Terminado a execu��o do main");
	}
	
	public static void a(int i) {
	   System.out.println("executando a() com "+i);		
	      try {
			b(i);
		} catch (Exception e) {
			System.out.println("Tratando a exce��o = " + e.getMessage());
		}
	      System.out.println("Terminado a execu��o do a()");
	}

	public static void b(int i) throws Exception{
	   System.out.println("executando b() com "+i);
	   if (i > 0)
	   throw new Exception("mensagem");
	   System.out.println("Terminado a execu��o do b()");
	}

}

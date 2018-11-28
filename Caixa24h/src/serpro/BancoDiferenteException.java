package serpro;

public class BancoDiferenteException extends Exception {

	public BancoDiferenteException(){
	     System.out.println("Transferência não pode ser realizada entre bancos diferentes");
	  }	
	
}

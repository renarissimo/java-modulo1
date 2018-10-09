
public class Carros {
	int potencia;
	int velocidade;
	String nome;

	     void acelerar(){
	          velocidade += potencia;
	     }
	  
	     void frear() {
	           velocidade = velocidade / 2;
	     }

	     int getVelocidade(){
	            return velocidade;
	      }

	      void imprimir(){
	          System.out.println("O Carro" +nome+ " está a velocidade "+getVelocidade()+ "km/h"); 
	      }
}


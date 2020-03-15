package ejerciciosLibro200;

public class NumeroAleatorio {
public String numero="";
	public NumeroAleatorio() {}
	
	public void generaNumero() {
		for(int i=1;i<=10;i++) {
		 numero+=(int) (Math.random()*10);
		}
		System.out.println(numero);
	}
}

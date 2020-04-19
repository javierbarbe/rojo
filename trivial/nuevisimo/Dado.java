package nuevisimo;

public class Dado {

	private int valor;
	public Dado (int cantCaras) 	{
		valor=(int)(Math.random()*cantCaras)+1;
	}
	public int getValor() {
		return valor;
	}
	protected void setValor(int valor) {
		this.valor = valor;
	}
	public static void main (String args []) {
		Dado d6 = new Dado(2);
		System.out.println(d6.getValor());
	}
	public void animacionTiradaDado() {
		try {
			System.out.print(".");
			Thread.sleep(350);
			System.out.print("..");
			Thread.sleep(350);
			System.out.print("...");
			Thread.sleep(350);
			System.out.print("....");
			Thread.sleep(350);
			System.out.println("__");
			System.out.println("..........|·|");
			System.out.println("          --");
			
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("error al parar el programa");
		}
	}
}

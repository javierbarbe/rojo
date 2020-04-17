package heroquest;

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
}

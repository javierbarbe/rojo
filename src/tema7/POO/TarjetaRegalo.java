package tema7.POO;

public class TarjetaRegalo {
	private String numeroTarjeta="";
	private double saldo;
	public TarjetaRegalo(double saldo) {
		while (numeroTarjeta.length()<6) {
			numeroTarjeta+=String.valueOf((int)(Math.random()*10));
			this.saldo=saldo;
		}
	}
	public String getnumeroTarjeta() {
		return numeroTarjeta;
	}
	public void gastar(double cantidad) {
		if (saldo>cantidad) {
		saldo-=cantidad;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	public TarjetaRegalo fusionar(TarjetaRegalo fusionada) {
		TarjetaRegalo nueva= new TarjetaRegalo( this.saldo);
		nueva.saldo= this.saldo+fusionada.saldo;
		this.saldo=0;
		fusionada.saldo=0;
		while (numeroTarjeta.length()<6 && nueva.numeroTarjeta!=this.numeroTarjeta && nueva.numeroTarjeta!= fusionada.numeroTarjeta) {
			numeroTarjeta+=String.valueOf((int)(Math.random()*10));
			
		}return nueva;
		
	}
	protected double getSaldo() {
		return saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return " La tarjeta " +this.numeroTarjeta + " tiene un saldo "+ this.getSaldo();
	}
}

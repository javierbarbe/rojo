package heroquest;

import javax.swing.JOptionPane;

public class Enemigo {
	String  []	razasEnemigos= {"Orco", "Goblin", "Momia", "Esqueleto", "Fimir"};
	private String raza;
	private int vida=1,magia,daño,resistencia,movimiento;
	private boolean razaEnemigoExiste=false;
	public Enemigo(String raza) {
		this.raza=raza;
		existeRaza();
		inicializar();
		}
	
	public void existeRaza() {
		do{
			for ( String s : razasEnemigos) {
			if ( raza.equalsIgnoreCase(s)) {
				razaEnemigoExiste=true;
			}
			}if(!razaEnemigoExiste) {
				raza=JOptionPane.showInputDialog("Introduce una raza que exista");
			}
		}while(!razaEnemigoExiste);
	}
	
	public void inicializar() {
//		switch (raza) {
//		case "humano" : this.resistencia=2;
//						this.setVida(4);
//						daño=2;
//						magia=0;
//		}
		if(this.raza.equalsIgnoreCase("orco")) { //8pts
			resistencia=4;
			daño=3;
			magia=0;
			movimiento=6;
		}
		if(this.raza.equalsIgnoreCase("goblin")) { //8pts
			resistencia=2;
			daño=2;
			magia=0;
			movimiento=8;
		}
		if(this.raza.equalsIgnoreCase("momia")) { //8pts
			resistencia=6;
			daño=4;
			magia=0;
			movimiento=4;
		}
		if(this.raza.equalsIgnoreCase("Esqueleto")) { //8pts
			resistencia=2;
			daño=3;
			magia=0;
			movimiento=4;
		}
		if(this.raza.equalsIgnoreCase("fimir")) { //8pts
			resistencia=5;
			daño=5;
			magia=2;
			movimiento=6;
		}
		}
	public void gritar() {
		if (raza.equalsIgnoreCase("fimir")) {
			System.out.println("FIMIIIIIIIIIIIIIIIIIIIIIIIIIR!!!");
		}
		if (raza.equalsIgnoreCase("orco")) {
			System.out.println("WAAAAGH!");
		}
		if (raza.equalsIgnoreCase("goblin")) {
			System.out.println("ñañañaña");
		}
		if(raza.equalsIgnoreCase("esqueleto")) {
			System.out.println("cloclocloc");
		}
		if(raza.equalsIgnoreCase("momia")) {
			System.out.println("!! himoteph!! ");
		}
	}
	protected int getDaño() {
		return daño;
	}

	protected void setDaño(int daño) {
		this.daño = daño;
	}

	public void enemigosAtacan(Personaje personaje) {
		if(comprobarVida()>0) {
			gritar();
			int ataque = this.getDaño();
			int defensa= personaje.getResistencia();
			
			Dado d4 = new Dado(4);
			System.out.print("Resultado tirada monstruo= "+d4.getValor() );
			System.out.print("; Ataque monstruo= "+ataque);
			System.out.print("; Defensa heroe= "+defensa );
			System.out.print("; Vida previa= "+personaje.getVida());
			ataque=ataque +d4.getValor();
			if ( ataque >=defensa) {
				if(defensa==ataque) {
					personaje.recibeHeridas(-1);
				}
				personaje.recibeHeridas(defensa-ataque);
			}
			System.out.println( "; Vida resultante="+personaje.getVida());
		}
		
		
	}public void morir() {
		this.vida=0;
		comprobarVida();
	}
	public int comprobarVida() {
		if(this.vida<=0) {
			System.out.println("Monstruo muerto, no puedes atacar\n"
					+ "Valores a 0");
			this.daño=0;
			this.magia=0;
			this.movimiento=0;
			this.resistencia=0;
		}
		return vida;
	}
	
	public String toString() {
		return "Raza "+this.raza +"\n===========\nDaño "+this.daño+ "\nResistencia "+ this.resistencia+ "\nMagia "+this.magia+ 
				 "\nMovimiento "+this.movimiento ;
	}
	protected String getRaza() {
		return raza;
	}

	protected void setRaza(String raza) {
		this.raza = raza;
	}

	protected int getVida() {
		return vida;
	}

	protected void setVida(int vida) {
		this.vida = vida;
	}

	protected int getMagia() {
		return magia;
	}

	protected void setMagia(int magia) {
		this.magia = magia;
	}

	protected int getResistencia() {
		return resistencia;
	}

	protected void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public static void main (String args[]) {
		Enemigo orco = new Enemigo("fimr");
		System.out.println(orco);
		System.out.println(orco.getVida());
	}
}

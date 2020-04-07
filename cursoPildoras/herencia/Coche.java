package herencia;

public class Coche {
	public Coche(String color, double peso) {
		this.color=color;
		this.peso=peso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		return true;
	}

	private String color;
	private int asientos;
	private int ruedas;
	private boolean asientosCuero,climatizador;
	private double peso, pesoplataforma;
	
	public Coche() {
		this.ruedas=4;
		this.asientos=5;
		this.pesoplataforma=550;
		this.peso=peso +pesoplataforma;
		
	}
	
	public String dimeDatos() {
		return "El vehiculo tiene " + ruedas+ " ruedas.\n"
				+ "Tiene climatizador?  "+ climatizador+ "\n Tiene asientos de cuero? "+asientosCuero+
				" \nEl vehiculo pesa "+ peso + "\nSu color es "+color;
		}
	
	public int getAsientos() {
		return asientos;
	}
	public void setAsientos(int asientos) {
		
		this.asientos = asientos;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public boolean isAsientosCuero() {
		
		return asientosCuero;
	}
	public void setAsientosCuero(boolean asientosCuero) {
		if(asientosCuero==true) {
			this.peso+=80;
		}
		this.asientosCuero = asientosCuero;
		
	}
	public boolean isClimatizador() {
		
		return climatizador;
	}
	public void setClimatizador(boolean climatizador) {
		if (climatizador==true) {
			this.peso+=55;
		}
		this.climatizador = climatizador;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPesoplataforma() {
		return pesoplataforma;
	}
	public void setPesoplataforma(double pesoplataforma) {
		this.pesoplataforma = pesoplataforma;
	}

	public String getColor() {
		return "El color es: " +color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

package metodoEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Cuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List <Cliente> lista = new ArrayList<>();
		lista.add(new Cliente ("Javier Barbero", "025354", 3500));
		Cliente cl1 = new Cliente ("Antonio Banderas", "00002", 5555);
		Cliente cl2 = new Cliente("Sergio Ramos", "00004", 444444);
		Cliente cl3 = new Cliente("Sergio Ramos", "00004", 444444);
		lista.add(cl1);
		lista.add(cl2);
		lista.add(cl1);
		lista.add(cl3);
		lista.add(cl2);
		System.out.println(lista);
		Iterator <Cliente> it= lista.iterator();
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);

	}

}
class Cliente implements Comparable{ //PARA PODER ORDENAR TIENE QUE TENER ESTA INTERFAZ Y EL METODO COMPARETO
	private String nombre, n_cuenta;
	private int saldo;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getN_cuenta() {
		return n_cuenta;
	}
	protected void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}
	protected int getSaldo() {
		return saldo;
	}
	protected void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((n_cuenta == null) ? 0 : n_cuenta.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Cliente other = (Cliente) obj;
		if (n_cuenta == null) {
			if (other.n_cuenta != null)
				return false;
		} else if (!n_cuenta.equals(other.n_cuenta))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	public Cliente(String nombre, String n_cuenta, int saldo) {
		this.nombre=nombre;
		this.n_cuenta=n_cuenta;
		this.saldo=saldo;
	}
	public String toString() {
		return this.nombre+ " "+ this.n_cuenta;
	}
	
	public int compareTo (Object o) {
		Cliente otro= (Cliente) o;
		return this.getNombre().compareTo(otro.getNombre());
	}
}
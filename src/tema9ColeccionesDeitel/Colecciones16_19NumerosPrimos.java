package tema9ColeccionesDeitel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import javax.swing.JOptionPane;

public class Colecciones16_19NumerosPrimos {
	/*
	 * (Números primos y factores primos) Escriba un programa que reciba una entrada
	 * tipo número entero de un usuario, y que determine si es primo. Si el número
	 * no es primo, muestre sus factores primos únicos. Recuerde que los factores de
	 * un número primo son sólo 1 y el mismo número primo. Todo número que no sea
	 * primo tiene una factorización prima única. Por ejemplo, considere el número
	 * 54. Los factores primos de 54 son 2, 3, 3 y 3. Cuando los valores se
	 * multiplican entre sí, el resultado es 54. Para el número 54, los factores
	 * primos a imprimir deben ser 2 y 3. Use objetos Set como parte de su solución.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> factores = new HashMap<>();
		
	
		Primo jaja = new Primo(16);
		if(jaja.esPrimo()) {
		System.out.println("el numero es primo");
		}else {
		Set <Primo> coleccionPrimos = jaja.listaDePrimosHastaNumero();
		
		System.out.println("coleccion de primoSETst");
		System.out.println(coleccionPrimos);
		
		
		Primo [] array =coleccionPrimos.toArray(new Primo [coleccionPrimos.size()]);
		System.out.println("Lista linked pasada a ARRAy");
		for (int i=0; i<array.length;i++) {
//			System.out.println(array[i]);
		}
		System.out.println("FACTORES DEL NUMERO "+jaja.getNumero());
	System.out.println(jaja.obtenerFactores());
	}
		
		System.out.println(jaja.obtenerFactores1vez());
		
	}// fin de metodo main

}

class Primo {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
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
		Primo other = (Primo) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	protected int getNumero() {
		return numero;
	}
	public String toString() {
		String num = String.valueOf(numero);
		return num;
	}

	private int contador = 0;
	private int numero;
	private boolean esPrimo = false;

	private Set<Primo> lista = new HashSet<>();
	private LinkedList<Integer> factore= new LinkedList<>();
	private Set<Primo> factores1vez= new HashSet<>();

	public Primo(int numero) {
		this.numero = numero;
	
	}

	public boolean esPrimo() {
		for (int i = 2; i < this.numero; i++) {
			if (this.numero % i == 0) {
				contador++;
			}
		}
		if (contador < 1) {
			esPrimo = true;
			return esPrimo;
		}else {
			return esPrimo;
		}
	}

	public Set<Primo> listaDePrimosHastaNumero() {

		for (int i = 1; i < numero; i++) {
			Primo aux = new Primo(i);
			if (aux.esPrimo()==true) {
				lista.add(aux);
			}else {
//				System.out.println(aux.numero+ " no es primo");
			}
		}
		if (lista.size()< 0) {
			System.out.println("El array de primos esta vacio");
		}
		return lista;
	}
	

	public LinkedList<Integer> obtenerFactores() {
		Set <Primo> listAux= listaDePrimosHastaNumero();
		int nomeral= this.getNumero();
		
		while (nomeral>1) {
			for ( Primo p : listAux) {
				if(p.getNumero()!=1) {
				if(nomeral%p.getNumero()==0) {
					nomeral/=p.getNumero();
					factore.add(p.getNumero());
				}
			}
				}
		}
		return factore;
	}
	public Set<Primo> obtenerFactores1vez() {
		Set <Primo> listAux= listaDePrimosHastaNumero();
		
		int nomeral= this.getNumero();
		
		while (nomeral>1) {
			for ( Primo p : listAux) {
				if(p.getNumero()!=1) {
					if(nomeral%p.getNumero()==0) {
						nomeral/=p.getNumero();
						factores1vez.add(p);
					}
				}
			}
		}
		return factores1vez;
	}
}

package colecciones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public class CuentasUsuario {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cl1 = new Cliente("Antonio Banderas", "25422", 333333);
		Cliente cl2 = new Cliente ("Tony Stark", "45551", 33333);
		Cliente cl3 = new Cliente ("Julio Iglesias", "0003", 555555555);
		Set<Cliente> usuarios =  new HashSet<>();
		usuarios.add(cl1);
		usuarios.add(cl2);
		usuarios.add(cl3);
		Iterator <Cliente> it = usuarios.iterator();
		System.out.println(usuarios);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

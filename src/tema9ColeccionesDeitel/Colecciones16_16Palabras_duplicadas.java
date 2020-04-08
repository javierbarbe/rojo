package tema9ColeccionesDeitel;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Colecciones16_16Palabras_duplicadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad = 0;
		String comprobar = JOptionPane.showInputDialog("Introduce la frase");
		String[] almacen = comprobar.split(" ");
		HashMap<String, Integer> mapa = new HashMap<>();
		for (String o : almacen) {
			System.out.println(o);
			o=o.toLowerCase();
			if (mapa.containsKey(o)) {
				int cuenta = mapa.get(o); //IMPORTANTISIMO !!!!!!!!!!!!
				mapa.put(o, cuenta + 1);
			} else {
				mapa.put(o, 1);
			}
		}
		for(Map.Entry<String, Integer> entry : mapa.entrySet()) {
			if(entry.getValue()!=1) {
				System.out.println("Esta clave \""+ entry.getKey()+ "\" tiene este valor "+ entry.getValue());
			}
		}

	}

}

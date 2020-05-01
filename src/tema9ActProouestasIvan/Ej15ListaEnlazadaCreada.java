package tema9ActProouestasIvan;



public class Ej15ListaEnlazadaCreada {
	/*
	 * Implementa una cola utilizando una lista enlazada simple (ser� programada �ntegramente por  el alumno, 
	 * sin usar librer�as espec�ficas de listas de Java). La clase debe llamarse ColaDinamica. 
	 * Para probarlo, incorporaremos objetos de la clase Character, cuyos valores ser�n las letras del abecedario.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ColaDinamica <Object> micola= new ColaDinamica<>();
			micola.aniadeAlFinal("hola");
			String saludo= "como estas";
			
			micola.aniadeAlFinal(saludo);
			micola.aniadeAlFinal("adios");
			micola.aniadePrincipio(new Persona("javier", "barbero",1992));
//			for (Object o: ColaDinamica.arrDefault) {
//				System.out.println(o);
//			}
			System.out.println("muestro la lista");
			micola.mostrarLista();
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(micola.buscar(new Persona ("javier", "barbero",1992)));
			System.out.println(micola.buscar(saludo));
			micola.eliminarNodo(3);
			micola.mostrarLista();
			micola.eliminarNodo(1);
			micola.mostrarLista();

	}

}

class ColaDinamica<E> {
	static Integer tamanio;
	//static ArrayList <Object> milista = new ArrayList<>();
	static Object [] arrDefault;
	static Object [] aux;
	public ColaDinamica() {
	
	}
	public void aniadeAlFinal(Object o) {
		
		//milista.add(0, o );
		try {
			tamanio= arrDefault.length;
			if (tamanio>0 && tamanio!=null) {
				tamanio+=1;
			}
		}catch (Exception e) {
			tamanio=1;
		}aux= new Object[tamanio];
		if(tamanio<2) {
			arrDefault = new Object [tamanio];
		}
		System.arraycopy(arrDefault, 0, aux, 0, tamanio-1);
		arrDefault = new Object [tamanio];
		
		for( int i = 0; i <aux.length;i++) {
			arrDefault[i]=aux[i];
		}
		arrDefault[tamanio-1]=o;
		tamanio++;
		
		
	}
	
	public void aniadePrincipio(Object o) {
		try {
			tamanio= arrDefault.length;
			//almacenamos el valor del tama�o de nuestro array en la variable tamanio
			//si no hubiera sido inicializado nuestro array, por defecto se asume que tamanio=1
			if (tamanio>0 && tamanio!=null) {
				tamanio+=1;
			}
		}catch (Exception e) {
			tamanio=1;
		}//genero un array del mismo tam�o que el original (arrayDefault)
		aux= new Object[tamanio];
		//aqui inicializamos el array Default en caso  de que tama�o sea 1, (el menor tama�o posible para un array)
		if(tamanio<2) {
			arrDefault = new Object [tamanio];
		}
		//copiamos un array dentro de otro para preservar los valores previos
		System.arraycopy(arrDefault, 0, aux, 0, tamanio-1);
		arrDefault = new Object [tamanio];
		
		for( int i = 0; i <aux.length-1;i++) {
			//evitamos a�adir en la posicion 0, eso lo haremos despues
			arrDefault[i+1]=aux[i];
		}
		arrDefault[0]=o;
		tamanio++; //aumentamos el tama�o del arrayOriginal
		
		
	}
	
	public boolean buscar(Object o) {
		boolean encontrado=false;
		for (Object p : arrDefault) {
			if (p.equals(o)) {
				encontrado=true;
			
			}if (encontrado) {
				return true;
			}
		}return false;
	
	}
	public void mostrarLista() {
		for (Object o : arrDefault) {
			System.out.println(o);
		}
	}
	
	public void eliminarNodo(int posicion) {
		boolean pasado=false;
		int auxil;
		try {
			tamanio= arrDefault.length;
			
		}catch (Exception e) {
			System.out.println("no hay elementos en la lista");
		}
		aux= new Object[tamanio-1];
		
			arrDefault[posicion]=null;
		for (int h= 0; h<arrDefault.length;h++) {
	
			//tengo en cuenta que el elemento del array no sea null ( le hemos puesto null
			//antes de recorrer el array, puesto que queremos eliminarlo, lo que vamos a hacer 
			//es no a�adirlo
			if (arrDefault[h]!=null) {
					
						if (pasado) { // si se cumple esta condicion es necesario intervenir en 
								// las posiciones del array al que vamos a copiar, puesto que tiene 
							// un tama�o menor 
							auxil=h;
							auxil--;
							aux[auxil]=arrDefault[h];
							pasado=false;
							// igualamos pasado a false para que no vuelva a entrar aqui
						}else {
						
							aux[h]=arrDefault[h];
						}
					
				}else {
					//si el elemento en cuestion es el que queremos elimar, tendra valor null
					pasado=true;
				}
			
		}
		
			
		//genero un nuevo arrayOriginal con el tama�o modificado
		arrDefault = new Object [tamanio-1];
		//copiando el auxiliar en el original
		for( int i = 0; i <aux.length;i++) {
			arrDefault[i]=aux[i];
		}
		
		
		
		
		
	}
}
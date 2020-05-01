package tema9ActProouestasIvan;

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
			//almacenamos el valor del tamaño de nuestro array en la variable tamanio
			//si no hubiera sido inicializado nuestro array, por defecto se asume que tamanio=1
			if (tamanio>0 && tamanio!=null) {
				tamanio+=1;
			}
		}catch (Exception e) {
			tamanio=1;
		}//genero un array del mismo tamño que el original (arrayDefault)
		aux= new Object[tamanio];
		//aqui inicializamos el array Default en caso  de que tamaño sea 1, (el menor tamaño posible para un array)
		if(tamanio<2) {
			arrDefault = new Object [tamanio];
		}
		//copiamos un array dentro de otro para preservar los valores previos
		System.arraycopy(arrDefault, 0, aux, 0, tamanio-1);
		arrDefault = new Object [tamanio];
		
		for( int i = 0; i <aux.length-1;i++) {
			//evitamos añadir en la posicion 0, eso lo haremos despues
			arrDefault[i+1]=aux[i];
		}
		arrDefault[0]=o;
		tamanio++; //aumentamos el tamaño del arrayOriginal
		
		
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
			//es no añadirlo
			if (arrDefault[h]!=null) {
					
						if (pasado) { // si se cumple esta condicion es necesario intervenir en 
								// las posiciones del array al que vamos a copiar, puesto que tiene 
							// un tamaño menor 
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
		
			
		//genero un nuevo arrayOriginal con el tamaño modificado
		arrDefault = new Object [tamanio-1];
		//copiando el auxiliar en el original
		for( int i = 0; i <aux.length;i++) {
			arrDefault[i]=aux[i];
		}
		
		
		
		
		
	}
}
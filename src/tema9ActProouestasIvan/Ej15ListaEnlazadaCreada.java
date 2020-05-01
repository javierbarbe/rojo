package tema9ActProouestasIvan;



public class Ej15ListaEnlazadaCreada {
	/*
	 * Implementa una cola utilizando una lista enlazada simple (será programada íntegramente por  el alumno, 
	 * sin usar librerías específicas de listas de Java). La clase debe llamarse ColaDinamica. 
	 * Para probarlo, incorporaremos objetos de la clase Character, cuyos valores serán las letras del abecedario.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ColaDinamica <Object> micola= new ColaDinamica<>();
			micola.aniadePrincipio("hola");
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


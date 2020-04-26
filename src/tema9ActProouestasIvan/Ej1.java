package tema9ActProouestasIvan;

public class Ej1 {

	/*
	 * Crear una clase genérica ClaseGenerica que tenga como único atributo un objeto genérico, como constructor,
		el constructor general, que inicializa el atributo, y que además disponga de un método llamado tipoDeClase(),
		que muestre el tipo de dato que se ha cargado para la clase genérica (usaremos getClass().getName() sobre el
		objeto).
		Además hacer una clase de prueba donde instanciemos una ClaseGenerica para Integer y veamos el valor del
		entero correspondiente. También instanciaremos una ClaseGenerica para String y mostraremos su valor. Por
		último, intentaremos instanciar una ClaseGenerica para un char, y veremos el resultado.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseGenerica <Integer> clsgen= new ClaseGenerica<>(13);
		clsgen.tipoDeClase();
		ClaseGenerica <String> clsStrn= new ClaseGenerica<>("hello");
		clsStrn.tipoDeClase();
		ClaseGenerica<Character> clasChar= new ClaseGenerica<>('h');
		clasChar.tipoDeClase();
	}

}
class ClaseGenerica <T> {
	 T obj;
	 public ClaseGenerica (T o){
		 obj=o;
	 }
	 public void tipoDeClase() {
		System.out.println( obj.getClass().getName());
	 }
}
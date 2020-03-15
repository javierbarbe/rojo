package examen2trim;

public class PruebaBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Revista[] revistas = new Revista[2];
//		for (int i=0; i< detres.length;i++) { sdsdds
		revistas[0] = new Revista("12211", "Recetas de la Abuela", 1876, 12);
		revistas[1] = new Revista("12511", "El señor de los Codiguillos", 1996, 2);

		Libro[] dedos = new Libro[3];
		dedos[0] = new Libro("456789", "Mr.Banks", 1996);
		dedos[1] = new Libro("112233", "Peter Pan", 1926);
		dedos[2] = new Libro("15611", "Java para dummies", 1486);

		for (int i = 0; i < revistas.length; i++) {
			System.out.println(revistas[i]);
		}
		System.out.println();
		for (int i = 0; i < dedos.length; i++) {
			System.out.println(dedos[i]);
		}
		dedos[0].presta();
		dedos[0].estaPrestado();
		dedos[0].presta();
		dedos[1].presta();
		dedos[1].estado();
		dedos[1].devuelve();
		dedos[1].estaPrestado();
	}

}

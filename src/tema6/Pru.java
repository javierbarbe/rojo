package tema6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pru {

	public static void main(String[] args) {
//		ManipularCadena ola = new ManipularCadena();
//		ola.contieneCadena(ola.stringACadena("hola"));
//		ola.esVocal(ola.stringACadena("se"));
		Pattern p= Pattern.compile("(hola)(adios)");
		Matcher q= p.matcher("hola hola hola");
		q.find();
		System.out.println(q.group(1));
//		Pattern dni=Pattern.compile("[0-9]{8}[a-zA-Z]");
//		String metido="o09069554Xadad09069554p";
//		String metido2="o09069554Xsdaadad09069554p";
//		Matcher m=dni.matcher("metido metido2");
//		System.out.println(metido.length()+" longitud del string introducido");
//		
//		System.out.println(m.find()+" si al comprobar todo el string aparece por primera vez");
//		System.out.println(m.end()+ " necesario hacer find primero");
//		System.out.println(m.start()+" que posicion del string coincide y es inicio de coincidencia");
//		System.out.println(m.matches()+" si hay coincidencia total entre el patron y lo introducido");
//		System.out.println(m.find()+ " una vez hecho find, vuelve a buscar a partir de la poscion en la que "
//				+" lo encontro");
//		System.out.println(m.start()+" posicion en la que encuentra la coincidencia, rtiene en ucenta el find anterior");
//		System.out.println(m.start());
//		System.out.println(m.end()+" posicion final desde la que encuentra la coincidencia");
//		m.reset();
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
	}

}

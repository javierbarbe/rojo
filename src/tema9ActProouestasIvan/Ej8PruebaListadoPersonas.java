package tema9ActProouestasIvan;

public class Ej8PruebaListadoPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListadoPersonas2 listaImportada= new ListadoPersonas2();
		listaImportada.listaPersonas.add(new Persona ("javier", "barbero siesto", 1992));
		listaImportada.listaPersonas.add(new Persona("daniel","barbero siesto", 1998));
		listaImportada.listaPersonas.add(new Persona("monica","geller siesto", 1998));
		
		//System.out.println(p.buscarPorNombre("javier"));
		System.out.println(">>><<<<<<<<<<<<<<<<<<BUSQUEDA POR APELLIDOS>>>>>>>>>>>>>>>>>>>>");
		listaImportada.buscarPorApellidoPatron("barbero");
		System.out.println("\n<<<<<<<<<<<<<<<BUSQUEDA POR AÑOS <>>>>>>>>>>>>>>>>>>>>>>>>>>");
		listaImportada.buscarPorAño(1998);
	}

}

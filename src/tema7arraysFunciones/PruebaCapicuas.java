package tema7arraysFunciones;

public class PruebaCapicuas {

	public static void main(String[] args) {
	
		Capicuas ne= new Capicuas();
		int [] iniciado=ne.arcapi;
		iniciado[0]=33;
		ne.imprimeArray(ne.filtracapicuas(iniciado));
		System.out.println();
		Capicuas cop= new Capicuas(ne);
		cop.imprimeArray((cop.filtrado));

	}

}

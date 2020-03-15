package examen2trim;

public class PruebaHorarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej2 ne= new Ej2();
		
		ne.rellenahoras();
		int [] [] horarios= ne.horarios;
		ne.imprimeMatriz(horarios);
		System.out.println();
		ne.imprimeMatriz(Ej2.sumaFilas(horarios));
	}

}

package tema6BIS;

public class Ej1 {
//LOS DOS CORCHETES 
	int [] [] arra = new int [3][6];
	
	public Ej1() {
		arra[0][1]=30;
		arra[0][2]=2;
		arra[0][5]=5;
		arra[1][0]=75;
		arra[2][2]=-2;
		arra[2][3]=9;
		arra[2][5]=75;
	
	}
	public int [] [] imprime(){
		
		for (int i=0;i<arra.length;i++) {
			for (int j=0;j<arra[i].length;j++) {
				System.out.printf("%4d",arra[i][j]);
			}System.out.println();
		}
		
		return arra;
	}
}

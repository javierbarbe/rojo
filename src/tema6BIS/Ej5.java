package tema6BIS;

public class Ej5 {
	private int [] []arr= new int [6][10];
	private int filaminimo,filamaximo,columnaminimo,columnamaximo;
	private int min;
		public Ej5() {
			
		}
		
		public int [] [] iniciaYmuestraMayorMenor(){
			int max=arr[0][0];
			min = 1000;
			for(int i=0;i<arr.length;i++) {
				for (int j=0;j<arr[i].length;j++) {
					arr[i][j]=((int)(Math.random()*100)+1);
					System.out.printf("%4d",arr[i][j]);
					if(max<arr[i][j]) {
						max=arr[i][j];
						filamaximo=i;
						columnamaximo=j;
					}
					if (min>arr[i][j]) {
						min=arr[i][j];
						filaminimo=i;
						columnaminimo=j;
						
					}
				}System.out.println();
			} 
			System.out.println(max+ " fila maximo "+ filamaximo+" y columna maximo "+ columnamaximo);
			System.out.println(min+" fila minimo "+filaminimo+" y columna minimo "+columnaminimo);
			
			
			return arr;
		}
}

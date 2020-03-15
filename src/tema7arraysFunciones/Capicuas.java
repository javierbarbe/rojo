package tema7arraysFunciones;
import tema7.*;
public class Capicuas extends Ej20a28 {
public int [] arcapi=super.generaArrayInt(5, 999999, 0);
int [] filtrado;
	public Capicuas() {
		
	}
	public Capicuas( Capicuas original) {
		this.arcapi=original.arcapi;
		this.filtrado=original.filtrado;
	}

	public int [] filtracapicuas(int [] recibido) {
//		recibido[0]=1111;
		int j=0;
//		recibido[3]=44;
		int [] filtrado= new int [recibido.length];
		int [] auxiliar;
//		recibido[2]=55455;
		StringBuilder [] vol= new StringBuilder[recibido.length];
		for (int i=0;i<recibido.length;i++) {
			
			String num=Integer.toString(recibido[i]);
			vol[i]=new StringBuilder();
				vol[i].append(num);
//				System.out.println(vol[i]);
				StringBuilder revertido=vol[i].reverse();
				String invertido=revertido.toString();
				
				if(num.equals(invertido)){
					System.out.println("este numero "+vol[i]+" es = a "+ invertido);
					
						filtrado[j]=recibido[i];
						j++;
						
					}
		}auxiliar = new int [j];
		j--;
					
					for (int k=j;k>=0;k--,j--) {
						auxiliar[k]=filtrado[j];
					}
				if(j<0) {
					auxiliar=new int[1];
					auxiliar[0]=j;
				}
		
		
		return auxiliar;
	}
	
}

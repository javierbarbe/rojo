
import java.util.Scanner;
public class IsbnNuevo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada=new Scanner(System.in);
int numero, unidades, decenas,d3,d4,d5,d6,d7,d8,d9, control;
numero=entrada.nextInt();
unidades=numero%10;
decenas=numero/10%10;
d3=numero/100%10;
d4=numero/1000%10;
d5=numero/10000%10;
d6=numero/100000%10;
d7=numero/1000000%10;
d8=numero/10000000%10;
d9=numero/100000000%10;
control=(d9+d8*2+d7*3+d6*4+d5*5+d4*6+d3*7+decenas*8+unidades*9)%11;
 if (control==10) {
	 System.out.println( numero+"-X");
	 
 }else {
	 System.out.println(numero+"-"+control);
 }

	}

}

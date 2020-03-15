package ejerciciosLibro200;
import java.util.Scanner;
public class Suma100 {
	
	private int num,total;
Scanner e=new Scanner(System.in);
	public Suma100() {}
public void calculaSuma() {
	
	System.out.println("introduce numero");
	num=e.nextInt();
	int tope=num+100;
	while (num<0) {
		System.out.println("numero positivo por favor");
		num=e.nextInt();
	}
while (num<=tope) {
	total+=num;
	num++;
}
System.out.println("el total es "+ total);

} 
}

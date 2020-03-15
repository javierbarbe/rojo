package ejerciciosLibro200;
import java.util.Scanner;
public class Horozcopo {
Scanner e =new Scanner(System.in);
private int dia, mes;
	
	public void diHoroscopo() {
		
		System.out.println("introduce dia nacimiento");
		dia=e.nextInt();
		System.out.println("Introduce el mes");
		mes=e.nextInt();
		
		
		switch(mes) {
		case 1: 	if (dia<21) {
					System.out.println("tu horoscopo es capricornio");
					} else {
						System.out.println("tu Horoscopo es acuario");
					}
					break;
		
		case 2:  if (dia<21) {
			System.out.println("tu horoscopo es acuario");
			} else {
				System.out.println("tu Horoscopo es piscis");
			}
			break;
		case 3: 	if (dia<21) {
			System.out.println("tu horoscopo es piscis");
			} else {
				System.out.println("tu Horoscopo es aries");
			}
			break;

		case 4:  if (dia<21) {
			System.out.println("tu horoscopo es aries");
			} else {
				System.out.println("tu Horoscopo es tauro");
			}
			break;
			
		case 5: 	if (dia<21) {
			System.out.println("tu horoscopo es tauro");
			} else {
				System.out.println("tu Horoscopo es geminis");
			}
			break;

		case 6:  if (dia<21) {
				System.out.println("tu horoscopo es geminis");
				} else {
					System.out.println("tu Horoscopo es cancer");
				}
				break;
		case 7: 	if (dia<21) {
				System.out.println("tu horoscopo es cancer");
				} else {
					System.out.println("tu Horoscopo es leo");
				}
				break;
			
		case 8:  if (dia<21) {
				System.out.println("tu horoscopo es leo");
				} else {
					System.out.println("tu Horoscopo es virgo");
				}
				break;
		case 9: 	if (dia<21) {
			System.out.println("tu horoscopo es virgo");
			} else {
				System.out.println("tu Horoscopo es libra");
			}
			break;

		case 10:  if (dia<21) {
			System.out.println("tu horoscopo es libra");
			} else {
				System.out.println("tu Horoscopo es escorpio");
			}
			break;
		case 11: 	if (dia<21) {
			System.out.println("tu horoscopo es escorpio");
			} else {
				System.out.println("tu Horoscopo es sagitario");
			}
			break;
		
		case 12:  if (dia<21) {
			System.out.println("tu horoscopo es sagitario");
			} else {
				System.out.println("tu Horoscopo es capricornio");
			}
			break;
				
		
		}
		
		
	}
}

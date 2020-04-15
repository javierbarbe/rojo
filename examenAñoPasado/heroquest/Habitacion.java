package heroquest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Habitacion {

	private boolean abierta = false;
	private int cantidadEnemigos;
	  LinkedList<Enemigo> listaMonstruosHabitacion = new LinkedList<>();
	ListIterator <Enemigo> iteradorMonstruo = listaMonstruosHabitacion.listIterator();
	public Habitacion() {
		
	}
	public void abrirPuerta(Personaje personaje) {
		if (!abierta) {
			Dado d6 = new Dado(6);
			Dado d4 = new Dado(4);
			abierta = true;
			int resultado = d6.getValor();
			int cantidad=  d4.getValor();
			System.out.println("tirada: "+resultado);// pongo un valor fijo de pruebas
			switch (resultado) {
			case 1:
				for (int i = 0; i <cantidad; i++) {
					listaMonstruosHabitacion.add(new Enemigo("esqueleto"));
				}
				break;
			case 2:
				for (int i = 0; i < cantidad; i++) {
					listaMonstruosHabitacion.add(new Enemigo("goblin"));
				}
				break;
			case 3:
				for (int i = 0; i < cantidad; i++) {
					listaMonstruosHabitacion.add(new Enemigo("orco"));
				}
				break;
			case 4:
				for (int i = 0; i < cantidad; i++) {
					listaMonstruosHabitacion.add(new Enemigo("momia"));
				}
				break;
			case 5:
				for (int i = 0; i < cantidad; i++) {
					listaMonstruosHabitacion.add(new Enemigo("fimir"));
				}
				break;
			case 6:
				for (int i = 0; i < cantidad; i++) {
					listaMonstruosHabitacion.add(new Enemigo("goblin"));
				}
				break;
			}
			cantidadEnemigos = listaMonstruosHabitacion.size();
		}
	}

	protected boolean isAbierta() {
		return abierta;
	}

	protected void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	public void matarEnemigo() {
		if(listaMonstruosHabitacion.size()!=0) {
		  listaMonstruosHabitacion.remove(0);
		  cantidadEnemigos--;}
		else {
			System.out.println("No quedan enemigos");
			
		}
	}
	public LinkedList <Enemigo> listaEnemigos(){
//		while(iteradorMonstruo.hasNext()) {
//			System.out.println(iteradorMonstruo.next().getVida());
//		}
		return listaMonstruosHabitacion;
	}
	protected int numEnemigosRestantes() {
		if(!abierta) {
			System.out.println("La habitacion esta cerrada aun");
		}if ( listaMonstruosHabitacion.size()==0) {
			System.out.println("Los has matado a todos");
			return 0;
		}else {
		return cantidadEnemigos;
		}
	}
	public String toString() {
		if(!this.abierta) {
			return "no se ha abierto aun esta habitacion";
		}
		if(listaMonstruosHabitacion.isEmpty()) {
			return "La habitacion ha sido vaciada";
		}
		return " la habitacion contiene  " + this.cantidadEnemigos+ " monstruos de raza "+ 
	this.listaMonstruosHabitacion.getFirst().getRaza();
	}
	
	protected void enemigoAtributos() {
		for (Enemigo e : listaMonstruosHabitacion) {
			
			System.out.println(e);
			System.out.println();
		}
	}
	protected void listadoEnemigos() {
	//	comprobarMuertes();
		for (Enemigo e : listaMonstruosHabitacion) {
			System.out.println(e);
			System.out.println();
		}
		if(listaMonstruosHabitacion.size()==0) {
			System.out.println("No quedan enemigos en estas dependencias");
		}
	}

	protected void setCantidadEnemigos(int cantidadEnemigos) {
		this.cantidadEnemigos = cantidadEnemigos;
	}
public Enemigo añadirMonstruo(Enemigo e, Habitacion hab) {
	hab.listaMonstruosHabitacion.addLast(e);
//	this.numEnemigosRestantes()
	//listaEnemigos().add(e);
	//this.listaEnemigos().add(e);
	this.cantidadEnemigos+=1;

	return e;
}
//	public void comprobarMuertes() {
//
//		while (muerto.hasNext()) {
//			if (muerto.next().getVida() <= 0) {
//				habitacion.remove(0); //elimina el ultimo al coger el tamaño de la lista de monstruos
//				cantidadEnemigos--;
//			}
//		}
//		System.out.println(cantidadEnemigos);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Habitacion verde = new Habitacion();
		Personaje javi = new Personaje("jos", "humano", "bárbaro");
		verde.abrirPuerta(javi);
	//	verde.comprobarMuertes();
		Enemigo.consultarTodasRazas();
		//Enemigo.consultarTodasRazas();
		System.out.println();
		//System.out.println(Enemigo.getTodosDaños());
		verde.enemigoAtributos();
		System.out.println(verde.listaMonstruosHabitacion.size());
		//javi.eligeAccion(verde);
		System.out.println(verde.listaMonstruosHabitacion.size());
		Enemigo k = new Enemigo ("goblin");
		
		verde.añadirMonstruo(k, verde);
		System.out.println(verde.listaMonstruosHabitacion.size()+" hay este numero de monstruos");
		while(verde.listaEnemigos().size()>0) {
			for(Enemigo en: verde.listaMonstruosHabitacion) {
				//if (en.getVida()>0) {
				en.enemigoAtacan(javi);
			}
				javi.eligeAccion(verde);
		}
	//	}
		System.out.println(verde.listaMonstruosHabitacion.size());
		System.out.println(verde.cantidadEnemigos + " cantidad ENemigos");
		javi.eligeAccion(verde);
		javi.eligeAccion(verde);
		
//		System.out.println(verde.getCantidadEnemigos());
		

	}
	protected int getCantidadEnemigos() {
		return cantidadEnemigos;
	}

}

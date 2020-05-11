package enumerados;

public class Bolso {

	enum nombre2{fiesta,bandolera,mochila};
	String nombre;
	public Bolso(String tipo) {
		if(!tipo.equals("fiesta") && !tipo.equals("bandolera") && !tipo.equals("mochila")) {
			System.out.println("No es un tipo admitido");
		}else {
		this.nombre=tipo;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bolso b1 = new Bolso("bandolera");
		b1.nombre="fiesta";
		nombre2 tipo =  Enum.valueOf(nombre2.class, b1.nombre);
	}

}

package tema8Excepciones;

public class Ej1Julian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int resultado=0;
			String signo = args[0]; 
			int primerNum = Integer.parseInt(args[1]);
			int segundoNumero= Integer.parseInt(args[2]);
			System.out.println(signo);
			System.out.println(primerNum);
			System.out.println(segundoNumero);
			
			if (signo.equals("x")) {
				resultado = primerNum*segundoNumero;
				System.out.println(resultado);
			}
			if (signo.equals("+")) {
				resultado=primerNum+segundoNumero;
				System.out.println(resultado);
			}
			if(signo.equals("-")) {
				resultado=primerNum-segundoNumero;
				System.out.println(resultado);
			}
			if(signo.equals("/")) {
				resultado=primerNum/segundoNumero;
				System.out.println(resultado);
			}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("fallo  aritmetico");
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("fallo numberException");
			e.getStackTrace();
		}
		catch (Exception e) {
			System.out.println("Error");
			System.out.println(e.getCause());
		}finally {
			System.out.println("Hasta la proxima");
		}
	}

}

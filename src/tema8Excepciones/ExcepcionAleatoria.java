package tema8Excepciones;

import java.awt.image.ImagingOpException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcepcionAleatoria {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Exception [] excepciones = {new NumberFormatException(),new  IOException (), 
				new FileNotFoundException(), new IndexOutOfBoundsException() , new ArithmeticException()};
		try {
			throw excepciones[(int)(Math.random()*5)];
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

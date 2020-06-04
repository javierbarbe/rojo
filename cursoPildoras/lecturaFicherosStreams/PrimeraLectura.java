package lecturaFicherosStreams;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PrimeraLectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerFicheros1 hola = new LeerFicheros1();
		hola.lee();
		
		
	}

}


class LeerFicheros1 {
	public void lee(){
		JFrame marco = new JFrame();
		marco.setBounds(120, 120, 400, 300);
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea areatexto= new JTextArea();
		JScrollPane barrascroll = new JScrollPane (areatexto, 
				   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	//areatexto.
		marco.add(barrascroll);
		try {
			FileReader miarchivo = new FileReader("Covid.txt");
			int letra = miarchivo.read();
			 String textofinal="";
			while (letra!=-1) {
				 char palabra= (char)letra;
				 letra =miarchivo.read();
				 String texto = Character.toString(palabra);
				textofinal = textofinal.concat(texto);
				 areatexto.setText(textofinal);
				System.out.print(palabra);
			}
			miarchivo.close();
		//	System.out.println("fin");
			//while (miarchivo.)
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no se encuentra ");
			System.out.println(e.getCause());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al leer el archivo");
			System.out.println(e.getCause());
		}
	}
}
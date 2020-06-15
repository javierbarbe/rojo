package sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Servidor extends JFrame implements Runnable {
	private JTextArea cuadroTextoRecibidor;

	public static void main(String[] args) {

		Servidor se = new Servidor();
	}

	public Servidor() {
		setTitle("Servidor");
		setVisible(true);
		setBounds(400, 300, 390, 300);
		JPanel panelServidor = new JPanel();
		setName("Servidor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		cuadroTextoRecibidor = new JTextArea(25, 25);

		panelServidor.add(cuadroTextoRecibidor);

		add(panelServidor);
		// creo hilos para hacer que este permanentemente a la escucha
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Exstoy a la escucha");
		// usaremos la clase ServerSocket que pondra un socket de servidor abierto en el
		// puerto indicado
		// hay que usar luego el metodo accept para generar un socket

		// para que este continuamente recibiendo lo que manda el cliente necesita no
		// estar cerrado
		// eso se consigue metiendo todo dentro de un bucle while true

		try {
			ServerSocket servidor = new ServerSocket(6666);
			String nick , ip ,mensaje;
			// necesitamos crear una instancia del objeto que enviamos desde el cliente
			// para poder recomponerlo
			PaqueteEnviado paqueteRecibido;
			while (true) {
				Socket miSocket = servidor.accept();
				// crear un flujo de entrada (requiere un argumento tipo socket... usamos el
				// generado por el servidor
				// y el metodo accept
			//	DataInputStream flujo_entrada = new DataInputStream(miSocket.getInputStream());
				// con el metodo readUTF del objeto data input Stream, leo lo que viene viajando
				// por el socket
				// en el puerto dado
			//	String mensaje_texto = flujo_entrada.readUTF();
			//	cuadroTextoRecibidor.append("\n" + mensaje_texto);
	//------------------------------------------------------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				ObjectInputStream paquetedatos = new ObjectInputStream(miSocket.getInputStream() );
				// iniciamos el paqueteRecibido de la lectura del objetoinputStream
				// necesario casteo
				paqueteRecibido= (PaqueteEnviado) paquetedatos.readObject();
				nick= paqueteRecibido.getNick();
				ip= paqueteRecibido.getIp();
				mensaje= paqueteRecibido.getMensaje();
				cuadroTextoRecibidor.append("\n"+nick+" : "+ mensaje+ " PARA "+ ip);
				miSocket.close();
			}

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

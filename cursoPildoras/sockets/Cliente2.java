package sockets;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cliente2 extends JFrame {
	private JTextField cuadroTexto;
	private JTextArea campoChat;
	private JTextField nick, ip;

	public static void main(String[] args) {
		Cliente2 pr = new Cliente2();
		pr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public Cliente2() {
		// defino el marco
		setVisible(true);
		setBounds(400, 300, 280, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Cliente");
		// creo la lamina y inicio los elementos que van a ir dentro de la lamina
		JPanel panelCliente = new JPanel();
		JLabel titulo = new JLabel("-CHAT-");
		nick= new JTextField(5);
		ip= new JTextField(8);
		cuadroTexto=new JTextField(22);
		campoChat = new JTextArea(12, 25);
		// creo el boton y le pongo a la escucha
		JButton botonEnviar = new JButton("Enviar");
		botonEnviar.addActionListener(new OyenteRecogeTexto());
		// añado los elementos a la lamina en orden
		panelCliente.add(nick);
		panelCliente.add(titulo);
		panelCliente.add(ip);
		panelCliente.add(campoChat);
		panelCliente.add(cuadroTexto);
		panelCliente.add(botonEnviar);
		// añado la lamina al marco
		add(panelCliente);
	}

	private class OyenteRecogeTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String texto = cuadroTexto.getText();
			String nicktexto= nick.getText();
			

			try {
				Socket misocket = new Socket(InetAddress.getLocalHost().getHostAddress(), 6666);
				String ip =InetAddress.getLocalHost().getHostAddress();
				System.out.println(ip);
				// ahora hay que crear un flujo de datos de salida
				// la clase socket tiene un metodo que devuelve un objeto OutputStream
				// que es el que usaremos al crear la instancia de flujo salida
			//	DataOutputStream flujoSalida = new DataOutputStream(misocket.getOutputStream());
				// usamos los metodos de los streams ... en ese flujo escribimos lo que hay en
				// la caja de texto con el metodo writeUTF(String)
			//	flujoSalida.writeUTF(texto);
				// hay que cerrar los strams
			//	flujoSalida.close();
				// utilizaremos un objeto en el que almacenaremos los datos 
				PaqueteEnviado datos = new PaqueteEnviado();
				datos.setIp(ip);
				datos.setNick(nicktexto);
				datos.setMensaje(texto);
			//---------------------------------------------
				// sera ese objeto el que enviaremos al servidor a traves del flujo de objectoutputStream
				ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
				// escribimos en el flujo el objeto writeObject();
				paquete_datos.writeObject(datos);
				// cerramos el socket
				misocket.close();
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}
}

// implementamos la interfaz serializable puesto que es un objeto que va a ser enviado por la red
class PaqueteEnviado implements Serializable{
	private String ip, nick, mensaje;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}

package layouts;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class ControlJspinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSpinner mar = new MarcoSpinner();
	}

}
class MarcoSpinner extends JFrame{
	public MarcoSpinner() {
		setVisible(true);
		setBounds(200, 200, 200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelSpinner pane = new PanelSpinner();
		add(pane);
	}
}

class PanelSpinner extends JPanel{
	
	public PanelSpinner() {
		String [] listapalabras = {"Enero", "Febrero", "Marzo", "Abril"};
		//metodo para modificar el tamaño del spinner setPreferedSize
		JSpinner control = new JSpinner(new SpinnerDateModel());
		// para que si quieres saltar en grupos , empezar en algo distinto a 0 o establecer un maximo o minimo
		JSpinner numeros = new JSpinner( new SpinnerNumberModel(5,0,10,2)) ;
		//clase anonima interna 
		JSpinner invertido = new JSpinner(new SpinnerNumberModel(10, 5, 15, 2) {
			@Override
			public Object getNextValue() {
				// TODO Auto-generated method stub
				return super.getPreviousValue();
			}
			 @Override
			public Object getPreviousValue() {
				// TODO Auto-generated method stub
				return super.getNextValue();
			}			
		});
		///************>>>>>>>>>>>>>>>  fin de clase anonima interna
		Dimension b = new Dimension (150, 20);
		//para saber las fuentes instaladas en tu PC
		String [] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner listaSpinner = new JSpinner(new SpinnerListModel(listapalabras));
		JSpinner listaFuentes = new JSpinner (  new SpinnerListModel(fuentes));
		add(invertido);
		listaFuentes.setPreferredSize(b);
		listaSpinner.setPreferredSize(b);
		add(listaSpinner);
		add(control);
		add(listaFuentes);
		add(numeros);
	}
}
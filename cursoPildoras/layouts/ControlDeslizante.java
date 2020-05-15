package layouts;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ControlDeslizante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSliders marco = new MarcoSliders();

	}

}


class MarcoSliders extends JFrame{
	
	public MarcoSliders () {
		setVisible(true);
		setBounds(500, 200, 300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelSliders pane = new PanelSliders();
		add(pane);
	}
}

class PanelSliders extends JPanel{
	JSlider deslizante2 = new JSlider(SwingConstants.HORIZONTAL,10,50,25);
	JSlider deslizante = new JSlider(SwingConstants.HORIZONTAL,10,50,25);
	JLabel texto = new JLabel("En un lugar de la Mancha ... de cuyo nombre no quiero acordarme....");
	JLabel texto2 = new JLabel("En un lugar de la Mancha2 ... de cuyo nombre no quiero acordarme....");
	public PanelSliders() { //swingconstants constante de interfaz que me permite que sea vertical u horizontal
							// por defecto es horizontal
	 setLayout(new BorderLayout());
		System.out.println(SwingConstants.HORIZONTAL); // vertial 1 , horizontal 0
		//para las marquitas a lo largo del deslizante
		deslizante.setMajorTickSpacing(20);
		deslizante.setMinorTickSpacing(5);
		deslizante.setPaintTicks(true);
		// para los numeros a lo largo del deslizante
	
		deslizante.setPaintLabels(true);
		// para hacer que el slider se quede en los valores del majortick o minortick no valores intermedios
	//	deslizante.setSnapToTicks(true);
		oyenteSlider oy = new oyenteSlider();
		deslizante.addMouseListener(oy);
		deslizante2.setMajorTickSpacing(20);
		deslizante2.setMinorTickSpacing(10);
		//pinta las marcas divisiorias en deslizante2
		deslizante2.setPaintTicks(true);
		//pinta los numeros en la barra deslizante2
		deslizante2.setPaintLabels(true);
		JPanel superior = new JPanel();
		superior.setLayout(new GridLayout(2,1));
		oyente2Slider mio = new oyente2Slider();
		deslizante2.addChangeListener(mio);
		superior.add(texto);
		superior.add(texto2);
		add(superior, BorderLayout.NORTH);
		//add(texto);
		add(deslizante2,BorderLayout.SOUTH);
		add(deslizante, BorderLayout.CENTER);
	}
	
	private class oyente2Slider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			System.out.println("el valor ahora es "+ deslizante2.getValue() );
			texto2.setFont(new Font("Calibri", 1, deslizante2.getValue()));
		}
		
	}
	
	// le iria mejor con un ChangeListener
	
	private class oyenteSlider implements MouseListener{


		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
				if (deslizante.getValue()> 30) {
				System.out.println("es mayor a 30 tu selecccion y vale "+ deslizante.getValue());
				
			}else{
				System.out.println("es menor y vale " + deslizante.getValue());
			}
				texto.setFont(new Font ("Arial", 0, deslizante.getValue()));

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}


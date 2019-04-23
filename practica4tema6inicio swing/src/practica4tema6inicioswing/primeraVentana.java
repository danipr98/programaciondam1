package practica4tema6inicioswing;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class primeraVentana  extends JFrame {

	private static final long serialVersionUID = 1L;
	private Color miColor =new Color(61, 105, 124);
	
public primeraVentana() {
		
	
		setTitle("1ª ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(miColor);
		setSize(700, 600);
		setLocationRelativeTo(null);
		Image icono =Toolkit .getDefaultToolkit().getImage("C:\\Users\\jorge\\git\\repositoriodam1\\practica4tema6inicio swing\\src\\images.jpg");
		setIconImage(icono);
		jp lamina=new jp();
		add(lamina);
		setVisible(true);
		
	}



	
}

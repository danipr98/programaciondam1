package practica4tema6inicioswing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class secventana extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private Color miColor =new Color(61, 105, 124);
	

	public  secventana() {
		setTitle("2ª ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(miColor);
		centrar();
		setVisible(true);
		
		
	}
	
	
	
	public void centrar() {
	Toolkit mipantalla = Toolkit.getDefaultToolkit();
	Dimension tamanopantalla=mipantalla.getScreenSize();
	int alt=tamanopantalla.height;
	int anch=tamanopantalla.width;
	setSize(anch, alt / 2);
	setLocation(anch / alt, alt /4);
	img(mipantalla);

	}
	public void img(Toolkit mipantalla) {
		Image icono=mipantalla.getImage("C:\\Users\\jorge\\git\\repositoriodam1\\practica4tema6inicio swing\\src\\1.jpg");
		setIconImage(icono);
		
	}
}

package practica4tema6inicioswing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorChooserUI;

public class principal extends JFrame  {

	
	private static final long serialVersionUID = 1L;
	private Color miColor =new Color(61, 105, 124);
	

	
	public void primeraVentana() {
		
		setTitle("1� ventana");
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
	
	public void secventana() {
		
		setTitle("2� ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(miColor);
		centrar();
		Image icono =Toolkit .getDefaultToolkit().getImage("C:\\Users\\jorge\\eclipse-workspace\\practica4tema6inicio swing\\src\\images.jpg");
		setVisible(true);
		setIconImage(icono);
	}
		
	public static void main(String[] args) {
		principal aPrincipal=new principal();
		
		aPrincipal.primeraVentana();
		//aPrincipal.secventana();
		
		  
		

	}

}

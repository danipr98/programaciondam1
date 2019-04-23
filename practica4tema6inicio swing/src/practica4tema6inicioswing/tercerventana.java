package practica4tema6inicioswing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tercerventana  extends JFrame{
	JButton boton;
	JTextField caja1;
	JLabel etiqueta;
	
	public tercerventana() {
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(200,200);
		setLayout(null);
		setTitle("formulario");
		
		
		etiqueta= new JLabel();
		etiqueta.setText("nombre");
		etiqueta.setBounds(30, 40, 100, 30);
		add(etiqueta);
		
		etiqueta= new JLabel();
		etiqueta.setText("apellido");
		etiqueta.setBounds(30, 60, 100, 30);
		add(etiqueta);
		
		caja1= new JTextField();
		caja1.setBounds(90, 50, 70, 15);
		add(caja1);
		
		caja1= new JTextField();
		caja1.setBounds(90, 70, 70, 15);
		add(caja1);
		
		boton=new JButton();
		boton.setText("aceptar");
		boton.setBounds(30, 100, 100, 30);		add(boton);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}

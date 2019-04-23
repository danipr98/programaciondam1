package practica4tema6inicioswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class jp  extends JPanel {

	public void paintComponent(Graphics g) {
		setBackground(Color.black);
		g.drawString("segunda ventana",300 ,200 );
		g.drawArc(110, 213, 303, 301, 342, 32);
		setLayout(new BorderLayout());
		add(new JButton("pepe"),BorderLayout.SOUTH);
	
	
	}
	public void button() {
		
	}
	
}


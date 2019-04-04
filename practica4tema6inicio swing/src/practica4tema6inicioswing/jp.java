package practica4tema6inicioswing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class jp  extends JPanel {

	public void paintComponent(Graphics g) {
		setBackground(Color.black);
		g.drawString("segunda ventana",300 ,200 );
		
		
	}
	
	
}

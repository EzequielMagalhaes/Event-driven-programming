/*
 * import javax.swing.JFrame;
 * import javax.swing.JLabel;
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Prog4 extends JFrame{
	public static void main(String[] args) {
		new Prog4();
	}
		
	public Prog4() {
		super("Hello");		
		this.add(new Hello("Teste 1"));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300); //horizontal & vertical;
		this.setVisible(true);
	}
	
	class Hello extends JComponent implements MouseMotionListener{
		String message;
		int messageX = 120;
		int messageY = 120;
		
		public Hello(String message) { // construtor;
			this.message = message;
			addMouseMotionListener(this);
		}
		@Override
		public void paintComponent(Graphics g) {
			g.drawString(message, messageX, messageY);
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			messageX = e.getX();
			messageY = e.getY();
			repaint();
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			
		}
	}
}
/*
 * import javax.swing.JFrame;
 * import javax.swing.JLabel;
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Prog1 {
	
	public static void main(String[] args) {
		new Prog1().teste();
	}
		
	public void teste() {
		JFrame frame = new JFrame("Hello");
		frame.add(new JLabel("Olá Mundo"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
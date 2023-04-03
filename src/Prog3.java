/*
 * import javax.swing.JFrame;
 * import javax.swing.JLabel;
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Prog3 extends JFrame{
	
	public static void main(String[] args) {
		new Prog3();
	}
		
	public Prog3() {
		super("Hello");
		
		JPanel pn1 = new JPanel();
		pn1.add(new JLabel("Teste 1"));
		
		JPanel pn2 = new JPanel();
		pn2.add(new JLabel("Teste 2"));
		//pn2.add(new JLabel("Teste 3"));
		
		this.add(pn1, BorderLayout.NORTH);
		this.add(pn2, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300); //horizontal & vertical;
		this.setVisible(true);
	}
}
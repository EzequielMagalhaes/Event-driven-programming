/*
 * import javax.swing.JFrame;
 * import javax.swing.JLabel;
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Prog2 extends JFrame{
	
	public static void main(String[] args) {
		new Prog2();
	}
		
	public Prog2() {
		super("Hello");
		this.add(new JLabel("Teste"));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300); //horizontal & vertical;
		this.setVisible(true);
	}
}
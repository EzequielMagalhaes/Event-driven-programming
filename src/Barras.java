import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
//import java.awt.BorderLayout;

public class Barras extends JFrame{ //javax.swing.JFrame ... assim nao precisa do import antes;
	public Barras(){
		this.setTitle("Minha Janela");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,300);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(Color.GREEN);// cor estática;
		//pn1.setBackground(new Color(40,80,240)); //rgb;
		pn1.add(new JLabel("Hello World"));
			//this.add(pn1,BorderLayout.EAST);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(Color.BLUE);
		pn2.add(new JLabel("Hello"));
			//this.add(pn2,BorderLayout.WEST);
		
		JPanel pn3 = new JPanel();
		pn3.setBackground(Color.PINK);
		pn3.add(new JLabel("Hello"));
		
		this.setLayout(new GridLayout(0,3)); // linhas & colunas;
		this.add(pn1);
		this.add(pn2);
		this.add(pn3);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Barras();
	}
}
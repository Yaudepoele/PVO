import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre1 extends JFrame {
	private JPanel container = new JPanel();
	private JTextField texte1 = new JTextField("Entrer votre texte ici.");
	
	public Fenetre1(){
		this.setTitle("PVO");
		this.setSize(1100, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.isResizable();
		
		container.setBackground(Color.WHITE);
		JPanel pan1 = new JPanel();
		
		Font police = new Font("Comic Sans MS", Font.BOLD, 16);
		texte1.setFont(police);
		texte1.setForeground(Color.BLACK);
		pan1.add(texte1);
		container.add(pan1, BorderLayout.NORTH);
		
		this.setContentPane(container);
			
		this.setVisible(true);

	}
}

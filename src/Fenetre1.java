import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre1 extends JFrame {
	private JPanel container = new JPanel();
	private JButton bouton1 = new JButton();
	private FenTexte texte2 = new FenTexte();
	
	
	
	public Fenetre1(){
		this.setTitle("PVO");
		this.setSize(1100, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.isResizable();
		
		bouton1.setText("Intro");
		
		container.setBackground(Color.WHITE);
		JPanel pan1 = new JPanel();
		JPanel menuBoutons = new JPanel();
		pan1.setBackground(Color.WHITE);
		menuBoutons.setBackground(Color.DARK_GRAY);
		
		Font police = new Font("Comic Sans MS", Font.BOLD, 16);
		texte2.setFont(police);
		texte2.setForeground(Color.BLACK);
		pan1.add(texte2);
		menuBoutons.add(bouton1);
		
		container.add(menuBoutons, BorderLayout.NORTH);
		container.add(pan1, BorderLayout.CENTER);
		
		
		this.setContentPane(container);

		this.setVisible(true);

	}
}

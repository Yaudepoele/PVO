import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JSplitPane;


public class Fenetre1 extends JFrame {
	
	private JPanel container1 = new JPanel();
	private JSplitPane container2 = new JSplitPane();
	private FenTexte texte2 = new FenTexte();
    private BoiteDeTexte bdt1 = new BoiteDeTexte(); 
    private JLabel label = new JLabel("Nombre de points :");
    private ArbreDesPoints adpts = new ArbreDesPoints();
	public Fenetre1(){
		
		this.setTitle("PVO");
		this.setSize(1100, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.isResizable();
		this.label.setFont(new Font("Georgia Normal", Font.PLAIN, 16));
	
		container1.add(label);
		container1.setBackground(Color.GRAY);
		JPanel pan1 = new JPanel();
		pan1.setBackground(Color.GRAY);
		adpts.buildTree();
		pan1.add(bdt1);
		
	
		container1.add(pan1, BorderLayout.EAST);
		container1.add(adpts,BorderLayout.CENTER);
		// Ajout des options à l'intérieur du container1 à gauche du splitpane et du texte de rendu à droite du splitpane 
		container2.setRightComponent(texte2);
		container2.setLeftComponent(container1);
		container2.setBackground(Color.WHITE);
		container2.setDividerLocation(CENTER_ALIGNMENT);
		container2.setVisible(true);
		this.setContentPane(container2);
		this.setVisible(true);
	

		
	}
	
	
}

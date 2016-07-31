
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class FenTexte extends JTextArea{
	 //private JScrollPane scroll = new JScrollPane(this);
	public FenTexte(){
		
	    this.setPreferredSize(new Dimension(400, 300));
	    this.setEditable(true);
	    this.setBackground(Color.WHITE);
	    Font police = new Font("Georgia Normal", Font.ITALIC, 16);
		this.setFont(police);
		this.setForeground(Color.BLACK);



	}
	
}

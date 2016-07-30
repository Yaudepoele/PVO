import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FenTexte extends JTextArea{

	public FenTexte(){
		Font police = new Font("Georgia Normal", Font.BOLD, 16);
		this.setPreferredSize(new Dimension(400, 300));
		this.setText("Entrez votre texte ici.");
		//this.setFont(f);
	}
	
}

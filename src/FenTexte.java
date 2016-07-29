import java.awt.Dimension;

import javax.swing.JTextField;

public class FenTexte extends JTextField{

	public FenTexte(){
		
		this.setPreferredSize(new Dimension(400, 300));
		this.setText("Entrez votre texte ici.");
	}
	
}

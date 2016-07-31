import java.awt.Color;

import javax.swing.JFormattedTextField;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class BoiteDeTexte extends JFormattedTextField {
	private short NombreDePoints = 0;
	
// objet boite de texte ajouté au jframe principal qui permettera de choisir le nombre de points (autre que le varia) 
	// que le pv comptera 
	public BoiteDeTexte (){
		this.setMinimumSize(getSize());
		this.setDocument(new JTextFieldLimit(2));
		this.setText("00");
		this.setForeground(Color.BLUE);
		this.setVisible(true);
		
	}
	
	public short get_Number()
	{
		return NombreDePoints;
	}
	
	
}
// Pour limiter le nombre de chiffres dans le JTextField à 99
class JTextFieldLimit extends PlainDocument {
	  private int limit;
	  JTextFieldLimit(int limit) {
	    super();
	    this.limit = limit;
	  }

	  JTextFieldLimit(int limit, boolean upper) {
	    super();
	    this.limit = limit;
	  }

	  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
	    if (str == null)
	      return;

	    if ((getLength() + str.length()) <= limit) {
	      super.insertString(offset, str, attr);
	    }
	  }
	}
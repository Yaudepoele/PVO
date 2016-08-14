import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class BoiteDeTexte extends JFormattedTextField implements ActionListener, KeyListener  {
	private int NombreDePoints = 0;
	
// objet boite de texte ajouté au jframe principal qui permettera de choisir le nombre de points (autre que le varia) 
	// que le pv comptera 
	public BoiteDeTexte (){
		
		this.setMinimumSize(new Dimension(2, 2));
		this.setDocument(new JTextFieldLimit(2));
		this.setText("00");
		this.setForeground(Color.BLUE);
		this.setBackground(Color.WHITE);
		this.setVisible(true);
		this.addActionListener(this);
		this.addKeyListener(this);
		
	}

	public void actionPerformed(ActionEvent e) 
	{
		
		 System.out.println("AVANT LE PARSEINT:  " + this.getText());
		 try 
		 {
			 if (NombreDePoints <= 99)
			 {
			 NombreDePoints = Integer.parseInt(this.getText()); 
			 }
			 else 
			 {
				 
			 }
		 }
		 catch (NumberFormatException ee) {
			 System.out.println("NumberFormatException!");
		      //Will Throw exception!
		      //do something! anything to handle the exception.
		}
		 
				 System.out.println(this.NombreDePoints);
				
				 
	 }
	public void arrowUp() 
	{

	 if (this.NombreDePoints == 99)
	 {
		 
	 }
	 else{
		 NombreDePoints ++;
	 }
	 }

	public void keyTyped(KeyEvent event) {
	    if (event.getKeyChar() == KeyEvent.VK_UP) {
	    	 if (NombreDePoints <= 98)
			 {
			 NombreDePoints ++; 
			 }
			 else 
			 {
				 
			 }
	      
	    }
	    if (event.getKeyChar() == KeyEvent.VK_DOWN) {
	        
	    }
	    }
	public int getNombreDePoints (){
		return NombreDePoints;
	}




// Pour limiter le nombre dans le JTextField à 99 (deux chiffres)
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



@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}








}

  
	

		
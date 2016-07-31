import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class BoiteACocher extends JCheckBox {
	private JLabel varia = new JLabel("Varia ");
	BoiteACocher (){
		
		this.varia.setFont(new Font("Georgia Normal", Font.PLAIN, 16));
		this.setSelected(true); // Boite à cocher sélectionnée par défaut
		
	}
	
	
	public JLabel get_label()
	{
		return varia;
		
		
	}
	
}

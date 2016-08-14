import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class BoiteACocher extends JCheckBox implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel varia = new JLabel("Varia ");
	private boolean estActivé = false;
	BoiteACocher (){
		
		this.varia.setFont(new Font("Georgia Normal", Font.PLAIN, 16));
		this.setSelected(true); // Boite à cocher sélectionnée par défaut
		estActivé = this.isSelected();
		this.addActionListener(this);
	}
	
	
	public JLabel get_label()
	{
		return varia;
		
	}
	public boolean isActivated(){
		return estActivé;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		estActivé = this.isSelected();
		System.out.println(estActivé);
		
	}
	
	
	
}

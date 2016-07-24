import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;

public class Fenetre1 extends JFrame {

	public Fenetre1(){
		
		this.setTitle("PVO");
		this.setSize(1100, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.isResizable();
	
		JPanel pan1 = new JPanel();
		pan1.setBackground(Color.WHITE);
		this.setContentPane(pan1);
			
		this.setVisible(true);

	}
}

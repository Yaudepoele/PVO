import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class ArbreDesPoints extends JTree{
	private String nom = "Procès verbal";
	private short points = 3;
	// Arbre décrivant le procès verbal présent
	
	ArbreDesPoints (){
		this.setBackground(Color.GRAY);
		
		
	}
	public void buildTree(){
		  //Création d'une racine
		 DefaultMutableTreeNode racine = new DefaultMutableTreeNode(nom);
		      
		  //Nous allons ajouter des branches et des feuilles à notre racine
		  for(int i = 0; i < points; i++){
		    DefaultMutableTreeNode rep = new DefaultMutableTreeNode("Point n°"+i);
		         
		    //On rajoute 4 branches
		   /* if(i < 4){   
		      DefaultMutableTreeNode rep2 = new DefaultMutableTreeNode("Fichier enfant");
		      rep.add(rep2);
		    } */
		    //On ajoute la feuille ou la branche à la racine
		    racine.add(rep);
		  }
		  
		}
	
	public void set_nom(String NOM){
		this.nom = NOM; 
	}
	public void set_nombredepoints(short nombredepoints){
		this.points = nombredepoints; 
	}
}

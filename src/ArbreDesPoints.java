import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class ArbreDesPoints extends JScrollPane {
	private JTree arbre;
	private int nombredepoints = 3;
	private OrdreDuJour odj = new OrdreDuJour();
	ArbreDesPoints() {
		this.setBounds(20, 20, 30, 40);
	}
	  public void buildTree( ){
		  odj.showOrdreDuJour();
	    //Création d'une racine
	    DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Ordre du jour");

	    //Nous allons ajouter des branches et des feuilles à notre racine
	    for(int i = 0; i != nombredepoints; i++){
	    	if (i==0){
	    		
	    	}
	      DefaultMutableTreeNode rep = new DefaultMutableTreeNode("Point "+i);

	      //S'il s'agit d'un nombre pair, on rajoute une branche
	      if(false){
	        //Et une branche en plus ! Une !
	        for(int j = 1; j < 5; j++){
	          DefaultMutableTreeNode rep2 = new DefaultMutableTreeNode("Contenu");
	          //Cette fois, on ajoute les feuilles
	          for(int k = 1; k < 5; k++)
	            rep2.add(new DefaultMutableTreeNode("Amendements" + k));
	          rep.add(rep2);
	          
	        }
	      }
	      //On ajoute la feuille ou la branche à la racine
	      racine.add(rep);
	    }
	     arbre = new JTree(racine);

	   
}
	  public JTree getArbre (){
	    	 
	    	 return this.arbre;
	     }
	
	  }	
 
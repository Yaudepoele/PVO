import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class ArbreDesPoints extends JScrollPane {
	private JTree arbre;
	public OrdreDuJour odj  = new OrdreDuJour();
	
	ArbreDesPoints() {
		this.setBounds(20, 20, 30, 40);
	}
	  public void buildTree(){
		
	    //Création d'une racine
	    DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Ordre du jour");

	    //Nous allons ajouter des branches et des feuilles à notre racine
	    int i=0;
	    System.out.println(odj.elementsNumber());
	    while (i < odj.elementsNumber()){
	    	
	    	
	    	DefaultMutableTreeNode rep = new DefaultMutableTreeNode("Point "+i);
	    	 i++;
	      //S'il s'agit d'un nombre pair, on rajoute une branche
	    	 
	        for(int j = 1; j < 5; j++){
	          DefaultMutableTreeNode rep2 = new DefaultMutableTreeNode("Contenu");
	          //Cette fois, on ajoute les feuilles
	          for(int k = 1; k < 5; k++)
	            rep2.add(new DefaultMutableTreeNode("Amendements" + k));
	          rep.add(rep2);
	         
	        
	      }
	      //On ajoute la feuille ou la branche à la racine
	        racine.add(rep);
	        
	     
	     
	    }
	    if(odj.isVariaEnable())	// Ajoute un point varia à l'arbre si cette option est activée
	    {
	    	DefaultMutableTreeNode var = new DefaultMutableTreeNode("Varia");
	    	 racine.add(var);
	    }
	     arbre = new JTree(racine);
	 
	   
}
	  //Renvoit l'arbre comme objet
	  public JTree getArbre (){
	    	 return this.arbre;
	     }
	
	  
	  
	  public void setVariaOff()
	  {
		odj.setVaria(false);
		
		
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  }	
 

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class OrdreDuJour {
	private int ouverture = 0;
	private Hashtable points;
	private Enumeration e;
	private Enumeration key;
	private boolean varia = true; 
	private int nombreelements;
	private ArrayList tableauODJ = new ArrayList(); //Tableau servant à organiser
	OrdreDuJour(){
		this.points = new Hashtable();
		this.addToOrdreDuJour(0.0 , "Ouverture");
		this.addToOrdreDuJour(0.1 , "Adoption du dernier procès verbal");
		this.addToOrdreDuJour(0.2 , "Animation et secrétariat");
		this.e = points.elements();
		this.key = this.points.keys();
		this.showOrdreDuJour();
		
		
	}
	
	public void addToOrdreDuJour (double point,String contenuDuPoint)
	{
		this.points.put(point, contenuDuPoint);
		nombreelements++;
		
	}
	public void RemoveFromOrdreDuJour (double point,String contenuDuPoint)
	{
		this.points.remove(point, contenuDuPoint);
		nombreelements--;
	}
	
	
	
	public void setVaria(boolean Varia)
	{
		this.varia= Varia;
		System.out.print("Varia est à " );
		System.out.println(varia);
	}
	public boolean isVariaEnable()
	{
		return this.varia;
	}
	public int elementsNumber(){
		return nombreelements;
	}
	
	
	public void showOrdreDuJour ()
	{
		nombreelements=0;
		while (this.e.hasMoreElements()){
			System.out.print(this.key.nextElement());
			System.out.print(" " );
			System.out.println (this.e.nextElement());
			this.nombreelements++;
			
	}
}
	}

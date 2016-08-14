
import java.util.Hashtable;

public class OrdreDuJour {
	int ouverture = 0;
	Hashtable points;
	
	boolean varia = true; 
	
	OrdreDuJour(){
		points = new Hashtable();
		points.put(0.0 , "Ouverture");
		points.put(0.1 , "Adoption du dernier procès verbal");
		points.put(0.2 , "Animation et secrétariat");
	}
	
	public void addToOrdreDuJour (double réfférence,String contenuDuPoint)
	{
		points.put(réfférence, contenuDuPoint);
		
	}
	public void RemoveOrdreDuJour (double réfférence,String contenuDuPoint)
	{
		points.remove(réfférence, contenuDuPoint);
	}
	
	public void setVaria(boolean Varia)
	{
		varia= Varia;
	}
	
	public void showOrdreDuJour ()
	{
		for (double i=0.0;  i< 2;i += 0.1){
			System.out.print(i);
			System.out.print(" ");
			System.out.println( points.get(i));
	}
}
	}

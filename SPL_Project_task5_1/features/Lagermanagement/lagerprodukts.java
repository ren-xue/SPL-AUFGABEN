import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
 * wir realiesiert einen sehr kleinen Lagermanagement.Diese Produkten koennen 
 * einfuegen,loeschen oder ausgeben.
 * Durch Map-Datenstruktur ist einfach, den Produkt nach ID zu suchen.
 */
public class lagerprodukts {
  
   HashMap <Integer,Produkt> produkts = new HashMap<Integer,Produkt>();//speicher Produkten
   
   Produkt tomato = new Produkt("Tomato",3);
   Produkt icecreme = new Produkt("Icecreme",1);
   Produkt cherry = new Produkt("Cherry",13);
   Produkt watermelon = new Produkt("Watermelon",4);
   Produkt peach = new Produkt("Peach",13);
   
   
   public void produkts() {
	  addprodukt(tomato);
	  addprodukt(icecreme);
	  addprodukt(cherry);
	  addprodukt(peach);
	  addprodukt(watermelon);	  
   }
   
   public void addprodukt(Produkt p) {//einfuegen
	   Integer neu_id = produkts.size()+ 1;
	   produkts.put(neu_id, p);
   }
   
   public void removeprodukt(Integer id) {//loeschen
	   produkts.remove(id);
	   
   }
   
   public void print_produkt() {//ausgeben
	   produkts();  
	   Iterator iterator = produkts.entrySet().iterator();
       while (iterator.hasNext()){
    	   Map.Entry<Integer,Produkt> entry = (Map.Entry) iterator.next();
           Integer key = (Integer)entry.getKey();
           Produkt value = (Produkt)entry.getValue(); 
           System.out.print(key+ ":");
           value.print_produkt();
           
       }   

   }
   
}
/*
 * Hier beschreiben wir einen Klasse Produkt
 * entharltet zwei Parameter:name oder preis
 */
public class Produkt {
  //  int id;
	String name;
    int preis;
   
   public Produkt(String name, int preis) {
	 //  this.id = id;
	   this.name = name;
	   this.preis = preis;
   }
 /*  
   public int getId() {
	   return id;
   }
   
   public void setId(int id) {
	   this.id = id;
   }
   */
   public String getName() {
	   return name;
   }
   
   public void setName(String name) {
	   this.name = name;
   }
   
   public float getPreis() {
	   return preis;
   }
   
   public void setPreis(int preis) {
	   this.preis = preis;
   }
 /*  
   public boolean equalsid(Object obj) {
	   Produkt produkt = (Produkt)obj;
	   return this.id == produkt.id;
   }
 */  
   /*
    * kann zum Suchen nach Name nutzt werden.
    */
		   
   public boolean equalsname(Object obj) {
	   Produkt produkt = (Produkt)obj;
	   return this.name == produkt.name;
   }
   
   public void print_produkt() {
	   System.out.println(name + " "+ preis);
   }
}
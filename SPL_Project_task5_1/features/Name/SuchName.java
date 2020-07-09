
public class SuchName implements Search {
  
  public String name; 
  
 @Override 
  public void Such() {
	  lager.produkts();
	 System.out.println("Please entry ein Name: ");
	 name = scanner.next();
	 for (Produkt p : produkts.values()) {
		if(name == p.getName()) {
			p.print_produkt();
	 } 
		 System.out.println("I have not found!");
   }
	 
  }
}
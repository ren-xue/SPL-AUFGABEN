
public class SuchId implements Search {
  
  public int id; 
  
 @Override 
  public void Such() {
	  lager.produkts();
	 System.out.println("Please entry ein ID: ");
	 id = (Integer)scanner.nextInt();//Nutzer eingeben
	 if(produkts.containsKey(id)) {  //prueft, ob id enthaetet.
		 produkts.get(id).print_produkt();
	 } else {
		 System.out.println("I have not found. ");
	 }
	 
	 
  }
}
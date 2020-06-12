
/*
 * Die Klasse implements die Methode des Interfaces 
 */
public class Expressversand implements Liefer_versand {
     static String adresse;
	@Override
	public void versand() {
		System.out.println("You choose Expressversand as delivery way!");
		System.out.println("Please give your address:");
		adresse = scanner.next();
		//falls ein Acount hat, speichert die Adresse im Acountdaten
		//#if Acount
		memory(adresse);
		//#endif	
	}

	@Override
	public void memory(String adresse) {
		System.out.println("Whether to store it as a common address in the account（Y/N)");
		boolean chooseoption = true;
		/*
		 * fragt,ob die aktuelle Adresse im Acountdaten speichern will.
		 * Y:Yes,dann wird eine Abbildung mit eingegebene Username und Adresse erzeugt
		 * N:No,dann wird nicht gespeichert.
		 */
        while(chooseoption) {
    	   String option = scanner.next();
    	   if("y".equalsIgnoreCase(option)){ 
    		   System.out.println("Please entry your usename");
    		   String username = scanner.next();
    		   user_ad.put(username, adresse);
    		   System.out.println(user_ad.get(username));
    		   System.out.println("We have stored.");   
    	    }else if("n".equalsIgnoreCase(option)){  
           	 System.out.println("We have not stored. ");
           	 chooseoption = false;
	       }else {
	    	  System.out.println("Invalid input，please choose again: ");
	          chooseoption = true;
	       }
	
        }
	}	

}

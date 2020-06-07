
/*
 * Die Klasse erbt die Klasse Expressversand
 */
public class Emails extends Expressversand {
	static String adresse;
	@Override
	public void versand() {
		System.out.println("You choose Emails as delivery way!");
		System.out.println("Please give your address:");
		adresse = scanner.next();
		//#if Acount
		memory(adresse); // die Methode ist vom Expressversand geerbt.
		//#endif	
				
	}
	
}

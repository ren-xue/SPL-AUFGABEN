import java.util.HashMap;
import java.util.Scanner;
/*
 * Interface des Lieferstyps
 */
public interface Liefer_versand {
	static Scanner scanner = new Scanner(System.in);
	static HashMap<String,String> user_ad = new HashMap<>();//speichern username und adresse
	//public String adresse = null;
	
    /*
     * Es wird in der Methode die Adresse eingeben,sodass Versand erfolgt
     */
     void versand();
     
     /*
      * Es wird in der Methode gefragt , ob Der Kunde die 
      * Adresse in Acount sperichern will.
      */
     void memory(String adresse);
}

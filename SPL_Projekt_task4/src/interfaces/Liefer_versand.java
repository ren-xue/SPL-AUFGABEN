package interfaces;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import loader.PluginLoader;
/*
 * Interface des Lieferstyps
 */
public interface Liefer_versand {
	static Scanner scanner = new Scanner(System.in);
	static HashMap<String,String> user_ad = new HashMap<>();//speichern username und adresse
	List<account> Account = PluginLoader.load(account.class);  //load Account interface
    /*
     * Es wird in der Methode die Adresse eingeben,sodass Versand erfolgt
     */
     void versand();
     
     /*
      * Es wird in der Methode gefragt , ob Der Kunde die 
      * Adresse in Acount sperichern will.
      */
     void memory(String adresse);
     
     boolean is_Liefer_versand();
}

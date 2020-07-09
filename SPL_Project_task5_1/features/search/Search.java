import java.util.HashMap;
import java.util.Scanner;
/*
 * Interface zum Suchen
 * Die Funktionen werden mit Lagermanagement zusammerarbeit
 * Dafuer haben wir eine Instanz von lagerprodukts erstellt
 * Durch Hashmap-Datenstruktur wird das Suchen einfacher.
 */
public interface Search {
	lagerprodukts lager = new lagerprodukts();
	  HashMap <Integer,Produkt> produkts = lager.produkts;//Produkten in den Lager
	  static Scanner scanner = new Scanner(System.in);  //Nutzer-Eingabe
	  public Produkt de_produkt = new Produkt(null,0);  //Standardwert
	  
	  public void Such();//suchen Funktion
	  
}
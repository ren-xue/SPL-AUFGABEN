
import java.util.List;

import interfaces.Choose;
import interfaces.Login;
import interfaces.Print;
import interfaces.account;
import interfaces.language;
import loader.PluginLoader;

public class Main {

	public static void main(String[] args) {
		
	List<Print> printlist = PluginLoader.load(Print.class);
	List<account> accountlist = PluginLoader.load(account.class);
	List<Choose> chooselist = PluginLoader.load(Choose.class);
	List<language> Language = PluginLoader.load(language.class);
	List<Login> loginlist = PluginLoader.load(Login.class);
	print(printlist,true);
	print_account(accountlist);
	choose(chooselist);
	language(Language);
	login(loginlist);
	
	
	}	
	
	/*
	 * Klasse, die Print Interface implemnetiert.
	 * und den Methoden print() aufruft
	 */
	private static  void print(List<Print> printlist, boolean is_start) {
		for (Print p : printlist) {
			if(p.is_print()) {
				p.print();
			}
		}
	
	}
	
	/*
	 * Klasse, die account Interface implemnetiert.
	 * und den Methoden print_account() aufruft
	 */
	private static  void print_account(List<account> accountlist) {
		for (account a : accountlist) {
			
				a.print_account();
		}
	
	}

	/*
	 * Klasse, die Choose Interface implemnetiert.
	 * und den Methoden choose() aufruft
	 * In jeder Klasse wird jeweils ein weriteres Interface aufgerufen.
	 */
	private static  void choose(List<Choose> chooselist) {
		for (Choose c : chooselist) {
			c.choose();
			
		}
	
	}
	
	/*
	 * Klasse, die Print language implemnetiert.
	 * und den Methoden settinglanguage() aufruft
	 */
	private static  void language(List<language> Language) {
		for (language l : Language) {
		   l.settingLanguage();
			
		}
	
	}
	
	/*
	 * Klasse, die Login Interface implemnetiert,
	 * und den Methoden choose() aufruft
	 * 
	 */
	private static  void login(List<Login> loginlist) {
		for (Login lo : loginlist) {
		   lo.choose();
			
		}
	
	}
	
	
	
}

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import interfaces.language;

/*
 * Provide the corresponding language according to the user's choice
 */

class Language implements language {
	@Override
	public void settingLanguage() {	
		String basename = "properties.properties";
		Scanner in = new Scanner(System.in);
		Locale us = Locale.US;  //three languages to choose
		Locale de = Locale.GERMANY; 
		Locale cn = Locale.CHINA;
		Locale lan = us;  //initial-language
		System.out.println("Please Choose one Language(US/DE/CN): ");
		String choose = in.next();		
		switch(choose) {
		case "DE":lan = de;break;
		case "US":lan = us;break;
		case "CN":lan = cn;break;
		default:
			System.out.println("We cann not support this language!");
		}		
		//Get the corresponding language vocabulary stored in the file
		ResourceBundle myResources = ResourceBundle.getBundle(basename,lan);
		String hello = myResources.getString("hello");
		String setting = myResources.getString("setting");
		System.out.println(hello + " " + setting );
		/*
		 * Here is a simple implementation, 
		 * using different languages to complete user registration.
		 * 
		String input = myResources.getString("input");
		String username = myResources.getString("username");
        String password = myResources.getString("password");
        
        System.out.println(input + " " + username + ": ");
        String userName = in.next();
        System.out.println(input + " " + password + ": ");
        String passWord = in.next();   
        Login login = new Login();
        Login.login(userName, passWord);
         
         */
	}

}
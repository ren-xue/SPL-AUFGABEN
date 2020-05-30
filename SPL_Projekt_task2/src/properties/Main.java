package properties;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		if(PropertyManager.getProperty("Acount")) {
			System.out.println("Acount");
			Acount accout = new Acount(); 
			
		}
		
		if(PropertyManager.getProperty("Kontakt")) {
			System.out.println("Kontakt");
		}
		
		if(PropertyManager.getProperty("Produktmanagement")) {
			System.out.println("Produktmanagement");
		}
		
						
		if(PropertyManager.getProperty("Scurity")) {
			System.out.println("Scurity");
		}
		
		if(PropertyManager.getProperty("Lieferstyp")) {
			System.out.println("Lieferstyp");
		}
		if(PropertyManager.getProperty("Liefermanagement")) {
			System.out.println("Liefermanagement");
		}
		
		if(PropertyManager.getProperty("Expressversand")) {
			System.out.println("Expressversand");
		}
		
   
		if(PropertyManager.getProperty("login")) {
			System.out.println("login");
			Login login = new Login();
			login.choose();
		}
		
		if(PropertyManager.getProperty("language")) {
			System.out.println("language");
			Language language = new Language();
			language.settinglanguage();
		}

	}

}


/*
 * I simply implemented two Features for simulation. 
 * Many large project links are recorded in Readme
 */

class Acount {
	
}
//User class
class User {
	String username;
	String password;
	
	public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
	
	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    

    public boolean equals(Object obj) {
        User user = (User)obj;
        return this.username == user.username;
    }
}



class Login {	
	
	static Collection<User> users = new ArrayList<User>();//Save all users
	boolean isLogin = false; 
	static Scanner scanner = new Scanner(System.in);
	/*
	 * According to the user's choice, 
	 * provide the corresponding function, register or log in
	 */
	void choose() {    
        System.out.println("Please select function A (Registration) B (Login)");
        boolean chooseoption = true;
        while(chooseoption) {
    	   String option = scanner.next();
         if("a".equalsIgnoreCase(option)){    //register
        	System.out.println("please input username ：");
        	String regusername = scanner.next();
            System.out.println("please input password:");
            String regpassword = scanner.next();
            chooseoption = false;
            reg(regusername,regpassword);

         }else if("b".equalsIgnoreCase(option)){  //login 
        	System.out.println("please input username ：");
        	String username = scanner.next();
            System.out.println("please input password:");
            String password = scanner.next();
            chooseoption = false;
            login(username,password);
         }else {
        	System.out.println("Invalid input，please choose again: ");
        	chooseoption = true;

          }
       }
        
    }
	

	/*
	 * Check the account and password entered by the user.
	 *  If the account and password already exist in the collection, 
	 *  the login is successful, otherwise the login fails.
	 */
	void login(String username ,String password) {
    Iterator<User> it = users.iterator();  //check the Collection 
    while(it.hasNext()){
        User user = it.next();
        if(user.username ==username &&user.password.equals(password)){     
            isLogin = true;
        }
    }
    
	if(isLogin==true){
        System.out.println("Welcome...");
    }else{
        System.out.println("User name or password is wrong, login failed...");
    }
	return;
 }
	
	/*
	 * Saved in the user collection 
	 * according to the user name and password registered by the user
	 */
	void reg(String username,String password) {
		 User u_sers = null;
		 u_sers = new User(username,null);  //Check if the username is already registered
			if(users.contains(username)){
				System.out.println("User exits");	
			}
			u_sers.setPassword(password);
			users.add(u_sers);  //add new user 
			System.out.println("registration success");
			System.out.println(users);
			return;		
	}
 
}

/*
 * Provide the corresponding language according to the user's choice
 */

class Language {
	void settinglanguage() {	
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




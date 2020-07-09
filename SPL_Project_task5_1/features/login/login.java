import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

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

public class Main {

	public static void main(String[] args) {
		
		//#if language
//@		Language language  = new Language();
//@		language.settinglanguage();
		//#endif
		
		 //#if Acount
		System.out.println("Account");
		 //#endif
		
		//#if Scurity
		System.out.println("Security");
		//#endif
		
		//#if login
		Login login = new Login();
	    login.choose();
		//#endif
		
		//#if Lieferstyp
		Lieferstyp lieferstyp = new Lieferstyp();
		lieferstyp.choose();
		//#endif
	}

}

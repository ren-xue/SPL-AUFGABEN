import java.util.Scanner;

public class Lieferstyp {
	
	void choose() {
		//#if Expressversand
//@		 Expressversand expressversand = new Expressversand();
//@		 expressversand.versand();
		 //#endif
		 
		//#if Emails
		Emails emails = new Emails();
		emails.versand();
		 //#endif
		
		//#if Selbst
//@		Selbst selbst = new Selbst();
//@		selbst.versand();
		//#endif
		
	}
}

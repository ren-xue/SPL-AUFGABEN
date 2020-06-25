import interfaces.Kontakt_typ;

public class Email implements Kontakt_typ {

	@Override
	public void kontakt() {
	  System.out.println("Email : 123456@gmail.de");
		
	}

	@Override
	public boolean is_kontakt() {
		
		return true;
	}

}

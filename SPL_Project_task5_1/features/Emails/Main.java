
public class Main {
	private Emails emails;

	Main() {
		emails = new Emails();
	}

	public void print() {
		original();
		emails.versand();
	}
}

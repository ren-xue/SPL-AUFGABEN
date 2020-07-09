public class Main {
	private Login login;

	Main() {
		login = new Login();
	}

	public void print() {
		original();
		login.choose();
	}
}

public class Main {
	private Telefon telefon;

	Main() {
		telefon = new Telefon();
	}

	public void print() {
		original();
		telefon.kontakt();
	}
}

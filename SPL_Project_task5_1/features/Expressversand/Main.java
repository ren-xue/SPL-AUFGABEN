public class Main {
	private Expressversand expressversand ;

	Main() {
		expressversand = new Expressversand();
	}

	public void print() {
		original();
		expressversand.versand();
	}
}


class Main {
	private Selbst selbst;

	Main() {
		selbst = new Selbst();
	}

	void print() {
		original();
		selbst.versand();
	}
}

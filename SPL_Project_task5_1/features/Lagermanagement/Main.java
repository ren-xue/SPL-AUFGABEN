
public class Main {
	private lagerprodukts lagerprodukt;

	Main() {
		lagerprodukt = new lagerprodukts();
	}

	public void print() {
		original();
		lagerprodukt.print_produkt();
	}
}

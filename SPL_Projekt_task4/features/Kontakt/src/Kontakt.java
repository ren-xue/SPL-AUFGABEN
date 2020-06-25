import java.util.List;
import interfaces.Choose;
import interfaces.Kontakt_typ;
import loader.PluginLoader;

public class Kontakt implements Choose {
	

List<Kontakt_typ> kontaktlist = PluginLoader.load(Kontakt_typ.class);	
	
	public void choose() {
		for (Kontakt_typ k : kontaktlist) {
			if (k.is_kontakt()) {
			k.kontakt();
			}
		}
	
	
	}

}

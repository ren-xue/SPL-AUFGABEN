import java.util.List;
import interfaces.Liefer_versand;
import interfaces.Choose;
import loader.PluginLoader;

public class Lieferstyp implements Choose {
	List<Liefer_versand> versandlist = PluginLoader.load(Liefer_versand.class);	
	
	public void choose() {
		for (Liefer_versand v : versandlist) {
			if (v.is_Liefer_versand()) {
				v.versand();
			}
		}
	}
}

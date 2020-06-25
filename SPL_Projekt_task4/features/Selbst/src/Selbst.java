import interfaces.Liefer_versand;

public class Selbst implements Liefer_versand {
	@Override
	public void versand() {
		 System.out.println("You choose Selbst as delivery Way!");
    	 System.out.println("Our opentime  MO-FR : 08-17 Clock");
	}

	@Override
	public void memory(String adresse) {

		
	}

	@Override
	public boolean is_Liefer_versand() {
		
		return true;
	}
}

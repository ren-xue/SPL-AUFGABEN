
public class Main {
	 String Scurity;
	 
	    Main() {  Scurity = "Scurity"; }
	 
	   public void print() { 
	       System.out.println( Scurity ); 
	    }
	 
	    /*****************/
	  
	    static Main me;
	 
	    public static void main( String[] args ) {
	      me = new Main();
	      me.print();
	    }
 
}
package tema7;
import java.util.*;
public class Punto {
	
	private double posx;
	private double posy;
	    Scanner e=new Scanner(System.in);
	    public Punto(){

	    }
	    public Punto(int x, int y){
	        posx=x;
	        posy=y;
	    }
	    public void constrCopia(Punto uno) {
	    	posx=uno.getPosx();
	    	posy=uno.getPosy();
	    }
		public double getPosx() {
			return posx;
		}
		public void setPosx(double posx) {
			this.posx = posx;
		}
		public double getPosy() {
			return posy;
		}
		public void setPosy(double posy) {
			this.posy = posy;
		}

	
}

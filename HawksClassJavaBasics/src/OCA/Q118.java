package OCA;

public class Q118 {
//public static void main(String[] args) {
	

	public static int stVar = 100;
	public int var  = 200;
	public String toString() {
		return stVar + ":" +var;
		
	}
	public static void main(String[] args) {
		Q118 t1 = new Q118();
		t1.var = 300;
		System.out.println(t1 );
		
		Q118 t2 = new Q118();
		t2.stVar = 300;
		System.out.println(t2);
		
		
	}
}
    

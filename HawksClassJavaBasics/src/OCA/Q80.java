package OCA;

public class Q80 {

	public static void main(String[] args) {
	    try {
	        int num = 10;
	        int div = 0;
	        int ans = num / div;
	    } catch (ArithmeticException ae) {   // line n1
	      //  ans = 0;
	    } catch (Exception e) {
	        System.out.println("Invalid calculation");
	    }
	    //System.out.println("Answer = " + ans);  // line n2
	}
}

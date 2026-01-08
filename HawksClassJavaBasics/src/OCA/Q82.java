package OCA;

public class Q82 {

	
	    private char var;
	    public static void main(String[] args) {
	        char var1 = 'a';
	        char var2 = var1;
	        var2 = 'e';

	        Q82 obj1 = new Q82();
	        Q82 obj2 = obj1;
	        obj1.var = 'o';
	        obj2.var = 'i';

	        System.out.println(var1 + "," + var2);
	        System.out.print(obj1.var + "," + obj2.var);
	    }
	}

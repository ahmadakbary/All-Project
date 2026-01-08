package OCA;
//class Q27  {
	
class Q27 {
	    public Q27() {
	        System.out.print("A ");
	    }
	}

	class B extends Q27 {
	    public B() {
	        System.out.print("B ");   // line n1
	    }
	}

	class C extends B {
	    public C() {
	        System.out.print("C ");   // line n2
	    }

	    public static void main(String[] args) {
	        C c = new C();
	    }
	}

package AccessModifiers;
public class PublicModier {
public static void main(String[] args) {
		
	PublicAccessModifier();
	
}
public static void PublicAccessModifier() {
	System.out.println("this is public modifier");
	String [] data = new String [10];
	
	data[3] = "Ahmad";
	data[1] = "ak";
	data[2] = "tom";
	data[3] = "jery";
	data[5] = "tomy";
	data[3] = "soma";
	data[4] = "jjklk";
	
	
	for (int i = 0; i<data.length; i++) {
		System.out.println(i);
	}
	
	for (String k: data) {
		System.out.println(k);
	}

	}

}

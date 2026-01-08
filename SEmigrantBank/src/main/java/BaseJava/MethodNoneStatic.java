package BaseJava;

import java.util.ArrayList;
public class MethodNoneStatic {
public static void main(String[] args) {
MethodNoneStatic obj = new MethodNoneStatic();
obj.Array();	
		
	}
	public void Array() {
	ArrayList<Object> data = new ArrayList <Object>();
		 data.add("Ahmad");
		 data.add("ahmad");
		 data.add("jalal");
		 data.add("Omar");
		 data.add("jj");
		 data.add("leah jan");
		 data.add("asma jan");
		 data.add("Jamal jon");
	for (Object i: data) {
		System.out.println(i+ " ");
		 }
	}
	
	
	
}

package AbstractClass;

public class Loins extends  Abstract{
public static void main(String[]args) {
	
	Loins ob=new Loins ();
	ob.addition();	
}
@Override
public void addition() {
		int a=60;
		int r=6;
		int t=a+r;
		System.out.println(t);
	}
}
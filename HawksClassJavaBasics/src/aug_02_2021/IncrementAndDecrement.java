package aug_02_2021;
public class IncrementAndDecrement {
public static void main(String[] args) {	
	int x = 1;
	System.out.println(x);
	System.out.println(x +1);
	
	int y = 1;
	System.out.println(y+1);
	System.out.println("here"+y);
	
	int NumberOfMyPhones = 1;
	int NumberOfYourPhones =1;
	System.out.println(NumberOfMyPhones+NumberOfYourPhones);
	
	int z = 6;
	++z;
	--z;
	System.out.println(z);
	++z;
	--z;
	System.out.println("here: "+z);
System.out.println("-------------------------");
	int w = 2;
	System.out.println(w +1);
	w = w +1;
	System.out.println(++w);
	System.out.println("here w "+w);	
System.out.println("***********************");
	int j = 10;
	System.out.println("J at start is "+j);
	System.out.println("J pre increment "+ ++j);
	System.out.println("J is Post increment "+ j++);
	System.out.println("J at the end is "+j);

System.out.println("***********************");
	int t = 18;
	System.out.println(t++ + --t + t);
}
}
















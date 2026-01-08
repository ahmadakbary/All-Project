package aug_11_2021;
public class DoWileLoop {
public static void main(String[] args) {
	
	int x =0;
System.out.println("while loop");
	while(x>0) {
	System.out.println(x--);
	}

System.out.println("Do while loop");
	do {
	System.out.println(x++);
	if (x>50) {
		break;
		}
	} while (x>0);
		
	}
	}


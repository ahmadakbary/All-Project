package Day10;
public class EXCEPTIONSONLY {
public static void main(String[] args) {
	
System.out.println("program is started..");
System.out.println("progrm is in progress..");
int num=0;
String s="abc";
try {	
//System.out.println(100/num);
num=Integer.parseInt(s);
	}
catch(Exception e){
System.out.println("Exception handled.");
		}
System.out.println("program is completed....");
System.out.println("program is exited ..");
		}

	}



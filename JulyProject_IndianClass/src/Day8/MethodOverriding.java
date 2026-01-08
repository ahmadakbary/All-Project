package Day8;

class Bank{
	double rateOfInterest() {
	return 0;		
	}
	}
class SBI extends Bank{
	double rateOfIntrest() {
	return 10.5;	
}
}
class ICICI extends Bank{
	double rateOfIntrest() {
	return 11.5;		
	}
	}
public class MethodOverriding {
public static void main(String[] args) {
	
SBI sbi=new SBI();
System.out.println(sbi.rateOfIntrest());
	
ICICI icici=new ICICI();
System.out.println(icici.rateOfIntrest());
		
	}

}

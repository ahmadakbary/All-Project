package OCA;

public class Q19 {

	void readCard (int cardNo) throws Exception{
		System.out.println("Read Card");
		
	}
	void checkCard(int carNo) throws RuntimeException {
		System.out.println("Checking Card");
		
	}
	public static void main (String [] args) {
		Q19 ex = new Q19();
		int cardNo = 12344;
		ex.checkCard(cardNo);
		ex.checkCard(cardNo);

		

	}

}

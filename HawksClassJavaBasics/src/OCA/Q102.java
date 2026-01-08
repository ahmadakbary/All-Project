package OCA;

public class Q102 {
    static int count = 0;
    int i = 0;

    public void changeCount() {
        while (i < 5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
    	Q102 check1 = new Q102();
    	Q102 check2 = new Q102();

        check1.changeCount();
        check2.changeCount();

        System.out.print(check1.count + " : " + check2.count);
    }
}
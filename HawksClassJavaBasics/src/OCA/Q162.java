package OCA;

interface Q162 {
    public void displayI();
}

abstract class C2 implements Q162 {
    public void displayC2() {
        System.out.print("C2");
    }
}

class C1 extends C2 {
    public void displayI() {
        System.out.print("C1");
    }
}
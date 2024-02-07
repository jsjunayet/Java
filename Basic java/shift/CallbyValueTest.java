package shift;

public class CallbyValueTest {
    public static void main(String[] args) {
        CallbyValue r1 = new CallbyValue();
        int x = 10;
        System.out.println("before " + x);
        r1.change(x);
        System.out.println("after " + x);
    }
}

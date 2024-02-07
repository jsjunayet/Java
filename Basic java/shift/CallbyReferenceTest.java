package shift;

public class CallbyReferenceTest {
    public static void main(String[] args) {
        CallbyReference r1 = new CallbyReference();
        r1.name = "anis";
        System.out.println("Before calling " + r1.name);
        r1.change(r1);
        System.out.println("After calling " + r1.name);

    }
}

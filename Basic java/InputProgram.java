public class InputProgram {
    static int a = 12;

    InputProgram() {
        a++;
        int result = a;
        System.out.println(a);
        System.out.println(result);
    }

    public static void main(String[] args) {
        InputProgram obj1 = new InputProgram();
        InputProgram obj2 = new InputProgram();
        InputProgram obj3 = new InputProgram();
        InputProgram obj4 = new InputProgram();
        Variable obj = new Variable();
        System.out.println("result : " + (obj.a + obj.b));
    }
}
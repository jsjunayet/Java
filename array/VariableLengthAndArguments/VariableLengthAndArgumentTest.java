package VariableLengthAndArguments;

public class VariableLengthAndArgumentTest {
    public static void main(String[] args) {
        VariableLengthAndArgument Obj = new VariableLengthAndArgument();
        Obj.add(10, 20, 30, 40);
        Obj.add(10, 20, 30, 40, 30, 40, 50);
        Obj.add(10, 20, 30, 40, 30, 40, 50, 70, 50, 394, 44, 489, 596);
        Obj.add(10, 20, 30, 40, 30, 40, 50, 70, 50, 394, 44, 489, 596, 2000);
    }
}

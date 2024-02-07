package Lab2;

public class ConstructorTest {
    public static void main(String[] args) {
        // Constructor Cazy = new Constructor();
        Constructor Cazy1 = new Constructor(10, "junayet");
        Constructor Cazy2 = new Constructor("Junayet Shiblu", 20);
        // Copy Constructor value start
        Constructor Cazy3 = new Constructor();
        Cazy3.name = Cazy2.name;
        Cazy3.y = Cazy2.y;
        // Copy Constructor value end
        Constructor Cazy4 = new Constructor(Cazy3);

        Cazy1.ShowValue();
        Cazy2.ShowValue();
        Cazy3.ShowValue();
        Cazy4.ShowValue();
    }
}

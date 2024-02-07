package Lab2;

public class Constructor {
    int x;
    int y;
    String name;

    // DefaultContractor
    Constructor() {
        System.err.println("hello world");

    }
    // Paramiterize Constructor

    Constructor(int p, String names) {
        y = p;
        name = names;
    }
    // OverLoading Constructor

    Constructor(String names, int p) {
        name = names;
        y = p;
    }

    // Copy Constructor
    Constructor(Constructor j) {
        name = j.name;
        y = j.y;
    }

    void ShowValue() {
        System.err.println("y = " + y);
        System.err.println("Name = " + name);
    }
}

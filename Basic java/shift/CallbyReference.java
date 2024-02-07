package shift;

public class CallbyReference {
    String name;

    void change(CallbyReference r) {
        r.name = "jubayet";
    }
}

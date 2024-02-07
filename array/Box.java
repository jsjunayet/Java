public class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}

class Box4 {
    public static void main(String[] args) {
        Box modelBox1 = new Box();
        Box modelBox2 = new Box();
        double vol;
        modelBox1.height = 10;
        modelBox1.width = 10;
        modelBox1.depth = 20;
        vol = modelBox1.volume();
        System.out.println("print1 " + vol);
        modelBox2.width = 30;
        modelBox2.height = 40;
        modelBox2.depth = 50;
        vol = modelBox2.volume();
        System.out.println(" printt2 " + vol);

    }

}

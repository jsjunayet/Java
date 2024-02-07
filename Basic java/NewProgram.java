public class NewProgram {

    public static void main(String[] args) {
        class Teacher {
            void Read(String x, String y, int z) {
                String name = x;
                String gender = y;
                int id = z;
                System.out.println(" " + name);
                System.out.println(" " + gender);
                System.out.println(" " + id);
            }
        }
        Teacher teacher1 = new Teacher();
        teacher1.Read("junayet", "gender", 10);

        Teacher teacher2 = new Teacher();
        teacher2.Read("jubayet", "gender", 20);

    }

}
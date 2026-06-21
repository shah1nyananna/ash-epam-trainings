public class Lesson1 {

    public static void main(String[] args) {
        char x = '*';
        for (int i = 0; i < 5; i++) {
            for (int y = 0; y <= i; y++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
package lesson1;

public class Lesson1 {

    public static void main(String[] args) {
        char o = '*';
        for (int p = 0; p <= 5; p++) {
            for (int k = 5; k >= p; k--) {
                System.out.print(o);
            }
            System.out.println();
        }
        System.out.println("++++++");
        for (int t = 0; t < 5; t++) {
            for (int s = 0; s < 4 - t; s++) {
                System.out.print(" ");
            }
            for (int d = 0; d <= 2 * t; d++) {
                System.out.print(o);
            }
            System.out.println();
        }
    }
}






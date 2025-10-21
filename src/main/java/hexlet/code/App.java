package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a = 10;
        int b = 2;
        int c = 0;
        while (c < a) {
            c = b++;
            System.out.println(c);
        }
    }
}

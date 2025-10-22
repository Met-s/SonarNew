package hexlet.code;

import java.util.logging.Logger;


public class App {

    static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        String first = "Hello";
        String second = "World";
        String result = first + ", " + second + "?*";

        logger.info(result);

        int a = 10;
        int b = 0;
        while (b < a) {
            b++;
            int c = a + b;
            System.out.println(c);

        }



    }
}

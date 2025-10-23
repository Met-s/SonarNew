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

        String st = "Hello World";
        logger.info(st);
        var rs = st.charAt(3);
        logger.info(String.valueOf(rs));

        var length = st.length();
        logger.info(String.valueOf(length));





    }
}

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String s = "привет,мир,как дела?";
        String[] s1 = s.split(",", 3);
        for (String str : s1) {
            System.out.println(str);
        }

        System.out.println("*********************************************");

        Stream<String> stream = Arrays.stream(s.split(",",3));
        stream.forEachOrdered(System.out::println)ж
    }


}
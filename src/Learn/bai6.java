package Learn;

import java.util.Arrays;

public class bai6 {
    public static void main(String[] args) {
        String[] array = new String[]{"z","g","t","c","a"};
        //sd map de in hoa
        Arrays.stream(array).map(String::toUpperCase).forEach(System.out::println);
    }
}

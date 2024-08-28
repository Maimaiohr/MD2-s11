package Learn;

import java.util.Arrays;

public class bai4 {
    public static void main(String[] args) {
        String[] array = new String[]{"z","g","t","c","a"};
        //sap xep
        Arrays.stream(array).sorted().forEach(System.out::println);
    }
}

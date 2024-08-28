package Learn;

import java.util.Arrays;

public class bai5 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        //loc
        Arrays.stream(array).forEach(System.out::println);
    }
}

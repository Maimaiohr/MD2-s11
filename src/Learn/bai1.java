package Learn;

import java.util.Arrays;

public class bai1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};

        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("so lon nhat la"+max);
    }
}

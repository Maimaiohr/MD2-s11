package Learn;

import java.util.Arrays;

public class bai3 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        //tinh tong
        double sum = Arrays.stream(array).reduce(0, (a,b) -> a+b);
        System.out.println(sum);
    }
}

package Learn;

import java.util.Arrays;

public class bai2 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        //tim so chia het cho 2
        Arrays.stream(array).filter(x -> x % 2 == 0).sorted().forEach(x -> System.out.print(x + " "));

    }
}

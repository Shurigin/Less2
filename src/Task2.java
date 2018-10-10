import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr2 = new int[8];
        int step = 0;

        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = step;
            step = step + 3;
        }
        System.out.println(Arrays.toString(arr2));
    }
}

import java.util.Arrays;

public class Task3 {


    public static void main(String[] args) {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9 ,1};

        for(int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6 ) {
                arr3[i] = arr3[i] * 6;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}

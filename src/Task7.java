import java.util.Arrays;
import static java.lang.Math.*;

public class Task7 {
    public static void main(String[] args) {
        int n = 3;

        shiftArr(n);
    }
    public static void shiftArr(int shift) {
        int[] arr7 = {10, 4, 35, 21, 18, 18, 5, 13, 52, 78};
        int temp = 0;

        if (shift < arr7.length){                           //в случае положительного n сдвигаем элементы массива влево. т.к. чем заполнять места с которых были сдвинуты элементы в задании не оговорено заполняю их нулями
            for(int i = 0; i < shift; i++) {
                for(int j = 0; j < arr7.length-1; j++) {
                    temp = arr7[j+1];
                    arr7[j] = temp;
                    arr7[j+1] = 0;
                    //System.out.println (arr7[j]);


                }

            }

        }
        if (shift < 0 && abs(shift) < arr7.length ){        //в случае отрицательного n сдивигаю элементы вправо
            for(int i = 0; i < abs(shift); i++) {
                for(int j = arr7.length-1; j > 0; j--) {
                    temp = arr7[j-1];
                    arr7[j] = temp;
                    arr7[j-1] = 0;
                    System.out.println (arr7[j]);
                }
            }
        }
        System.out.println(Arrays.toString(arr7));
    }
}

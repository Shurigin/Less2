import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1,1,0,0,1,0,1,1,0,0};

        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 1) {
                arr1[i] = 0;
            }
            else {
                arr1[i] = 1;
            }

           System.out.print(arr1[i]+ ", ");     //выводит из цикла при каждой итерации
        }
        System.out.println(Arrays.toString(arr1)); //выводит при помощи стандартной конструкции
        System.out.print(arr1.length);             //Тестовый вывод
    }
}

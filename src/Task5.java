public class Task5 {
    public static void main(String[] args) {
        int[] arr5 = {11, 2, 32, 7, 18, 19, 5, 13, 6};
        int big = 0;
        int small;

        for(int i = 0; i < arr5.length; i++) {
            if( arr5[i] > big) {
                big = arr5[i];
            }

        }
        small = big; //Начинаем отталкиваться от самого большого элемента массива чтобы избежать казуса когда small изначально равен нулю и дальше дело не идет

        for(int i = 0; i < arr5.length; i++){
            if(arr5[i] < small) {
                small = arr5[i];

            }
        }
        System.out.println("наибольшее число массива равно: " + big);
        System.out.println("наименьшее число массива равно: " + small);
    }

}

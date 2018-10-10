public class Task6 {
    public static void main(String[] args) {
        int[] arr6 = {10, 4, 35, 21, 18, 18, 5, 13, 52};

        //compareArr(arr6);
        System.out.println(compareArr(arr6));
    }


    public static boolean compareArr(int[] arr) {
    //public static void compareArr(int[] arr) {
        int leftSide = 0; //длина левой части массива
        int summLeft = 0; //сумма левой части
        int summRight = 0; //сумма правой части


            if (arr.length % 2 != 0) {                       //случай когда длинна массива нечетная
                leftSide = (arr.length / 2 + 1);
            } else {                                        //случай когда длина массива четная
                leftSide = arr.length / 2;
            }

            for (int i = 0; i < leftSide; i++) {            //сканируем левую часть массива с начала до половины
                summLeft = summLeft + arr[i];
            }

            for (int i = arr.length - 1; i > arr.length - leftSide; i--) { //сканируем правую часть массива с конца до половины

                //System.out.println(i);

                summRight = summRight + arr[i];
            }
            return summLeft == summRight;
            //System.out.println("Сумма левочасти массива: " + summLeft);
            //System.out.println("Сумма правой части массива: " + summRight);
        }


}
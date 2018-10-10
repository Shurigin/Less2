public class Task4 {
    public static void main(String[] args) {
        int length = 30; //Размерность массива
        int[][] arr4Table = new int[length][length]; //массив квадратный по этому высота и ширына одинаковые

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (length  - (j + 1) == i)) { //Условие левой части || условие правой части строки
                    arr4Table[i][j] = 1;
                }
             System.out.print(arr4Table[i][j]); //Выводим по строчно
            }
            System.out.println(); //переход на другую строку

        }

    }
}

//Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

public class Exercise4 {
    public static void main(String args[]) {
        int counter = 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == j) || (i == 4 - 1 - j))
                    table[i][j] = 1;
            }
        }
        printArr(table);
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

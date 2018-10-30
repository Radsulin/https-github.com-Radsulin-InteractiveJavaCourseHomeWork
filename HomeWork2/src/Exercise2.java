//Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
public class Exercise2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int j = 0;
        System.out.println(" ");

        for (int i = 0; i < arr.length; ++i, j = j + 3) {
            arr[i] = j;
            System.out.print(+arr[i] + " ");
        }
    }
}

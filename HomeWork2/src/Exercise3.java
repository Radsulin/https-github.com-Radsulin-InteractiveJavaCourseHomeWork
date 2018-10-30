//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
// пройти по нему циклом, и числа, меньшие 6, умножить на 2;
public class Exercise3 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
                                                            //*for (int i : arr) {
                                                            //    System.out.println(i);}
                                                            //  если захочу вывести первоначальные значения массива

        for (int i = 0; i < arr.length; i++){             //перебор массива
            if (arr[i]<6) arr[i] *=2;                     //условие
            System.out.println(arr[i] + " ");
        }
    }
}

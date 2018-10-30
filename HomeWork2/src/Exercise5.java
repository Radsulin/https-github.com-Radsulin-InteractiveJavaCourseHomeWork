//Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
public class Exercise5 {
    public static void main(String[] args) {
            int[]arr = {1,42,76,4,99,13,85};
            int max = arr[0];
            int min = arr[0];
            for (int i = 0; i!=arr.length; i++){
                if (arr[i]>max){
                    max = arr[i];
                }
            }
        System.out.println("min=" + min + " " + "max=" + max);
    }
}

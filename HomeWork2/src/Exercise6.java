//Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
// checkBalance ([2, 1, 1, 2, 1]) → false,
// checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят;
public class Exercise6 {
    public static void main(String[] args) {
        int[] chekBalance = { 1, 3, 5, 6 };       //задал массив
        System.out.println("Final result is "+canBalance(chekBalance));
    }

    public static boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {             //перебираю массив по i
            int sum = 0;                                     //сумма левых элементов минус сумма правых должна быть равна нулю
            for (int j = 0; j < i; j++) sum += nums[j];      //перебираю массив по j
            for (int j = i; j < nums.length; j++) sum -= nums[j];     //суть переборки: если i=0, значит сумма левых 1, а сумма правых -14
            if (sum == 0) return true;                                 //если i=1, значит сумма левых 4, правых 11 и т.д. пока не переберется весь массив
        }
        return false;
    }
}
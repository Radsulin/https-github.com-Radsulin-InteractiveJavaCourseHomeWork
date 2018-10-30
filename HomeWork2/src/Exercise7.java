//*Написать метод, которому на вход подается одномерный массив и число n (может быть положительным или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций. Нельзя пользоваться вспомогательными массивами.
public class Exercise7 {
    public static void main(String[] args)
    {
        int[] shiftThis = {4,2,6,7,11,25};

        printResults (leftShift(shiftThis, 2));
    }

    public static int[] leftShift(int[] argArr, int shiftBy)   //сдвиг влево //
    {
        int[] result = new int[argArr.length];
        int startFrom = 0;
        for(int  i = 0; i < argArr.length; ++i)
        {
            if(shiftBy + i < argArr.length)
            {
                result[i] = argArr[shiftBy + i];
            }
            else {
                result[i] = argArr[startFrom];
                ++startFrom;
            }
        }
        return result;
    }

    public static void printResults(int[] argArr)
    {
        for(int i = 0; i < argArr.length; ++i)
        {
            System.out.print(argArr[i] + " ");
        }
    }
}

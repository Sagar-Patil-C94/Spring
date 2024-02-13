package junit;

public class MyArrayOperation {
    public int sumArrayElements(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum = sum + number;
        }
        return sum;
    }
}

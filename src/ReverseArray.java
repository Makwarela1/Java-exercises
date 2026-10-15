import java.util.Arrays;
public class ReverseArray {

    void arrayReverse() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length/2; i ++){
            int reverseArray = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = reverseArray;

        }
        System.out.println("The reverse Array:" + Arrays.toString(numbers));
    }
}

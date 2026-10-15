import java.util.Arrays;
public class EvenOddArray {
    void searchIntegers (){
        int[] integers = {11, 26, 57, 32, 99, 80};
        int[] evenNumbers = new int [integers.length];
        int[] oddNumbers = new int [integers.length];

        int evenCount =0;
        int oddCount = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i]%2 == 0){
                evenNumbers[evenCount] = integers [i];
                evenCount ++;
            } else {
                oddNumbers[oddCount] = integers[i];
                oddCount ++;
            }
        }
        System.out.println("Even Array:" + " " + Arrays.toString(evenNumbers));
        System.out.println("Odd Array:" + " "+ Arrays.toString(oddNumbers));
    }
}

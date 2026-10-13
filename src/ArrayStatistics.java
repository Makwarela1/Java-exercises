import java.util.*;
public class ArrayStatistics {
    int [] numbers = {5, 89, 50, 12, 33, 6,};

    public int displayNumbers (){
        // find the min and max in the array
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("The of elements in the array:" + numbers.length);

       /* int count = 0;
        for ( int i = 0; i < numbers.length; i++){
            if (numbers[i] >= 50){
                count++;
            }
            System.out.println(count);
        } */

        return 0;

    }


}

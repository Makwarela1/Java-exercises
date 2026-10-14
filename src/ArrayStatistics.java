import java.util.*;
public class ArrayStatistics {
    int [] numbers = {5, 89, 79, 12, 33, 6,};

    void displayNumbers (){

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("The of elements in the array:" + numbers.length);

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] >= 50){
                System.out.println("This many numbers are greater than or equal to 50:"+ " " + numbers[i] );
            }
        }
    }


}

import java.util.Arrays;
public class ArraySearch {
     void SearchVaules() {
        int[] values = {75, 75, 21, 75, 3, 7};
        int target = 21;

        for (int i = 0; i < values.length; i++) {
            if ( values[i] == target){
                System.out.println("The index of the number is: " + i++);
                return;
            }
            }
         System.out.println("Value not found");
        }
    }


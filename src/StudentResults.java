import jdk.swing.interop.SwingInterOpUtils;
import java.util.Arrays;
public class StudentResults {
    String studentNumber;
    String studentName;
    int [] marks;

    StudentResults (String studentNumber, String studentName, int [] marks){
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.marks = marks;
    }
    int sum = 0;
    int average = 0;

    void average(){
        for (int i = 0; i < this.marks.length; i++){
            int mark = (int) this.marks[i];
            sum = sum + mark;
            average = sum / this.marks.length;
        }
        System.out.println("The average is:" + " "+ average );
    }

    void hasPassed(){
        int[] averages = new int [average];
       // for (int i = 0; i < averages.length; i++){
     //       if ( averages[i] >= 50){
                System.out.println("The students that passed are:" + " " + Arrays.toString(averages));
            }
        }
    }


    void displayResults(){
            System.out.println("Student name:" + " " +this.studentName);
            System.out.println("Student number:"+" "+ this.studentNumber);

        }




}

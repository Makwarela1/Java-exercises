import jdk.swing.interop.SwingInterOpUtils;
import java.util.Arrays;
public class StudentResults {
    String studentNumber;
    String studentName;
    int [] marks;
    int sum = 0;
    int average = 0;
    static int totalStudentsPassed = 0;
    static int highestAverage = 0;

    StudentResults (String studentNumber, String studentName, int [] marks){
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    void average() {
        for (int i = 0; i < this.marks.length; i++) {
            sum = sum + this.marks[i];
        }
        if (this.marks.length > 0) {
            average = sum/(this.marks.length);
            System.out.println("The average is:" + " " + average);
        }
    }

    void hasPassed(){
        if (this.average >= 50){
            totalStudentsPassed++;
        }
    }

    void theHighestAverage(){
        if (this.average > highestAverage){
            highestAverage = this.average;
        }
    }

     void displayInfo(){
            System.out.println("Student name:" + " " + this.studentName);
            System.out.println("Student number:"+" "+  this.studentNumber);
        }

     static void displayResults(){
         System.out.println("\n CLASS RESULTS SUMMARY:");
         System.out.println("The total number of students that passed:" + totalStudentsPassed);
         System.out.println("The highest average in the class:" + highestAverage);
     }





}

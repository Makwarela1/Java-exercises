public class StudentMarks {
    int[] marks = { 35, 78, 90, 50, 40};

   public double displayMarks (){
        double total = 0;
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
            total = total + marks[i];
        }

        double average =  total / marks.length;
       System.out.println("Total " + total);
       System.out.println("Average: " + average);
       return average;
    }
}


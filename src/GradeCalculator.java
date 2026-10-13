public class GradeCalculator {
    public double mark;

    public String MarkGrade(){
       if (mark > 80 && mark < 100){
           return "Distinction";
        } else if (mark > 70 && mark < 79){
            return "Merit";
        } else if (mark > 50 && mark < 69){
            return "Pass";
        } else if (mark > 0 && mark < 49) {
            return"Fail";
        } else {
           return "REJECTED";
        }
    }
}

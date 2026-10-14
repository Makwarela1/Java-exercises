public class Student {
    String name;
    double studentNumber;
    double mark;
    boolean hasPassed;

    Student(String name, double studentNumber, double mark, boolean hasPassed){
        this.name = name;
        this.mark = mark;
        this. studentNumber = studentNumber;
        this.hasPassed = hasPassed;
    }

    void displayDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Student Number: " + this.studentNumber);
        System.out.println("Mark: " + this.mark);

        if(this.mark >= 50){
            System.out.println(this.hasPassed);
        } else {
            System.out.println("FAILED");
        }
    }


}

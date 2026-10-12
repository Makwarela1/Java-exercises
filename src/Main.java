
    class StudentDetails {
        String studentName;
        int age;
        double averageMark;
        boolean isRegistered;
    }
    public class Main {
        public static void main(String[] args) {
            // declare and create the object
            StudentDetails student = new StudentDetails();
            //access the attributes and assign values
            student.studentName = "Naledi";
            student.age = 20;
            student.averageMark = 76.5;
            boolean isRegistered = true;
            //access the methods
            System.out.println("Student name: " + student.studentName);
            System.out.println("Age:" + student.age);
            System.out.println("Average mark: " + student.averageMark);
            System.out.println("Registered: " + student.isRegistered);
        }

    }


public class StudentDetails {
        String studentName;
        int age;
        /*double averageMark;
        boolean isRegistered;*/

       StudentDetails(String studentName, int age){
           this.studentName = studentName;
           this.age = age;
       }
        //method
        void displayDetails (){
            /*System.out.println("Student name: " + studentName);
            System.out.println("Age:" + age);
            System.out.println("Average mark: " + averageMark);
            System.out.println("Registered: " + isRegistered);*/
            System.out.println(this.studentName + "" + this.age);
        }
}


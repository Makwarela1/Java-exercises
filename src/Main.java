
   class StudentDetails {
        String studentName;
        int age;
        double averageMark;
        boolean isRegistered;
        //method
        void displayDetails (){
            System.out.println("Student name: " + studentName);
            System.out.println("Age:" + age);
            System.out.println("Average mark: " + averageMark);
            System.out.println("Registered: " + isRegistered);
        }

    }
    public class Main {
        public static void main(String[] args) {

            StudentDetails student = new StudentDetails();

            student.studentName = "Naledi";
            student.age = 20;
            student.averageMark = 76.5;
            boolean isRegistered = true;

            student.displayDetails();


            ShoppingTotal items = new ShoppingTotal();
            items.productName = "Chocoalte Bar";
            items.quantity = 4;
            items.unitPrice = 12.50;
            items.discount = 0.40;
            items.totalPrice();
            items.discountAmount();
            items.finalAmount();
            System.out.println("The total price before discount is: " + items.totalPrice());
            System.out.println("This much will be removed from the amount: " + items.discountAmount());
            System.out.println("The final amount to pay at the till is: " + items.finalAmount());
        }

    }


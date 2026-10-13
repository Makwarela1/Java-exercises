import jdk.swing.interop.SwingInterOpUtils;

public class Main {
        public static void main(String[] args) {
            // EXERCISE 1.1
            StudentDetails student = new StudentDetails();
            student.studentName = "Naledi";
            student.age = 20;
            student.averageMark = 76.5;
            boolean isRegistered = true;
            student.displayDetails();
            //EXERCISE 1.2
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

            // EXERCISE 1.3
            TemperatureConverter temp = new TemperatureConverter();
            temp.celsius = 35;
            System.out.println("The temperature in farenheit is: " + temp.fahrenheit());
            System.out.println("The temeperature in celcius is: " + temp.returnToCelcius());

            // EXERCISE 2.1
            PassOrFail response = new PassOrFail();
            response.mark = 50;
           response.MarkResponse();
        }

    }


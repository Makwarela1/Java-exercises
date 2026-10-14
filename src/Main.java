
public class Main {
        public static void main(String[] args) {
            // EXERCISE 1.1
            /*StudentDetails student = new StudentDetails();
            student.studentName = "Naledi";
            student.age = 20;
            student.averageMark = 76.5;
            boolean isRegistered = true;*/
            StudentDetails student = new StudentDetails("Makwa", 23);
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

           //EXERCISE 2.2
            GradeCalculator remark = new GradeCalculator();
            remark.mark = 85;
            System.out.println ("The remark to your grade is: " + remark.MarkGrade());

            // EXERCISE 2.3
            NumberAnalysis digit =  new NumberAnalysis();
            digit.number = -3;
            System.out.println("The number is: " + digit.PosOrNeg() + " and " + digit.EvenOrOddOrZero());

            // EXERCISE 2.4
            LoginCheck credentials = new LoginCheck();
            credentials.name = "Makwarela";
            credentials.pass = "Tattoo";
            System.out.println("Your credentials: " + credentials.login());

            //EXERCISE 3.1
            StudentMarks displayMarks = new StudentMarks();
            displayMarks.displayMarks();
            //EXERCISE 3.2
            ArrayStatistics minmax = new ArrayStatistics();
            minmax.displayNumbers();
            // EXERCISE 3.3
            ArraySearch arraySearch = new ArraySearch();
            arraySearch.SearchVaules();
            //EXERCISE 4.1
            Student student1 = new Student("Makwa", 402215635, 89.7, true);
            student1.displayDetails();
            Student student2 = new Student("Sophia",403218895, 49, true);
            student2.displayDetails();







            /*// CLASS EXAMPLE - 14/10
            Car car1 = new Car ("Red", "Toyota","Camry", 1920);
            Car car2 = new Car ("Blue", "Honda","Civic", 2000);
            Car car3 = new Car ("Red", "BMW","M3", 2020);
            //array for the car class
            Car[] cars = {car1, car2, car3};
            //for (int i = 0; i < cars.length; i ++){
              //  cars[i].display();
            //}

            // enchanced for loop
            for (Car car: cars){
                car.display();
            }
            */
        }
    }


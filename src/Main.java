import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //EXERCISE 1.1
        StudentDetails student = new StudentDetails();
        student.studentName = "Naledi";
        student.age = 20;
        student.averageMark = 76.5;
        boolean isRegistered = true;
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
        System.out.println("The remark to your grade is: " + remark.MarkGrade());

        // EXERCISE 2.3
        NumberAnalysis digit = new NumberAnalysis();
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
        System.out.println();
        //EXERCISE 3.2
        ArrayStatistics minmax = new ArrayStatistics();
        minmax.displayNumbers();
        System.out.println();
        // EXERCISE 3.3
        ArraySearch arraySearch = new ArraySearch();
        arraySearch.SearchVaules();
        System.out.println();
        // EXERCISE 3.4
        EvenOddArray evenOddArray = new EvenOddArray();
        evenOddArray.searchIntegers();
        System.out.println();
        //EXERCISE 3.5
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.arrayReverse();
        System.out.println();

        //EXERCISE 4.1
        Student student1 = new Student("Makwa", 402215635, 89.7, true);
        student1.displayDetails();
        Student student2 = new Student("Sophia", 403218895, 49, true);
        student2.displayDetails();
        System.out.println();
        // EXERCISE 4.2
        BankAccount backAccount = new BankAccount("Jane Doe", 1234567, 5000.00);
        backAccount.deposit(1000);
        backAccount.withdraw(56.9);
        backAccount.getBalance();
        System.out.println();
        //EXERCISE 4.3
        Product product = new Product();
        product.name = "Diary Milk";
        product.productID = 12445783;
        product.price = 12.95;
        product.stock = 79;
        product.quantity = 4;
        product.addStock();
        product.displayDetails();
        product.reduceStock();
        product.stockValue();
        System.out.println();
        // EXERCISE 4.4
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 45.7;
        rectangle1.length = 23;
        rectangle1.area();
        rectangle1.perimeter();
        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 2;
        rectangle2.length = 5;
        rectangle2.area();
        rectangle2.perimeter();
        System.out.println();

        //EXERCISE 5.1
        StudentResults students1 = new StudentResults("124567", "Sophie Smith", new int[]{56, 78, 90});
        StudentResults students2 = new StudentResults("567124", "Mariah Carey", new int[]{12, 34, 1});
        StudentResults students3 = new StudentResults("874489", "John Cena", new int[]{23, 89, 75});

        students1.displayInfo();
        students1.average();
        students1.hasPassed();
        students1.theHighestAverage();
        students1.displayInfo();

        System.out.println("---------------------------------------------");
        students2.displayInfo();
        students2.average();
        students2.hasPassed();
        students2.theHighestAverage();
        students2.displayInfo();

        System.out.println("---------------------------------------------");
        students3.displayInfo();
        students3.average();
        students3.hasPassed();
        students3.theHighestAverage();
        students3.displayInfo();

        System.out.println("---------------------------------------------");
        StudentResults.displayResults();

        // EXERCISE 5.2
        Shopping products[] = new Shopping[4];
        products[0] = new Shopping("Ice Cream", 5.50, 4);
        products[1] = new Shopping("Bread", 20.99, 2);
        products[2] = new Shopping("Milk", 13.99, 25);
        products[3] = new Shopping("Bed", 10000, 1);

        System.out.println("-----------------------------------------------");

        Shopping.subtotal(products);
        products[0].finalSubtotal();

        products[0].displayReceipt();
        products[1].displayReceipt();
        products[2].displayReceipt();
        products[3].displayReceipt();

        System.out.println();
        // EXERCISE 5.3
        Employee employee[] = new Employee[5];
        employee[0] = new Employee("Sarah Smith", "124567", 25000);
        employee[1] = new Employee("John Dorris", "456398", 20000);
        employee[2] = new Employee("Jane Doe", "567123", 10000);
        employee[3] = new Employee("John Doe", "985230", 5000);
        employee[4] = new Employee("Martha Derek", "876493", 50000);

        for (int i = 0; i < employee.length; i++){
            employee[i].displayDetails();
        }

        double highestSalary =  employee[0].monthlySalary;

        for (int i =0; i < employee.length; i++){
            if(employee[i].monthlySalary > highestSalary){
                highestSalary= employee[i].monthlySalary;
            }
        }
        System.out.println("Highest Salary: R" + highestSalary);

        double total = 0;
        double averageSalary = 0;
        for (int i = 0; i < employee.length;i++ ){
            total = total + employee[i].monthlySalary;
            averageSalary = total / employee.length;
        }

        System.out.println("Average Salary: R" + averageSalary);


        /*int[] numbers = {10, 20, 30};
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);*/

            /*
            ==EXERCISE 6.1==
            Explain why the following code may print `Different text`, then correct
            it to compare String contents.
            String first = new String("Java");
            String second = new String("Java");

            if (first == second) {
                System.out.println("Same text");
                    } else {
                 System.out.println("Different text");
              }
            The following code print different text because the operator '==' compares memory address, it is not checking if the actual
            content/value stored in those variables are actually equal. In this case you would have to use .equals()
            to compare the actual contents since they are string values"

            == Exercise 6.2==
            Explain the error and correct the loop condition.
            int[] numbers = {10, 20, 30};
                for (int i = 0; i <= numbers.length; i++) {
                    System.out.println(numbers[i]);
                }
            The error in this code is this section of the loop 'i <= numbers.length'. This part tells Java that as long as 'i'
            is less than or equal to length the numbers it must loop and display the index, however the equals to does not fit here.
            'i' displays the index of the array and by the time it reaches <= numbers.length the length has been reached.

             CORRECTED CODE:
             int[] numbers = {10, 20, 30};
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);
                }

            == Exercise 6.3==
            Rewrite the conditions so a mark of 85 displays `Distinction`.
            int mark = 85;

            if (mark >= 50) {
                System.out.println("Pass");
                } else if (mark >= 80) {
            System.out.println("Distinction");
            }

            CORRECTED CODE:
            int mark = 85;
            if (mark >= 80) {
            System.out.println("Distinction");
            } else if (mark > 0 && mark <= 50 ) {
            System.out.println("Pass");
            } else {
            System.out.println("Fail");
            }
             */

        }
    }



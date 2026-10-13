public class NumberAnalysis {
    double number;

    public String EvenOrOddOrZero() {
        if (number % 2 == 0) {
            return "EVEN";
        } else if (number % 2 != 0) {
            return "ODD";
        } else {
            return "Number is ZERO";
        }
    }
    public String PosOrNeg () {
        if (number >= 0) {
            return "Postive";
        } else {
            return "Negative";
        }
        }
    }

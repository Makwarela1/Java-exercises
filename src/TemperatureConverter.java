public class TemperatureConverter {
    double celsius;

    double fahrenheit(){
        return (celsius * 9/5) + 32;
    }

    double returnToCelcius(){
        return (fahrenheit() - 32)*5/9;
    }
}



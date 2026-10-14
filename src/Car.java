public class Car {
    String color;
    String brand;
    String model;
    int year;

    Car (String color, String brand, String model, int year){
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void display(){
        System.out.println("Color: " + " " +  this.color + "Brand: "+ " " + this.brand + "Model: " + " " + this.model + "Year:" + " " + this.year);
    }
}

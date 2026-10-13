public class ShoppingTotal {
    String productName;
    double unitPrice;
    int quantity;
    double discount;

    //method to calculate the total
    double totalPrice(){
        return quantity * unitPrice;
    }
    //method to calculate discount
    double discountAmount(){
        return totalPrice() * (discount);
    }
    //method to calcualte total discount price
    double finalAmount(){
        return totalPrice() - discountAmount();
    }

}
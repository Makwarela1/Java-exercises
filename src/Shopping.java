public class Shopping {
   String productName;
    double price;
    int quantity;
    static double subtotal =0;
    static double discountAmount=0;

    Shopping(String productName, double price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

    }

    double lineTotal (){
       return this.quantity * this.price;
    }

     static double subtotal(Shopping[] products){
        subtotal =0;
        for (int i = 0; i < products.length; i++){
            subtotal = subtotal + products[i].lineTotal();
        }
        return subtotal;
    }

    double finalSubtotal(){
        if (subtotal > 1000){
            discountAmount = subtotal * 0.10;
        } else {
            discountAmount =0;
        }
        return subtotal-discountAmount;
    }
    
   double displayReceipt(){
       System.out.println("-------------------------------------------------------------------------");
       System.out.println("Product:" + " "+ this.productName);
       System.out.println("Price: R"+ " "+this.price);
       System.out.println("Quantity:" + " "+ this.quantity);
       System.out.println("Line Total:" + " " + this.lineTotal());
       System.out.println("Subtotal: R" + " " + subtotal);
       System.out.println("Discount amount: R" + " " + discountAmount);
       System.out.println("Final amount: R" + " " + finalSubtotal());

       return 0;
    }
}

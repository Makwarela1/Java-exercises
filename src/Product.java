public class Product {
        int productID;
        String name;
        double price;
        int quantity;
        int stock;

        void displayDetails(){
            System.out.println("Product Name:" + " " + name);
            System.out.println("Product ID:" + " " + productID);
            System.out.println("Product Price:" + " " + price);
            System.out.println("Number of products bought:"+" "+quantity);

        }

        void addStock() {
            System.out.println("Stock amount:" + " " + stock);
        }

        void reduceStock(){
            if(quantity > stock) {
                System.out.println("There is not enough stock");
            } else {
                stock = stock - quantity;
                System.out.println("Remaining stock:" + " " + stock);
            }
        }

        void stockValue(){
            System.out.println("The stock value is:" + " " + (quantity*price));
        }

}

package JavaStaticAndFinal;
class Product {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            double total = price * quantity;
            double discountedTotal = total - (total * discount / 100);
            System.out.println("Total after " + discount + "% discount: " + discountedTotal);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Mobile", 31000, 1);
        Product p2 = new Product(2, "EarBuds", 5000, 1);
        p1.displayDetails();
        p2.displayDetails();
        Product.updateDiscount(10);
        p1.displayDetails();
    }
}
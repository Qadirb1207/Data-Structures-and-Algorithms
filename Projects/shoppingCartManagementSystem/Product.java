public class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;


    public Product(int pId, String name, double price, int qty){
        if(pId > 0 && !(name.isEmpty()) && price > 0.0 && qty > 0){
            this.productId = pId;
            this.productName = name;
            this.price = price;
            this.quantity = qty;
        }else{
            System.out.println("Invalid product with name: " + name);
        }
    }

    
    public void setQuantity(int qty){
        if(qty >= 0){
            this.quantity = qty;
        }else{
            System.out.println("Quantity cannot be negative!!!");
        }
    }

    // Getter for quantity
    public int getQuantity(){
        return this.quantity;
    }

    // Getter for price
    public double getPrice(){
        return this.price;
    }

    // Getter for Id
    public int getProductId(){
        return this.productId;
    }

    
    @Override
    public String toString(){
        return " ID: " + this.productId + "\n Name: " + this.productName + "\n Price: " + this.price + "\n Qty: " + this.quantity;
    }
}
public class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;


    Product(int pId, String name, double price, int qty){
        if(pId > 0 && !(name.isEmpty()) && price > 0.0 && qty > 0){
            this.productId = pId;
            this.productName = name;
            this.price = price;
            this.quantity = qty;
        }else{
            System.out.println("Invalid product with name: "+name);
        }
    }

    //setter for quantity
    public void setQuantity(int qty){
        if(qty > 0){
            this.quantity = qty;
        }else{
            System.out.println("Quantity cannot be negative!!!");
        }
    }

    //getter for quantity
    public int getQuantity(){
        return this.quantity;
    }

    //getter for price
    public double getPrice(){
        return this.price;
    }

    //getter for Id
    public int getProductId(){
        return this.productId;
    }
    public String toString(){
        String info = " ID: "+this.productId+"\n Name: "+this.productName+"\n Price: "+this.price+"\n Qty: "+this.quantity;
        return info;
    }


}

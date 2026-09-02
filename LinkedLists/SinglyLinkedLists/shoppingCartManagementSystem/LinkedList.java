public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    //method for adding product at beginning
    public void addProductFront(Product pr){
        Node node = new Node(pr);
        if(head != null){
            node.next = head;
            head = node;
        }else{
            head = node;
            tail = node;
        }
        ++size;
    }

    //method for adding product at the end
    public void addProductBack(Product pr){
        Node node = new Node(pr);
        if(tail != null){
            tail.next = node;
        }else{
            tail = node;
            head = node;
        }
        ++size;
    }

    //method for removing product
    public void removeProduct(int productId){
        Node node = head;
        int index = -1;
        while (node != null) {
            if(node.getProduct().getProductId() != productId){
                ++index;
            }else{
                break;
            }
            node = node.next;
        }

        if(index == -1){
            head = head.next;
            if(head == null){
                tail = null;
            }
            --size;
            return;
        }
        Node n = head;
        for(int i = 0; i < index; i++){
            n = n.next;
        }
        n.next = n.next.next;
        --size;
    }

    //method for searching a product
    public Product searchProduct(int pId){
        Node curr = head;
        while(curr != null){
            if(curr.getProduct().getProductId() == pId){
                return curr.getProduct();
            }
            curr = curr.next;
        }
        return null;
    }

    //method for updating quantity of a product
    public void updateQuantity(int productId, int quantity){
        if(quantity < 0){
            System.out.println("Invalid quantity! Quantity cannot be negative!!");
            return;
        }

        Node node = head;
        int index = 0;
        while (node != null) {
            if(node.getProduct().getProductId() != productId){
                ++index;
            }else{
                break;
            }
            node = node.next;
        }

        Node n = head;
        for(int i = 0; i < index; i++){
            n = n.next;
        }
        n.getProduct().setQuantity(quantity);
        System.out.println("Quantity updated!!!");
    }

    //method for calculating total price of all products
    public double calculateTotal(){
        double price = 0;
        Node n = head;
        while(n != null){
            price += n.getProduct().getPrice()*n.getProduct().getQuantity();
            n = n.next;
        }
        return price;
    }

   
    //method for displaying all products
    public void displayCart(){
        Node n = head;
        while(n != null){
            System.out.println(n.getProduct());
            n = n.next;
        }
    }

     //method for getting size
    public int size(){
        return this.size;
    }

    //method for clearing cart
    public void clearCart(){
        head = null;
        tail = null;
        this.size = 0;
    }

    //method for calculating total items in the cart
    public int calculateTotalItems(){
        Node n = head;
        int quantity = 0;
        while(n != null){
            quantity += n.getProduct().getQuantity();
            n = n.next;
        }
        return quantity;
    }

    //method for increasing quantity
    public void increaseQuantity(int pId, int amount){
        Node n = head;

        int index = 0;
        while (n != null) {
            if(n.getProduct().getProductId() != amount){
                ++index;
            }else{
                break;
            }
            n = n.next;
        }

        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        node.getProduct().setQuantity(node.getProduct().getQuantity()+amount);
    }

    //method for decreasing quantity
    public void descreaseQuantity(int pId, int amount){
        Node n = head;
        int index = 0;
        while(n != null){
            if(n.getProduct().getProductId() != pId){
                ++index;
            }else{
                break;
            }
            n = n.next;
        }

        Node node = head;
        for(int i = 0; i < index; ++i){
            node = node.next;
        }
        int newQuantity = node.getProduct().getQuantity() - amount;
        if(newQuantity < 0){
            System.out.println("Invalid amount! Cannot reduce "+amount+" number of products "+" as there are "+ node.getProduct().getQuantity()+" products in total");
            return;
        }else{
            node.getProduct().setQuantity(newQuantity);
        }

    }

    //method for finding the most expensive product
    public Product findMostExpensiveProduct(){
        Node node = head;
        Product expensiveProduct = node.getProduct();
        double price = node.getProduct().getPrice()*node.getProduct().getQuantity();

        while(node != null){
            if((node.getProduct().getPrice()*node.getProduct().getQuantity()) > price){
                expensiveProduct = node.getProduct();
            }
        }
        return expensiveProduct;
    }

    //method for calculating cost of a particular product 
    public double calculateProductCost(int productId){
        Product product = searchProduct(productId);
        return product.getPrice()*product.getQuantity();
    }

    //NODE CLASS
    private class Node{
        private Product product;
        private Node next;

        public Node(Product pr){
            this.product = pr;
            this.next = null;
        }

        public Product getProduct(){
            return this.product;
        }
    }
}

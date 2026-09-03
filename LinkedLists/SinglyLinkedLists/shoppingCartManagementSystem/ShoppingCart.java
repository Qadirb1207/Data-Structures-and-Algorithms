import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList myCart = new LinkedList();
        int choice = -1;
        do{
            System.out.println("~~~~~~ Welcome to Shopping Cart ~~~~~~\n");
            System.out.println("1. Add Product at Beginnig");
            System.out.println("2. Add Product at End");
            System.out.println("3. Remove Product");
            System.out.println("4. Search Product");
            System.out.println("5. Update Quantity");
            System.out.println("6. View Total Price of Cart");
            System.out.println("7. Display The Cart");
            System.out.println("8. View Size of the Cart");
            System.out.println("9. Clear the Cart");
            System.out.println("10. View Total Items in the Cart");
            System.out.println("11. Increase the Quantity of a Product");
            System.out.println("12. Decrease the Quantity of a Product");
            System.out.println("13. View Most Expensive Product");
            System.out.println("14. View Cost of a Product");
            System.out.println("-1. Exit");
            System.out.print("\n Enter Your Choice = ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the product id = ");
                    int id = sc.nextInt();
                    System.out.print("Enter the product name = ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter the price of the Product = ");
                    double price = sc.nextDouble();
                    System.out.print("Enter the quantity of the product = ");
                    int qty = sc.nextInt();

                    Product product = new Product(id, name, price, qty);
                    myCart.addProductFront(product);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.print("Enter the product id = ");
                    int pId = sc.nextInt();
                    System.out.print("Enter the product name = ");
                    sc.nextLine();
                    String pName = sc.nextLine();
                    System.out.print("Enter the price of the Product = ");
                    double pPrice = sc.nextDouble();
                    System.out.print("Enter the quantity of the product = ");
                    int pQty = sc.nextInt();

                    Product product2 = new Product(pId, pName, pPrice, pQty);
                    myCart.addProductBack(product2);
                    System.out.println("Product added successfully!");
                    break;
                
                case 3:
                    System.out.print("Enter the ID of the product you want to delete = ");
                    int deletingId = sc.nextInt();

                    myCart.removeProduct(deletingId);
                    break;
                case 4:
                    System.out.print("Enter the ID of the Product you want to search = ");
                    int searchingId = sc.nextInt();

                    Product pr = myCart.searchProduct(searchingId);
                    if(pr != null)
                        System.out.println(pr);
                    else
                        System.out.println("No such product exists in the cart");

                    break;

                case 5:
                    System.out.print("Enter the ID of the product whose quantity you want to update = ");
                    int updatingId = sc.nextInt();

                    System.out.print("Enter the updating quantity of the product = ");
                    int updatedQuantity = sc.nextInt();

                    myCart.updateQuantity(updatingId, updatedQuantity);
                    System.out.println("Quantity updated successfully!");
                    break;

                case 6:
                    System.out.println("Total Price of your cart is: "+myCart.calculateTotal());
                    break;

                case 7:
                    System.out.println("Your cart is:\n\n");
                    myCart.displayCart();
                    break;

                case 8:
                    System.out.println("The size of your Cart is: "+myCart.size());
                    break;

                case 9:
                    myCart.clearCart();
                    System.out.println("Cart Cleared Successfully!!");
                    break;

                case 10:
                    System.out.println("Total Items in your cart are: "+myCart.calculateTotalItems());
                    break;

                case 11:
                    System.out.print("Enter the ID of the product whose quantity you want to increase = ");
                    int increasingId = sc.nextInt();
                    System.out.print("Enter the increasing quantity of the product = ");
                    int amt = sc.nextInt();

                    myCart.increaseQuantity(increasingId, amt);
                    break;

                case 12:
                    System.out.print("Enter the ID of the product whose quantity you want to increase = ");
                    int decreasingId = sc.nextInt();
                    System.out.print("Enter the increasing quantity of the product = ");
                    int decreasingAmt = sc.nextInt();

                    myCart.decreaseQuantity(decreasingId, decreasingAmt);
                    break;

                case 13:
                    System.out.println("The most expensive product in your cart is: \n"+myCart.findMostExpensiveProduct());
                    break;

                case 14:
                    System.out.print("Enter the id of the product whose price you want to view = ");
                    int priceId = sc.nextInt();

                    System.out.println("The price of the product with ID "+priceId+" is: "+myCart.calculateProductCost(priceId));

                    break;
            }
            
        }while(choice != -1);

        System.out.println("Thanks for Using Our Services!!!!!");
        sc.close();
    }
}

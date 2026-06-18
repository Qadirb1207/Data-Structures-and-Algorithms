/*  PROBLEM STATEMENT
    Given several products and each product has a name and a price. Sort the products from most
    expensive to the least expensive.
 */

package BubbleSort;

import java.util.Arrays;

class Product{
    private String name;
    private int price;

    Product(String name, int price){
        if(!name.trim().isEmpty() || name != null &&price > 0){
            this.name = name;
            this.price = price;
        }else{
            this.name = null;
            this.price = 0;
        }
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public String toString(){
        return this.name+" = "+this.price;
    }
}

public class SortingProducts {
    public static void main(String[] args){
        Product mouse = new Product("Mouse", 20);
        Product laptop = new Product("Laptop", 900);
        Product keyboard = new Product("Keyboard", 50);

        Product[] products = {mouse, laptop, keyboard};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(products));

        sortByPrice(products);

        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(products));
    }

    public static void sortByPrice(Product[] arr){
        for(int i = 0; i < arr.length-1; i++){
            boolean isSwapped = false;
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j].getPrice() < arr[j+1].getPrice()){
                    Product temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }


}


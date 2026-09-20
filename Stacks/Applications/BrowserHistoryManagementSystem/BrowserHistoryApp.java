package Applications.BrowserHistoryManagementSystem;

import java.util.Scanner;
public class BrowserHistoryApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        BrowserHistory browser = new BrowserHistory();
        do{
            System.out.println("~~~~~~~~~ WELCOME TO QADIR's BROWSER ~~~~~~~~~");
            
            System.out.println("1. Visit a page");
            System.out.println("2. Show Current Page");
            System.out.println("3. Go Back");
            System.out.println("4. Go Forward");
            System.out.println("-1. Exit");
            

            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Page URL to Visit = ");
                    sc.nextLine();
                    String url = sc.nextLine();
                    browser.visitPage(url);
                    break;

                case 2: 
                    browser.showCurrentPage();
                    break;

                case 3:
                    browser.goBack();
                    break;

                case 4: 
                    browser.goForward();
                    break;
                
                default:
                    break;
            }
            
        }while(choice != -1);
        System.out.println("Thanks For Using our web browser!!!!");
        sc.close();
    }
}

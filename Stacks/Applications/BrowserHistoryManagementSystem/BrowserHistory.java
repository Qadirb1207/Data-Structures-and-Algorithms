package Applications.BrowserHistoryManagementSystem;

public class BrowserHistory {
    private Stack forwardStack;
    private Stack backStack;
    private String currentPage;

    public BrowserHistory(){
        this.forwardStack = new Stack();
        this.backStack = new Stack();
        this.currentPage = "Home";
    }

    public void visitPage(String url){
        backStack.push(currentPage);
        this.currentPage = url;

        if(!forwardStack.isEmpty()){
            forwardStack.clear();
        }
        System.out.println("You are on: "+currentPage+" Now");
    }

    public void goBack(){
        if(backStack.isEmpty()){
            System.out.println("Cannot Go Back!!!");
            return;
        }

        forwardStack.push(currentPage.toString());
        
        try{
            currentPage = backStack.pop();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("You are on: "+currentPage+" Now");
    }

    public void goForward(){
        if(forwardStack.isEmpty()){
            System.out.println("Cannot Go Forward!!");
            return;
        }
        backStack.push(currentPage);
        
       try{
            currentPage = forwardStack.pop();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("You are on: "+currentPage.toString()+" Now");
    }

    public void showCurrentPage() {
        System.out.println("You are currently on "+currentPage.toString());
    }

   


}

package Applications.BrowserHistoryManagementSystem;

public class Stack {
    private Node top;


    public void push(String url){
        Node node = new Node(url);
        if(top == null){
            top = node;
            return;
        }

        node.next = top;
        top = node;
    }

    public String pop() throws Exception{
        if(top == null){
            throw new Exception("The Stack is Empty");
        }
        String url = top.data;
        top = top.next;
        return url;
    }


    public boolean isEmpty(){
        return top == null;
    }

    public void clear(){
        this.top = null;
    }

    public String peek() throws Exception{
        if(top == null){
            throw new Exception("The Stack is Empty");
        }
        return top.data;
    }

    private class Node{
        private String data;
        private Node next;

        public Node(String str){
            this.data = str;
            this.next = null;
        }
    }
}

package Applications.UndoRedoFunctionality;
public class UndoRedoFunctionality {
    private Stack undoStack;
    private Stack redoStack;

    public UndoRedoFunctionality(){
        this.undoStack = new Stack(5);
        this.redoStack = new Stack(5);
    }

    public void performAction(String action){
        if(undoStack.isFull()){
            System.out.println("Cannot perform actions! No more space for further actions!!");
            return;
        }
        undoStack.push(action);
    }

    public void undo(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to be undone!!");
            return;
        }
        redoStack.push(undoStack.pop());
    }

    public void redo(){
        if(redoStack.isEmpty()){
            System.out.println("Nothing to be redone!!");
            return;
        }
        undoStack.push(redoStack.pop());
    }

    public void displayHistory(){
        undoStack.display();
        System.out.println();
        System.out.println();
        redoStack.display();
    }
}

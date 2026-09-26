package Applications.UndoRedoFunctionality;

public class UndoRedoFunctionalityDemo {
    public static void main(String[] args){
        UndoRedoFunctionality undoRedo = new UndoRedoFunctionality();

        undoRedo.performAction("Type A");
        undoRedo.performAction("Type B");
        undoRedo.performAction("Type C");

        undoRedo.displayHistory();
        undoRedo.undo();

        //undoRedo.displayHistory();
        undoRedo.undo();
        undoRedo.displayHistory();


    }
}

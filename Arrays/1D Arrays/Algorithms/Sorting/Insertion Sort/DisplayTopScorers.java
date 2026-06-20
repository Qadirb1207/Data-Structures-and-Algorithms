package InsertionSort;


class Player{
    private String name;
    private int score;

    Player(String name, int score){
        if((!name.trim().isEmpty() || name.length()!=0 || name != null) && score > 0){
            this.name = name;
            this.score = score;
        }else{
            this.name = null;
            this.score = 0;
        }
    }

    //setting score
    public void setScore(int score){
        if(score > 0){
            this.score = score;
        }else{
            this.score = 0;
        }
    }

    //method for setting name
    public void setName(String name){
        if(!name.trim().isEmpty() || name.length()!=0 || name != null){
            this.name = name;
        }
    }

    //method for getting score
    public int getScore(){
        return this.score;
    }

    //method for getting name
    public String getName(){
        return this.name;
    }

    //method for displaying info
    public void displayInfo(){
        System.out.println("Name = "+this.name+"\nScore = "+this.score);
    }
}
public class DisplayTopScorers {
    public static void main(String[] args) {
        Player pl1 = new Player("Qadir", 87);
        Player pl3 = new Player("Abrar", 97);
        Player pl4 = new Player("Liaqat", 99);

        Player[] players = {pl1, pl3, pl4};

        displayToppers(players);

    }

    public static void displayToppers(Player[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j].getScore() > arr[j-1].getScore()){
                    Player temPlayer = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temPlayer;
                }else{
                    break;
                }
            }
        }

        System.out.println("Topper is:\n");
        arr[0].displayInfo();
    }
}

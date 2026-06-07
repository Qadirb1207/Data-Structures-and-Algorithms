package Problems;


import java.util.ArrayList;
public class RotatingArrayList {
    public static void rotate(ArrayList<Integer> list, int steps){
        for(int i = 0; i < steps; i++){
            for(int j = 0; j < list.size()-1; j++){
                int index = j;
                if(--index < 0){
                    index = list.size()-1;
                }else{
                    index = j-1;
                }

                int temp = list.get(j);
                list.set(j, list.get(index));
                list.set(index, temp);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            myList.add(i);
        }
        //[0,1,2,3,4]
        System.out.println(myList.size());
        System.out.println("Before rotating: \n"+myList);
        System.out.println();

        rotate(myList, 1);
        System.out.println("After Rotating: \n"+myList);
    }
}

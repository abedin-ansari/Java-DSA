import java.util.ArrayList;

public class Size {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Length Of the Array: " + list.size()); // Its a function Which actually gives the lenth of the ArrayList
        System.out.print("Array Elements are: ");
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i) + ", ");
        // }
        // System.out.println();
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + ", ");
        }
    }
}

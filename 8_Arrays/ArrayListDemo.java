import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> languages = new ArrayList<>();

        // for adding the element in arraylist
        languages.add("C++");
        languages.add("Java");
        languages.add("JavaScript");

        System.out.println(languages);


        // for access the element
        String str = languages.get(1);
        System.out.println(str);

        // for changing the elem
        languages.set(1, "Ruby");
        System.out.println(languages);

        // for Remove
        languages.remove(2);
        System.out.println(languages);
    }
}

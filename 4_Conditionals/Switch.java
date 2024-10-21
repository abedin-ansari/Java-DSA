import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cloth size:");
        int number = sc.nextInt();
        
        String size;

        switch (number) {
            case 30: 
                 size = "Small";
                 break;
            case 34:
                size = "medium";
                break;
            case 38:
                size = "large";
                break;
            default: 
                size = "Unknown";
                break;
        }
        System.out.println("size:" + size);
    }
}

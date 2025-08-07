public class Assignment {
    public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        x += y;  // (x = x + y) =4
        y -= z;  // (y = y - z) =0
        z /= (x + y); // 2/4
        System.out.println(x + " " + y + " " + z);
    }
}

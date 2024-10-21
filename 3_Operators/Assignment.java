public class Assignment {
    public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        x += y;  // (x = x + y)
        y -= z;  // (y = y - z)
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}

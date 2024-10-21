public class Unary {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(++num); // ++ before value will increase the value and print.

        int a = 12, b = 12;
        int res1, res2;

        System.out.println(a);

        //increament
        res1 = ++a;  // but if we use ++ after value then it will print first then increament the value.
        System.out.println(res1);

        //decreament
        res2 = --b;
        System.out.println(res2);


    }
}

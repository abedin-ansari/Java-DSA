public class IntegerPower {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnMinusOne = power(x, n-1);
        int xn = x * xnMinusOne;
        return xn;
    }

    public static int optimisedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimisedPower(a, n/2);
        int halfPowersq = halfPower * halfPower;
        if(n % 2 != 0){
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
        System.out.println(optimisedPower(2, 10));
    }
}

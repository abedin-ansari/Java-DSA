public class Pair {
    public static int friendsPair(int n){

        if(n == 1 || n == 2){
            return n;
        }
        // // Single
        // int fnm1 = friendsPair(n-1);

        // // Pair
        // int fnm2 = friendsPair(n-2);
        // int pairWays = (n-1) * fnm2;

        // // Total Ways
        // int totalWays = fnm1 + pairWays;
        // return totalWays;

        // return (n-1) + (n-1) * friendsPair(n-2);
        return friendsPair(n - 1) + (n - 1) * friendsPair(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPair(3));
    }
}

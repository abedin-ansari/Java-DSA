public class SumOfNnum {
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int sumOfnMinusOne = calcSum(n-1);
        int sumOfn = n + sumOfnMinusOne;
        return sumOfn;
    }
    public static void main(String[] args) {
        System.out.println(calcSum(5));
    }
}

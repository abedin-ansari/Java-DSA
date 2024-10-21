public class Tiling {
    public static int tilingProblem(int n){

        if(n == 0 || n == 1){
            return 1;
        }
        //Vertical Choice
        int fnMinusOne = tilingProblem(n-1);

        //Horizontal Choice
        int fnMinustwo = tilingProblem(n-2);
        int fn = fnMinusOne + fnMinustwo;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}

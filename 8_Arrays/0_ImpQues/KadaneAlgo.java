public class KadaneAlgo {
    public static void kadanes(int[] num){
        int cs = 0;
        int mxs = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            cs = cs + num[i];
            if(cs < 0){
                cs = 0;
            }
            mxs = Math.max(cs, mxs);
        }
        System.out.println("Our max subArray: " + mxs);
    }
    public static void main(String[] args) {
        int[] num = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(num);
    }
}

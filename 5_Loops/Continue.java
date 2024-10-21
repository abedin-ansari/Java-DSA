public class Continue {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while(i <= 3){
            System.out.println("Outer Loop:" + i);

            while(j <= 3){
                if(j == 2){
                    j++;
                    continue; // this continue keyword will not print inner loop 2
                }
                System.out.println("Inner Loop:" + j);
                j++;
            }
            i++;
        }
    }
}

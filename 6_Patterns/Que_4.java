// pattern problem 4.

public class Que_4 {
    public static void main(String[] args) {
        int n = 5; //  Here always will be a odd number like - 3 5 7 9 etc
        int trows = n;

        int star = 1;
        int spaces = n/2;

        for(int row = 1; row<=trows; row++){

            for(int spc = 1; spc<=spaces; spc++){

                System.out.print(" ");
            }
                for(int cst = 1; cst<=star; cst++){
                    System.out.print("*");
                }
            System.out.println();
            if(row<= trows/2){
                star= star+2;
                spaces--;
            } else{
                spaces++;
                star = star - 2;
            }
        }
    }
}

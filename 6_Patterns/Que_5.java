public class Que_5 {
    public static void main(String[] args) {
        int n = 12;

        for(int frow = 1; frow<= n*2 - 1; frow++){
            System.out.print("*");
        }
        System.out.println();

        int trows = n-1;
        int star = n-1;
        int spaces = 1;
        for(int row = 1; row<= trows; row++){

            for(int cst = 1; cst<= star; cst++){
                System.out.print("*");
            }

                for(int spc = 1; spc <=spaces; spc++){
                    System.out.print(" ");
                }
                for(int str = 1; str<= star; str++){
                    System.out.print("*");
                }

                System.out.println();
                star--;
                spaces += 2;
        }
    }
}
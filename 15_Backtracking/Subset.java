public class Subset {
    public static void findSubset(String str, String ans, int i){
        // Base Case Step
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Recursion Step
        // ( For "Yes" choice)
        findSubset(str, ans+str.charAt(i), i+1);
        // (For "No" choice)
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}

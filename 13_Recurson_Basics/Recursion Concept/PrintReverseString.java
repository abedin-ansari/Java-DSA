public class PrintReverseString {
    public static void reverseString(String str, int idx){
        
        if(idx>=str.length()){
            return;
        }
        reverseString(str, idx+1);
        System.out.print(str.charAt(idx));
    }
    public static void main(String[] args) {
        String str = "abc";
        reverseString(str, 0);
    }    
}

public class Duplecate {
    public static void removeDuplecates(String str, int idx, StringBuilder newStr, boolean[] map){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        // Work
        char currChar = Character.toLowerCase(str.charAt(idx));
        // char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            // Duplecate
            removeDuplecates(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplecates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "JavvaCourrsse";
        removeDuplecates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

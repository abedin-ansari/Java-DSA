// public class StringCompression {
//     public static void main(String[] args) {
//         String str = "aaabbcccc";
//         System.out.println(compress(str));
//     }
//     public static String compress(String str){
//         String newStr = "";

//         for(int i = 0; i < str.length() ; i++){
//             Integer count = 1;
//             while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             newStr += str.charAt(i);
//             if(count > 1){
//                 newStr += count.toString();
//             }
//         }
//         return newStr;
//     }
// }

public class ImpStringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccc";
        System.out.println(compress(str));
    }

    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder();  
        
        // "StringBuilder" ko use karte hain taaki string ko efficiently modify kar sakein, kyunki direct
        // string concatenation har baar nayi string banata hai, jo slow hota hai.

        for (int i = 0; i < str.length(); i++) { //-> Ye loop string ke har character par iterate karta hai.
            int count = 1;          //  Agar current character aur next character same hote hain, to count
                                    // ko badhate jaate hain aur loop ke through move karte hain.

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i)); // Jab bhi koi naya character mile, ya previous sequence khatam
            if (count > 1) {  // ho, to StringBuilder mein us character ko append kar do. Agar character ek
                newStr.append(count);// se zyada baar repeat ho raha hai, to uska count bhi append kar do.
                // (Append the count if more than 1)
            }
        }
        return newStr.toString(); // Pure loop ke baad, StringBuilder ko toString() method se convert karke
    }                             // final compressed string return kar dete hain.
}
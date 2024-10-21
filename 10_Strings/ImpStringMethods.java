//String methods( lenth of a String , convert to lowercase,etc).

public class ImpStringMethods
{
    public static void main(String[] args)
    {
        String name = "Abedin";
        System.out.println(name);

        //int value = name.length();                //Returns the Length of a String.
        //System.out.println(value);

        //String lstring = name.toLowerCase();      //Returns a new string which is always a Lower case.(toLowerCase)
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();      //Returns a new String Which is always an Upper case.(toUpperCase)
        //System.out.println(ustring);

        //String nonTrimmedString = "    Abedin   ";     //name.trim()   Spaces will also be print.
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);
                                                            // 0 1 2 3 4 5 
                                                            // A b e d i n
        //System.out.println(name.substring(3));            // Will be print from 3rd Word 'd'.
        //System.out.println(name.substring(1,5));          // will be print from 'b' to 'i'.
        
        //System.out.println(name.replace('b' , 's'));         //For replacement of a character.
        //System.out.println(name.replace("ed","ie"));        // (name.replace) will Replace "ed" with "ie".

        //System.out.println(name.startsWith("Abe"));              //If it is starts with the strings name then it will be true otherwise False.
        //System.out.println(name.endsWith("in"));                 //Opposite of StartsWith.

        //System.out.println(name.charAt(4));                    //Will be print from 4th Word.
        //System.out.println(name.indexOf("d"));                   //Return the 3rd index (ex. 3).
        
        //String modifiedName = "Abediedin";                                             // 012345678
        //System.out.println(modifiedName.indexOf("i",5));       //Will print 7th index in 'Abediedin'. (after 5th index) ***(LastindexOf) use for 8th to 1st index search
        
        //System.out.println(name.equals("Abedin"));            // Will retern true if String is same and false if the string is wrong.
        //System.out.println(name.equalsIgnoreCase("abedin"));    // Will Ignore the lower or upper case and show true untill Wrong name.
        
        //System.out.println("I am a Student \n I am 18 Year old ");  // \n, \t use for new line and tab space.
    }
}
public class ImpStringPractice
// 1Q. WAP to convert a String to Lower Case.
{
    public static void main(String[] args)
    {
        String Student = "AKASH";
        String lstring = Student.toLowerCase();
        System.out.println(lstring);
    }
}

/*  2Q. WAP to replace spaces with underscores.
{
    public static void main(String[] args)
    {
        String name = "Java replace";
        System.out.println(name.replace(" ","_"));
    }
}*/

/* 3Q. WAP to Fill in a letter to Replace the names in a letter.
{
    public static void main(String[] args)
    {
        String letter = "Dear Anil, Thanks a lot";
        System.out.println(letter.replace("Anil","Kushal"));
    }
}*/

/* 4Q. WAP to detect double spaces in a String.
{
    public static void main(String[] args)
    {
        String Mystring = "This  String contains double space";       //Double Space is on 4th index
        System.out.println(Mystring.indexOf("  "));
    }
}*/

/* 5Q. WAP to to using escape sequence characters ( \n \t etc).
{
    public static void main(String[] args)
    {
        String Letter_2 = "Dear\nAmit you are\t\nnice";
        System.out.println(Letter_2);
    }
}*/
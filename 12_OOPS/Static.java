public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "PNMIC"; // Setting static variable, shared by all objects of Student

        Student s2 = new Student();
        System.out.println(s2.schoolName); // Accessing static variable using another object
    }
}

class Student {
    String name; // Instance variable
    int roll; // Instance variable

    static String schoolName; // Static variable, common for all objects

    void setName(String name) {
        this.name = name; // Setting instance variable
    }

    String getName() {
        return this.name; // Returning instance variable
    }
}

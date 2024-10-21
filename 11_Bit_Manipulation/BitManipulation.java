public class BitManipulation {
    public static void main(String[] args) {
        System.out.println("AND: " + (5 & 6));  // Binary AND: 101 & 110 = 100 (4)

        System.out.println("OR: " + (5 | 6));   // Binary OR: 101 | 110 = 111 (7)

        System.out.println("XOR: " + (5 ^ 6));  // Binary XOR: 101 ^ 110 = 011 (3)

        System.out.println("1's Complement: " + (~5)); // 1's Complement: flips all bits of 5 (101) -> ...11111010 (-6)

        System.out.println("Binary Left Shift: " + (5 << 2)); // Left Shift: 5 (101) << 2 -> 10100 (20)
        // Formula: x << n = x * 2^n

        System.out.println("Binary Right Shift: " + (6 >> 1)); // Right Shift: 6 (110) >> 1 -> 011 (3)
        // Formula: x >> n = x / 2^n
    }
}
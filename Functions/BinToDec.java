public class BinToDec {

    public static void binToDec(int n) {
        int bin = 0, i = 0, ld = n;

        while (ld > 0) {
            int remainder = ld % 10; // Get the last digit
            bin = bin + (remainder * (int) Math.pow(2, i)); // Calculate decimal value
            ld = ld / 10; // Remove the last digit
            i++; // Move to the next position
        }

        System.out.println("Decimal value: " + bin); // Print the decimal value
    }

    public static void main(String[] args) {
        binToDec(11011);
    }
}

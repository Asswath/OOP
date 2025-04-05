public class ArrayException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println("Trying to access index 5: " + numbers[5]); // Out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        } finally {
            System.out.println("Always executed.");
        }
    }
}

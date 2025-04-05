class NumberProcessor {
    public Number process(int value) {
        return value;
    }
}

class IntegerProcessor extends NumberProcessor {
    public Integer process(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative.");
        }
        return value * 2;
    }
}

public class Overridingtyr {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        IntegerProcessor intProcessor = new IntegerProcessor();

        System.out.println("Generic Process: " + processor.process(5));

        try {
            System.out.println("Integer Process: " + intProcessor.process(10));
            System.out.println("Integer Process: " + intProcessor.process(-5)); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
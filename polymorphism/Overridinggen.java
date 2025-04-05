class DataProcessor {
    public void processData(Object data) {
        System.out.println("Processing generic data: " + data.toString());
    }
}

class StringProcessor extends DataProcessor {
    @Override
    public void processData(Object data) {
        if (data instanceof String) {
            String str = (String) data;
            System.out.println("Processing string data: " + str.toUpperCase());
        } else {
            System.out.println("Invalid data type for StringProcessor.");
        }
    }
}

class IntegerProcessor extends DataProcessor {
    @Override
    public void processData(Object data) {
        if (data instanceof Integer) {
            int num = (Integer) data;
            System.out.println("Processing integer data: " + (num * 2));
        } else {
            System.out.println("Invalid data type for IntegerProcessor.");
        }
    }
}

public class Overridinggen {
    public static void main(String[] args) {
        DataProcessor genericProcessor = new DataProcessor();
        StringProcessor stringProcessor = new StringProcessor();
        IntegerProcessor integerProcessor = new IntegerProcessor();

        genericProcessor.processData("Hello");
        stringProcessor.processData("hello");
        integerProcessor.processData(10);
        stringProcessor.processData(10); // Example of invalid type handled by instanceof.
    }
}
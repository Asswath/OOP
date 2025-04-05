class DataHandler {
    protected void displayData() {
        System.out.println("Base Data");
    }

    public final void finalMethod() {
        System.out.println("This method cannot be overridden.");
    }
}

class AdvancedDataHandler extends DataHandler {
    @Override
    public void displayData() { // Access modifier can be widened.
        System.out.println("Advanced Data");
    }

    // Attempting to override finalMethod() would result in a compilation error.
}

public class Overridingmod {
    public static void main(String[] args) {
        DataHandler handler = new DataHandler();
        AdvancedDataHandler advancedHandler = new AdvancedDataHandler();

        handler.displayData();
        advancedHandler.displayData();
        handler.finalMethod();
        advancedHandler.finalMethod();
    }
}
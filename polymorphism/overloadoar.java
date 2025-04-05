class overloadoar {
    public void display(int a, double b) {
        System.out.println("Integer: " + a + ", Double: " + b);
    }
    public void display(double a, int b) {
        System.out.println("Double: " + a + ", Integer: " + b);
    }

    public static void main(String[] args) {
        overloadoar obj = new overloadoar();
        obj.display(10, 20.5);    
        obj.display(20.5, 10);    
    }
}

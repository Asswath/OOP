class overloadarg {
    public void display(int a) {
        System.out.println("Integer: " + a);
    }
    public void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        overloadarg obj = new overloadarg();
        obj.display(10);          
        obj.display(10, 20);      
    }
}

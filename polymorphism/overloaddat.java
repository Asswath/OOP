class overloaddat {
    public void display(int a) {
        System.out.println("Integer: " + a);
    }
    public void display(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
        overloaddat obj = new overloaddat();
        obj.display(10);          
        obj.display(10.5);        
    }
}

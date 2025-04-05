class overloadtyp {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        overloadtyp obj = new overloadtyp();
        System.out.println("Integer sum: " + obj.add(10, 20));         
        System.out.println("Double sum: " + obj.add(10.5, 20.5));      
    }
}

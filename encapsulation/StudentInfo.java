class Student {
    private String name;
    private int age;
    private String grade;

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }
}

public class StudentInfo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Aman");
        student.setAge(17);
        student.setGrade("11th");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
    }
}

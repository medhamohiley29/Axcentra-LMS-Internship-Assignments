public class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Medha", 101, 92.5);
        Student s2 = new Student("Aman", 102, 78.0);

        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
    }
}


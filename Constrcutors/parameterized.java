//Program to demonstrate parameterized constructor

class Student {
    int id;
    String name;

    // parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name);
    }
}

public class parameterized {
    public static void main(String args[]) {
        Student s1 = new Student(11, "Anushka");
        s1.display();
        // Student s2 = new Student();
    }
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Teacher of " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student in Grade " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Staff in " + department);
    }
}

public class School_System {
    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 40, "Math");
        Student s = new Student("Bob", 16, 10);
        Staff st = new Staff("Charlie", 35, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
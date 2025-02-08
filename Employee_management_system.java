class Employee {
    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {}
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        System.out.println("Manager: " + name + " ID: " + id + " Salary: " + salary + " Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        System.out.println("Developer: " + name + " ID: " + id + " Salary: " + salary + " Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int duration;

    Intern(String name, int id, int salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Intern: " + name + " ID: " + id + " Salary: " + salary + " Duration: " + duration + " months");
    }
}

public class Employee_management_system {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 101, 50000, 10);
        Developer d = new Developer("Bob", 102, 40000, "Java");
        Intern i = new Intern("Charlie", 103, 15000, 6);

        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
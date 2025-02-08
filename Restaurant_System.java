interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef preparing food.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter serving food.");
    }
}

public class Restaurant_System {
    public static void main(String[] args) {
        Chef c = new Chef("John", 101);
        Waiter w = new Waiter("Mike", 102);

        c.performDuties();
        w.performDuties();
    }
}
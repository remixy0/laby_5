package zad2;

public abstract class Employee {
    String name;
    int age;
    float salary = 10000;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void calculateBonus();

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Developer extends Employee {
    Developer(String name, int age) {
        super(name, age);
    }
    @Override
    public void calculateBonus() {
        System.out.println(super.salary * 1.2);
    }
}

class Manager extends Developer {
    Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void calculateBonus() {
        System.out.println(super.salary * 1.5);
    }
}



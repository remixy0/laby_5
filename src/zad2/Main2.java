package zad2;

public class Main2 {
    public static void main(String[] args) {

        Employee [] employees = new Employee[3];

        employees[0] = new Manager("Marek",12);
        employees[1] = new Manager("Karl",23);
        employees[2] = new Developer("Ania",18);

        for (Employee employee : employees) {
            employee.calculateBonus();
        }
    }
}

abstract class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        this.name = n;
        this.salary = s;
    }

    abstract void calculateSalary();
}

class Manager extends Employee {
    double performanceBonus;

    Manager(String n, double s, double pB) {
        super(n, s);
        this.performanceBonus = pB;
    }

    @Override
    void calculateSalary() {
        double totalSalary = salary + performanceBonus;
        System.out.println("Employee: " + name + " (Manager)");
        System.out.println("Total Salary: " + totalSalary);
        System.out.println();
    }
}

class SalesPerson extends Employee {
    double commission;
    int salesMade;

    SalesPerson(String n, double s, double c, int sm) {
        super(n, s);
        this.commission = c;
        this.salesMade = sm;
    }

    @Override
    void calculateSalary() {
        double totalSalary = salary + (commission * salesMade);
        System.out.println("Employee: " + name + " (SalesPerson)");
        System.out.println("Total Salary: " + totalSalary);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[4];
        //A reference array is an array that stores references (memory addresses) of objects, not the objects themselves, allowing different subclass objects to be stored under a common parent type.

        empArray[0] = new Manager("Alice", 50000, 15000);
        empArray[1] = new SalesPerson("Bob", 30000, 500, 20);
        empArray[2] = new SalesPerson("Charlie", 28000, 400, 25);
        empArray[3] = new Manager("David", 55000, 12000);

        for (Employee e : empArray) {
            e.calculateSalary();
        }
    }
}

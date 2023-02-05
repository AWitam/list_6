package builder_pattern.components;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(String name, String surname, Type type, String position, double salary) {
        super(name, surname, type);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("\n%s %s, position: %s, salary: %s", getName(), getSurname(), position, salary);
    }
}


package builder_pattern.components;

public class Person {
    private String name;
    private String surname;
    private Type type;

    public Person(String name, String surname, Type type) {
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Type getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  String.format("%s %s" , name, surname);
    }
}

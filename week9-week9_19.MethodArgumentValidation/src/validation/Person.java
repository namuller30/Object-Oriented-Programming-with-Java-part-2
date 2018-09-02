package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (age<0 || age>120){
            throw new IllegalArgumentException("Age must be between 0-120.");
        }
        if (name==null){
            throw new IllegalArgumentException("Namme cannot be null");
        }
        if (name.isEmpty() || name.length()>40){
            throw new IllegalArgumentException("Name cannot be empty or greater than 40 chars.");
        }
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

package ua.com.alevel.crud;

import java.util.Objects;


public class User {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new RuntimeException("you're stupid");
        }
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.isBlank()) {
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            throw new RuntimeException("stupid");
        }

    }
}

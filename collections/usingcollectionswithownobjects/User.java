package collections.usingcollectionswithownobjects;

import java.util.Objects;

public class User implements Comparable<User> {
    private int id;
    private String name;
    private int age;
    private String phone;
    private String email;

    User(int id, String name, int age, String phone, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("User(%s, %d, %s, %s)", name, age, phone, email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return this.name == user.name && this.age == user.age
                && this.phone == user.phone && this.email == user.email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private int id() {
        return id;
    }

    @Override
    public int compareTo(User o) {
        return (o == this) ? 0 : id() - o.id();
    }
}

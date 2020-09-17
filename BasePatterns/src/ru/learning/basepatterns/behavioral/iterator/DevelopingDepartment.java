package ru.learning.basepatterns.behavioral.iterator;

public class DevelopingDepartment implements Collection {
    private String name;
    private String[] departments;

    public DevelopingDepartment(String name, String[] departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDepartments() {
        return departments;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    @Override
    public Iterator getIterator() {
        return new Departments();
    }

    private class Departments implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < departments.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return departments[index++];
        }
    }
}

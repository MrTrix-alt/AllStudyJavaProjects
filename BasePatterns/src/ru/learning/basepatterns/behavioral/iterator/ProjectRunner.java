 package ru.learning.basepatterns.behavioral.iterator;

public class ProjectRunner {
    public static void main(String[] args) {
        String[] departments = {"Back-end", "Front-end", "QA", "Manager", "Design"};
        DevelopingDepartment developingDepartment =
                new DevelopingDepartment("GeoIT", departments);

        Iterator iterator = developingDepartment.getIterator();
        System.out.println("Company name: " + developingDepartment.getName());
        System.out.println("Departments:");
        while(iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}

package ru.learning.basepatterns.structural.сomposite.node.staff;

import ru.learning.basepatterns.structural.сomposite.component.Component;

public class Manager implements Component {
    @Override
    public void work() {
        System.out.println("Manager курирует проект");
    }
}

package ru.learning.basepatterns.structural.сomposite.node.staff;

import ru.learning.basepatterns.structural.сomposite.component.Component;

public class LayoutDesigner implements Component {
    @Override
    public void work() {
        System.out.println("LayoutDesigner верстает сайт по макету");
    }
}

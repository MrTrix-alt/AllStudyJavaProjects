package ru.learning.basepatterns.structural.сomposite.node.department;

import ru.learning.basepatterns.structural.сomposite.component.Component;
import ru.learning.basepatterns.structural.сomposite.node.staff.JavaScriptDeveloper;
import ru.learning.basepatterns.structural.сomposite.node.staff.LayoutDesigner;
import ru.learning.basepatterns.structural.сomposite.node.staff.WebDesigner;

import java.util.LinkedList;
import java.util.List;

public class WebStudio implements Component {
    private List<Component> components = new LinkedList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void work() {
        System.out.println("WebStudio принимает решения по созданию фронтенда");
        for(Component component : components) {
            component.work();
        }
    }



}

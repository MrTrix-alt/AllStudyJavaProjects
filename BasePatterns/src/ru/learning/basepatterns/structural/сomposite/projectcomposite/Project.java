package ru.learning.basepatterns.structural.сomposite.projectcomposite;

import ru.learning.basepatterns.structural.сomposite.component.Component;

import java.util.LinkedList;
import java.util.List;

public class Project  implements Component {
    private List<Component> components = new LinkedList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void work() {
        for(Component component : components) {
            component.work();
        }
    }
}

package ru.learning.basepatterns.structural.сomposite.node.staff;

import ru.learning.basepatterns.structural.сomposite.component.Component;

public class WebDesigner implements Component {
    @Override
    public void work() {
        System.out.println("WebDesigner создает макет сайта");
    }
}

package ru.learning.basepatterns.structural.сomposite.node.staff;

import ru.learning.basepatterns.structural.сomposite.component.Component;

public class JavaDeveloper implements Component {
    @Override
    public void work() {
        System.out.println("JavaDeveloper пишет серверную серверную часть сайта");
    }
}

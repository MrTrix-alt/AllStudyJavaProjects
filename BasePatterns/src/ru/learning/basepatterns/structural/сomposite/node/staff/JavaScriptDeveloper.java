package ru.learning.basepatterns.structural.сomposite.node.staff;

import ru.learning.basepatterns.structural.сomposite.component.Component;

public class JavaScriptDeveloper implements Component {
    @Override
    public void work() {
        System.out.println("JavaScriptDeveloper пишет интерактивную часть сайта");
    }
}

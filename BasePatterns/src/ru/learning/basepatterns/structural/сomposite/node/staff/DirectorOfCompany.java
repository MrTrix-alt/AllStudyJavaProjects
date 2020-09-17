package ru.learning.basepatterns.structural.сomposite.node.staff;

import ru.learning.basepatterns.structural.сomposite.component.Component;

public class DirectorOfCompany implements Component {
    @Override
    public void work() {
        System.out.println("Глава компании отдает поручение создать сайт по заказу");
    }
}

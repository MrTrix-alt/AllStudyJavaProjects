package ru.learning.basepatterns.structural.сomposite;

import ru.learning.basepatterns.structural.сomposite.node.department.DevelopOffice;
import ru.learning.basepatterns.structural.сomposite.node.department.ManageOffice;
import ru.learning.basepatterns.structural.сomposite.node.department.WebStudio;
import ru.learning.basepatterns.structural.сomposite.node.staff.*;
import ru.learning.basepatterns.structural.сomposite.projectcomposite.Project;

public class Main {
    public static void main(String[] args) {

        // контейнер (всеобъемлющий) проектов компании, который может содержать в себе контейнеры
        Project company = new Project();
        Project project1 = new Project(); // контейнер проекта со всеми участниками
        Project project2 = new Project(); // контейнер проекта с отделами

        // Создаем "компанию" по созданию сайтов
        DirectorOfCompany director = new DirectorOfCompany();
        ManageOffice manageOffice1 = new ManageOffice();
        WebStudio webStudio1 = new WebStudio();
        DevelopOffice developOffice1 = new DevelopOffice();

        // Внедряем в "компанию" работников
        manageOffice1.addComponent(new Manager());
        webStudio1.addComponent(new WebDesigner());
        webStudio1.addComponent(new LayoutDesigner());
        webStudio1.addComponent(new JavaScriptDeveloper());
        developOffice1.addComponent(new JavaDeveloper());

        // Внедряем в проект1 все компоненты "компании"
        project1.addComponent(director);
        project1.addComponent(manageOffice1);
        project1.addComponent(webStudio1);
        project1.addComponent(developOffice1);

        // Объявляем о создании проекта2, используя только отделы "компании"
        ManageOffice manageOffice2 = new ManageOffice();
        WebStudio webStudio2 = new WebStudio();
        DevelopOffice developOffice2 = new DevelopOffice();

        // Внедряем только отделы "компании" в проект2
        project2.addComponent(director);
        project2.addComponent(manageOffice2);
        project2.addComponent(webStudio2);
        project2.addComponent(developOffice2);

        // добавляем в контейнер "компания" проект1 и проект2
        company.addComponent(project1);
        company.addComponent(project2);

        // запускаем работу контейнера
        company.work();





    }
}

package ru.learning.basepatterns.structural.bridge;

import ru.learning.basepatterns.structural.bridge.bridge.Java;
import ru.learning.basepatterns.structural.bridge.bridge.Python;
import ru.learning.basepatterns.structural.bridge.enitity.BackEnd;
import ru.learning.basepatterns.structural.bridge.enitity.Enterprise;
import ru.learning.basepatterns.structural.bridge.enitity.Web;

public class Main {
    public static void main(String[] args) {

        BackEnd backEndEnterprise = new Enterprise(new Java());
        backEndEnterprise.takeLanguage();

        BackEnd backEndWeb = new Web(new Python());
        backEndWeb.takeLanguage();
    }
}

package ru.learning.basepatterns.structural.facade;

public class Complex {
    public static void main(String[] args) {
        // Использование паттерна "Фасад"
        WorkFlowFacade workFlowFacade = new WorkFlowFacade();
        workFlowFacade.continueWorkFlow();
        // С помощью паттерна можно упростить клиентский код,
        // скрыть от пользователя сложную подсистему
        workFlowFacade.stopWorkFlow();



//        Без использования паттерна "Фасад"    клиентский код может разростись,
//        если будут учитываться еще больше моментов в данной моделе строительства
//        Building building = new Building();
//        building.buildHome();
//
//        LifeSafetyCheck lifeSafetyCheck = new LifeSafetyCheck();
//        lifeSafetyCheck.startBuilding();
//
//        Builder builder = new Builder();
//        builder.doJob(lifeSafetyCheck);
//
//
//        lifeSafetyCheck.stopBuilding();
//        builder.doJob(lifeSafetyCheck);
    }
}

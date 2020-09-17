package ru.learning.basepatterns.structural.facade;

public class WorkFlowFacade {
    private Building building = new Building();
    private Builder builder = new Builder();
    private LifeSafetyCheck lifeSafetyCheck = new LifeSafetyCheck();

    public void continueWorkFlow() {
        building.buildHome();
        lifeSafetyCheck.startBuilding();
        builder.doJob(lifeSafetyCheck);
    }

    public void stopWorkFlow() {
        building.buildHome();
        lifeSafetyCheck.stopBuilding();
        builder.doJob(lifeSafetyCheck);
    }
}

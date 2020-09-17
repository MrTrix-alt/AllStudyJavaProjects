package ru.learning.basepatterns.behavioral.state;

public class Sportsman {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Trainee());
        } else if (activity instanceof Trainee) {
            setActivity(new Eating());
        } else if (activity instanceof Eating) {
            setActivity(new Walking());
        } else if (activity instanceof Walking) {
            setActivity(new Sleeping());
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}

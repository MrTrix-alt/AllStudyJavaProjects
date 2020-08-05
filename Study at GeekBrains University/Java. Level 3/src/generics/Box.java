package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> box;
    private float weight = 0;

    Box(T... fruit) {
        this.box = new ArrayList<T>(Arrays.asList(fruit));
    }

    public void addFruit(T... fruit) {
        this.box.addAll(Arrays.asList(fruit));
    }

    public ArrayList<T> getBox() {
        return new ArrayList<T>(box);
    }

    public void clear() {
        box.clear();
    }

    public double getWeightBox() {
        if (box.size() == 0) {
            return 0;
        }
        for (T fruit : box) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void compare(Box box) {
        if(this.getWeightBox() == box.getWeightBox()){
            System.out.println("Коробки весят одинаково");
        } else {
            System.out.println("Коробки имеют разный вес");
        }
    }

    public void shift(Box<T> box) {
        box.box.addAll(this.box);
        clear();
    }
}

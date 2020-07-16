package lambda.methodlinksandlambda.collectionandlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseMethodRef {

    int compare(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {

        UseMethodRef obj = new UseMethodRef();
        List<MyClass> collect = new ArrayList<>();

        collect.add(new MyClass(64));
        collect.add(new MyClass(434));
        collect.add(new MyClass(123));
        collect.add(new MyClass(243));
        collect.add(new MyClass(23));
        collect.add(new MyClass(276));
        // Нахождение максимального числа, используя метод compare.
        // Избавляемся от необходимости явной реализации и создания
        // экземпляра интерфейса Comparator
        MyClass maxValObj = Collections.max(collect, obj::compare);
        System.out.println("Max value of collect is: " + maxValObj.getVal());
    }
}

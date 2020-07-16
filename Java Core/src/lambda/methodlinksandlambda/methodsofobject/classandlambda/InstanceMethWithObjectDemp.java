package lambda.methodlinksandlambda.methodsofobject.classandlambda;

public class InstanceMethWithObjectDemp  {

    // Метод, возвращающий количество экземпляров
    // объекта, найденных по критериям, задаваемым параметром
    // функционального интерфейса
    <T> int counter(T[] vals, MyFunc<T> func, T temp) {
        int count = 0;

        for (int i = 0; i < vals.length ; i++) {
            if(func.temperature(vals[i], temp)) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int count;
        InstanceMethWithObjectDemp obj = new InstanceMethWithObjectDemp();
        Temperature[] weekDayTemperature = { new Temperature(35), new Temperature(36),
                                             new Temperature(25), new Temperature(28),
                                             new Temperature(29), new Temperature(29),
                                             new Temperature(40), new Temperature(39),
                                           };

        // Используем метод counter() вместе с массивами объектов
        // типа Temperature. Ссылка на метод экземпляра sameTemp()
        // передается в качестве второго параметра

        count = obj.counter(weekDayTemperature, Temperature::sameTemp, new Temperature(29));
        System.out.println("Количество дней, когда температура была 29: " + count);


    }
}

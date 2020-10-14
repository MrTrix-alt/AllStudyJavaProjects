package learning.java.generics.upperbase.limitation;

public class Program
{

    public static void main(String[] args)
    {
        // Ограничения обобщений:
        Car car = new Car(4000000);
        CarBank<Car> carBank = new CarBank<>(car);
        carBank.setRate(0.2f);
        float creditSum = carBank.getCreditSum();
        System.out.println(creditSum);

        Car electroCar = new ElectroCar(2000000);
        CarBank<Car> electroCarBank = new CarBank<>(electroCar);
        ElectroCar electroCar1 = new ElectroCar(212212);
        CarBank<ElectroCar> elCarBank = new CarBank<>(electroCar1);



    }
}

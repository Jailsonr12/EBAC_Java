import Factory.CarFactory;
import Toyota.ToyotaFactory;
import Ford.FordFactory;
import Models.Sedan;
import Models.Suv;

public class Main {
    static void produzir(CarFactory f) {
        Sedan s = f.createSedan();
        Suv   u = f.createSuv();
        System.out.println(f.getClass().getSimpleName());
        System.out.println(" Sedan: " + s.model() + " - " + s.cor());
        System.out.println(" SUV  : " + u.model() + " - " + u.cor());
        System.out.println();
    }

    public static void main(String[] args) {
        produzir(new ToyotaFactory());
        produzir(new FordFactory());
    }
}

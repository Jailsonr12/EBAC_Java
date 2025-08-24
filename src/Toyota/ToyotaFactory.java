package Toyota;

import Factory.CarFactory;
import Models.Sedan;
import Models.Suv;

public class ToyotaFactory implements CarFactory {
    public Sedan createSedan() { return new ToyotaSedan(); }
    public Suv   createSuv()   { return new ToyotaSuv();   }
}

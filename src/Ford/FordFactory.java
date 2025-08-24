package Ford;

import Factory.CarFactory;
import Models.Sedan;
import Models.Suv;

public class FordFactory implements CarFactory {
    public Sedan createSedan() { return new FordSedan(); }
    public Suv   createSuv()   { return new FordSuv();   }
}

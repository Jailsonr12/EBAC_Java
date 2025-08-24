package Factory;


import Models.Sedan;
import Models.Suv;

public interface CarFactory {
    Sedan createSedan();
    Suv createSuv();
}

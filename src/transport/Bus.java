package transport;

public class  Bus extends Transport {

    public Bus() {
    }

    public Bus(String brand, String model, int yearOfProduction) {
        super (brand, model, yearOfProduction);
    }

    public Bus(String brand, String model, int yearOfProduction, String countryOfManufacture, String bodyColor) {
        super (brand, model, yearOfProduction, countryOfManufacture, bodyColor);
    }

    public Bus(String brand, String model, int yearOfProduction, String countryOfManufacture, int maximumMovementSpeed) {
        super (brand, model, yearOfProduction, countryOfManufacture, maximumMovementSpeed);
    }
    public void bus () {
        System.out.println("Марка: " + getBrand() + ", Модель: " + getModel() + ", Год выпуска: " + getYearOfProduction());
    }
    @Override
    public void refill(){
        System.out.println("Можно заправлять бензином или дизелем на заправке!");

    }
}

package transport;

public abstract class  Transport {

    private String brand;
    private String model;
    private int yearOfProduction;
    private String countryOfManufacture;
    private String bodyColor;
    private int maximumMovementSpeed;

    public Transport(){
    }

    public Transport(String brand, String model, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Transport(String brand, String model, int yearOfProduction, String countryOfManufacture, String bodyColor) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfManufacture = countryOfManufacture;
        this.bodyColor = bodyColor;
    }
    public Transport(String brand, String model, int yearOfProduction, String countryOfManufacture, int maximumMovementSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfManufacture = countryOfManufacture;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank())
            System.out.println("Неверное значение");
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model== null || model.isEmpty() || model.isBlank())
            System.out.println("Неверное значение");
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }


    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }


    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor== null || bodyColor.isEmpty() || bodyColor.isBlank())
            System.out.println("Неверное значение");
        this.bodyColor = bodyColor;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        if (maximumMovementSpeed == 0 || maximumMovementSpeed < 0)
            System.out.println("Неверное значение");
        this.maximumMovementSpeed = maximumMovementSpeed;
    }
        public void refill () {
    }
}


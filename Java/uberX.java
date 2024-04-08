public class uberX extends Car {
    String brand;
    String model;

    public uberX(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.model = model;
        this.brand = brand;
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand:" + brand);
    }
}

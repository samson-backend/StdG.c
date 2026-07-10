public class Car {
    String brand;
    String color;
    int year;

    public Car(String carBrand, String carColor, int carYear) {
        brand = carBrand;
        color = carColor;
        year = carYear;
    }
    public void drive() {
        Car car1 = new Car("Toyota", "White", 2020);
        Car car2 = new Car("Honda", "Black", 2021);

        car1.drive();
        car2.drive();
    }
}

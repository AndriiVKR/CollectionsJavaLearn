import java.util.Objects;

public class Car{
    private String brand;
    private int number;

    public Car(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Car) {
//            Car car = (Car) obj;
//            return car.brand.equals(this.brand) && car.number == this.number;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public int hashCode() {
//        return brand.hashCode() + number;
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, number);
    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", number=" + number +
                '}';
    }
}

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Car car1 = new Car("BMW", 1);
//        Car car2 = new Car("BMW", 1);
////        Car car2 = car1;
//        System.out.println(car1.equals(car2));
//        System.out.println(car1.hashCode());
//        System.out.println(car2.hashCode());

//        CarCollection cars = new CarArrayList();
////        List<Car> cars = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            cars.add(new Car("Brand" + i, i));
//        }
//        for (Car car : cars) {
//            System.out.println(car.getBrand() + " " + car.getNumber());
//        }

//    Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return -o1.compareTo(o2);
//        }
//    });
//    for (int i = 0; i < 100; i++) {
//        numbers.add((int)(Math.random() * 10));
//    }
//    for (int number : numbers) {
//        System.out.println(number);
//    }

//        Set<Car> cars = new TreeSet<>(new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o1.getBrand().compareTo(o2.getBrand());
//            }
//        });
//        for (int i = 0; i < 100; i++) {
//            cars.add(new Car("Brand" + i, i));
//        }
//        for (Car car : cars) {
//            System.out.println(car);
//        }

        HashMap<CarOwner, Car> map = new HashMap<>();
        CarOwner key = new CarOwner(1, "Name", "LastName");
        map.put(key, new Car("Brand1", 1));
        key.setId(8);
        for (CarOwner carOwner : map.keySet()) {
            System.out.println(carOwner.getId());
        }

//        Car car = map.get(key);
//        System.out.println(car.getBrand());


    }
}

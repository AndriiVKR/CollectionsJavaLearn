import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarQueueTest {

    private CarQueue<Car> queue;

    @Before
    public void setUp() throws Exception{
        queue = new CarLinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.add(new Car("Brand" + i, i));
        }

    }
    @Test
    public void add() {
        assertEquals(10, queue.size());
    }

    @Test
    public void peek() {
        Car car = queue.peek();
        assertEquals("Brand0", car.getBrand());
        assertEquals(10, queue.size());
    }

    @Test
    public void pole() {
        Car car = queue.pole();
        assertEquals("Brand0", car.getBrand());
        assertEquals(9, queue.size());
    }
}
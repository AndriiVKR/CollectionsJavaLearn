import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CarHashSet<T> implements CarSet<T> {

//    private static final int INITIAL_CAPACITY = 16;
//    private static final double LOAD_FACTOR = 0.75;
//    private int size = 0;
//    private Entry[] array = new Entry[INITIAL_CAPACITY];
    private Map<T, Object> map = new HashMap<>();
    private Object object = new Object();

    @Override
    public boolean add(T car) {
//        if (size >= (array.length * LOAD_FACTOR)) {
//            increaseArray();
//        }
//        boolean added = add(car, array);
//        if (added) {
//            size++;
//        }
//        return added;
        if (map.containsKey(car)) {
            return false;
        }
        map.put(car, object);
        return true;
    }

//    private boolean add(Car car, Entry[] dst) {
//        int position = getElementPosition(car, dst.length);
//        if (dst[position] == null) {
//            Entry entry = new Entry(car, null);
//            dst[position] = entry;
//            size++;
//            return true;
//        } else {
//            Entry existedElement = dst[position];
//            while (true) {
//                if (existedElement.value.equals(car)) {
//                    return false;
//                } else if (existedElement.next == null) {
//                    existedElement.next = new Entry(car, null);
//                    size++;
//                    return true;
//                } else {
//                    existedElement = existedElement.next;
//                }
//            }
//        }
//    }

    @Override
    public boolean remove(T car) {
//        int position = getElementPosition(car, array.length);
//        if (array[position] == null) {
//            return false;
//        }
//        Entry secondLast = array[position];
//        Entry last = secondLast.next;
//        if (secondLast.value.equals(car)) {
//            array[position] = last;
//            size--;
//            return true;
//        }
//        while (last != null) {
//            if (last.value.equals(car)) {
//                secondLast.next = last.next;
//                size--;
//                return true;
//            } else {
//                secondLast = last;
//                last = last.next;
//            }
//        }
//        return false;
        Object removed = map.remove(car);
        return removed != null;
    }

    @Override
    public boolean contains(T car) {
//        int position = getElementPosition(car, array.length);
//        if (array[position] == null) {
//            return false;
//        }
//        Entry secondLast = array[position];
//        Entry last = secondLast.next;
//        if (secondLast.value.equals(car)) {
//            return true;
//        }
//        while (last != null) {
//            if (last.value.equals(car)) {
//                return true;
//            } else {
//                last = last.next;
//            }
//        }
//        return false;
        return map.containsKey(car);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void clear() {
//        array = new Entry[INITIAL_CAPACITY];
//        size = 0;
        map.clear();
    }


//    private int getElementPosition(T car, int arrayLength) {
//        return Math.abs(car.hashCode() % arrayLength);
//    }

    @Override
    public Iterator<T> iterator() {
//        return new Iterator<Car>() {
//            int index = 0;
//            int arrayIndex = 0;
//            Entry entry;
//
//            @Override
//            public boolean hasNext() {
//                return index < size;
//            }
//
//            @Override
//            public Car next() {
//                while (array[arrayIndex] == null) {
//                    arrayIndex++;
//                }
//                if (entry == null) {
//                    entry = array[arrayIndex];
//                }
//                Car result = entry.value;
//                entry = entry.next;
//                if (entry == null) {
//                    arrayIndex++;
//                }
//                index++;
//                return result;
//            }
//        };
        return map.keySet().iterator();
    }

//    private void increaseArray() {
//        Entry[] newArray = new Entry[array.length * 2];
//        for (Entry entry : array) {
//            Entry existedElement = entry;
//            while (existedElement != null) {
//                add(existedElement.value, newArray);
//                existedElement = existedElement.next;
//            }
//        }
//        array = newArray;
//    }
//
//    private static class Entry{
//        private Car value;
//        private Entry next;
//
//        private Entry(Car value, Entry next) {
//            this.value = value;
//            this.next = next;
//        }
//    }
}

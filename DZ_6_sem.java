import java.util.*;

public class DZ_6_sem {
    public static void main(String[] args) {


        MySet MySet = new MySet();



//        MySet.add(7);

        for (int i = 0; i < 10; i++) {
            MySet.add(new Random().nextInt(10));
        }

        System.out.println(MySet.contains(7));
        System.out.println("Добавляем элементы: ");
        System.out.println(Arrays.toString(MySet.toArray()));

        Iterator<Integer> iterator = MySet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");

        }

        System.out.println("\n" + "Элемент по индексу: ");
        System.out.println(MySet.getItem(3));

    }
}


class MySet {

    static final Object OBJECT = new Object();     // final после инициализации его нельзя будет менять
    private LinkedHashMap<Integer, Object> hashMap = new LinkedHashMap<>();

    public boolean add(int num) {
        // HashSet<Integer> Integers;

        return hashMap.put(num, OBJECT) == null; // если ключ был вернет True

    }

    public boolean contains(int num) {
        return hashMap.containsKey(num);

    }

    public Iterator<Integer> iterator() {
        return hashMap.keySet().iterator();
    }


    public Object[] toArray() {
        return hashMap.keySet().toArray();

    }

    public Integer getItem(int index) {
        return (Integer) toArray()[index];
    }




}
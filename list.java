import java.util.*;

public class list {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("mango");
        System.out.println("List:" + list);
        System.out.println("Size:" + list.size());
        System.out.println("Get:" + list.get(1));
        list.set(1, "Banana");
        System.out.println("After set:" + list);
        list.remove("Apple");
        System.out.println("After Remove:" + list);
        System.out.println("contains mango:" + list.contains("Mango"));
        System.out.println("Index:" + list.indexOf("Mango"));
        System.out.println("Is Empty:" + list.isEmpty());
        list.clear();
        System.out.println("After clear:" + list);

    }

}

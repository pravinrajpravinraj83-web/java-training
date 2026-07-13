import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Mango");
        System.out.println("list:" + list);
        System.out.println("first fruit:" + list.get(0));
        list.set(1, "Banana");
        System.out.println("After set:" + list);
        list.remove("Apple");
        System.out.println("After Remove:" + list);
        System.out.println("Size:" + list.size());

    }

}

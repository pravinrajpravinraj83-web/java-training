import java.util.*;

public class collection {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Kumar");
        names.add("priya");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("kumar"));
        names.remove("Priya");
        
        System.out.println(names);
    }

}

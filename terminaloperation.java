import java.util.*;

public class terminaloperation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);
        list.stream()
                .filter(n -> n > 20)
                .distinct()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }

}

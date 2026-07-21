import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void findCombination(int start, List<Integer> list) {
        if (list.size() == 2) {
            System.out.println(list);
            return;
        }
        for (int i = start; i <= 3; i++) {
            list.add(i);
            findCombination(i + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        findCombination(1, new ArrayList<>());
    }
}

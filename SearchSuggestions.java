import java.util.*;

public class SearchSuggestions {

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Arrays.sort(products);

        List<List<String>> result = new ArrayList<>();
        String prefix = "";

        for (char ch : searchWord.toCharArray()) {

            prefix += ch;
            List<String> list = new ArrayList<>();

            for (String product : products) {

                if (product.startsWith(prefix)) {
                    list.add(product);
                }

                if (list.size() == 3) {
                    break;
                }
            }

            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {

        String[] products = {
                "mobile",
                "mouse",
                "moneypot",
                "monitor",
                "mousepad"
        };

        String searchWord = "mouse";

        List<List<String>> answer = suggestedProducts(products, searchWord);

        System.out.println(answer);
    }
}

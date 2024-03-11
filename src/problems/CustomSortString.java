package problems;

import java.util.HashMap;
import java.util.Map;

public class CustomSortString {
    String order = "cba";
    String s = "abcd";
    StringBuilder builder = new StringBuilder();

    public String solution() {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : order.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                while (count > 0) {
                    builder.append(c);
                    count--;
                }
                map.remove(c);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            while (count > 0) {
                builder.append(c);
                count--;
            }
        }
        System.out.println(builder);

        return builder.toString();
    }
}

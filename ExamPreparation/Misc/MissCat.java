package e_Misc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MissCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<Integer, Integer> cats = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            int catNumber = Integer.parseInt(scanner.nextLine());

            if (!cats.containsKey(catNumber)) {
                cats.put(catNumber, 0);
                cats.put(catNumber, cats.get(catNumber) + 1);
            } else {
                cats.put(catNumber, cats.get(catNumber) + 1);
            }
        }

        cats.entrySet().stream()
                .sorted((left, right) -> {
                    int sort = Integer.compare(right.getValue(), left.getValue());

                    if (sort == 0) {
                        sort = Integer.compare(left.getKey(), right.getKey());
                    }
                    return sort;
                })
                .limit(1)
                .forEach(e -> System.out.println(e.getKey()));
    }
}

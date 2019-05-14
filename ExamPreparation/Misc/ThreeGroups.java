package e_Misc;

import java.util.*;

public class ThreeGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<Integer, List<Integer>> numberGroups = new TreeMap<>();

        for (String num : input) {

            //get remainder from 3 division

            int remainder = Integer.parseInt(num) % 3;

            if (!numberGroups.containsKey(remainder)) {
                numberGroups.put(remainder, new ArrayList<>());
                numberGroups.get(remainder).add(Integer.parseInt(num));
            } else {
                numberGroups.get(remainder).add(Integer.parseInt(num));
            }
        }

        for (Map.Entry<Integer, List<Integer>> kvp : numberGroups.entrySet()) {

            System.out.println(kvp.getValue().toString().replaceAll("[,\\[\\]]", ""));
        }
    }
}

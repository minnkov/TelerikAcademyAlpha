package e_Misc;

public class LongSequence {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 2; i <= 1001; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("-" + i);
            }
        }
    }
}

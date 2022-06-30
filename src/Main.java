import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        for (int x : intList) {
            if (x > 0)
                result.add(x);
        }
        for (int y : result) {
            if (y % 2 == 0)
                result2.add(y);
        }
        Collections.sort(result2);
        System.out.println(result2);
    }
}


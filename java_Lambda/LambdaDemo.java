import java.util.*;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Bob", "Alice");

        names.sort((a, b) -> b.compareTo(a));
        System.out.println("Sorted: " + names);
    }
}

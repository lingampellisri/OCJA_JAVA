package emp_app;

import java.util.*;

public class PersonApp {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", "Brown", 30));
        people.add(new Person("Bob", "Smith", 25));
        people.add(new Person("Charlie", "Smith", 25));
        people.add(new Person("David", "Brown", 30));
        people.add(new Person("Eve", "Anderson", 35));

        System.out.println("🔹 Original List:");
        people.forEach(System.out::println);

        // Sort by First Name
        people.sort((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
        System.out.println("\n🔸 Sorted by First Name:");
        people.forEach(System.out::println);

        // Sort by Last Name
        people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        System.out.println("\n🔸 Sorted by Last Name:");
        people.forEach(System.out::println);

        // Sort by Age
        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println("\n🔸 Sorted by Age:");
        people.forEach(System.out::println);

        // Sort by Age, then Last Name
        people.sort((p1, p2) -> {
            int result = Integer.compare(p1.getAge(), p2.getAge());
            if (result == 0) {
                result = p1.getLastName().compareTo(p2.getLastName());
            }
            return result;
        });
        System.out.println("\n🔸 Sorted by Age, then Last Name:");
        people.forEach(System.out::println);
    }
}

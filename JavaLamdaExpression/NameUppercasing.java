package JavaLamdaExpression;
import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Luffy", "Zoro", "Rohit", "Tiya", "Tarun");
        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        System.out.println("Employee Names in Uppercase:");
        upperNames.forEach(System.out::println);
    }
}
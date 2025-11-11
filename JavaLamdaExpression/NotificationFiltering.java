package JavaLamdaExpression;
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;
    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }
    public String toString() {
        return "[" + type + "] " + message;
    }
}
public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Emergency", "Patient in Room 1302 needs Oxygen Cyllinder."),
            new Alert("Normal", "Patient in Room 212 has scheduled Operation."),
            new Alert("Critical", "Some Suspicious Activity detected in Room 223."),
            new Alert("Info", "Cafeteria menu updated for the day.")
        );
        Predicate<Alert> emergencyOrCritical = a -> a.type.equalsIgnoreCase("Emergency") || a.type.equalsIgnoreCase("Critical");
        Predicate<Alert> infoOnly = a -> a.type.equalsIgnoreCase("Info");

        System.out.println("Emergency or Critical Alerts:");
        alerts.stream().filter(emergencyOrCritical).forEach(System.out::println);

        System.out.println("\nInformational Alerts:");
        alerts.stream().filter(infoOnly).forEach(System.out::println);
    }
}
package JavaLamdaExpression;
import java.util.*;

public class PatientID {
    public static void main(String[] args) {
        List<Integer> patientIDs = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Patient IDs:");
        patientIDs.forEach(System.out::println);
    }
}
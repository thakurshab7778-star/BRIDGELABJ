package JavaLamdaExpression;
import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice generated for Transaction ID: " + transactionId;
    }
}

public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("RYN001", "RYN002", "RYN003", "RYN004");
        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new)
                                               .collect(Collectors.toList());
        invoices.forEach(System.out::println);
    }
}
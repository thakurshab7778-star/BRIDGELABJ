package JavaStaticAndFinal;
class Patient {
    static String hospitalName = "Mittal Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Luffy", 21, "Heart Attack", 0001);
        Patient p2 = new Patient("Zoro", 20, "Blood loss", 0002);
        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();
    }
}
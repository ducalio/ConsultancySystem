class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// ---------------- CONSULTANT ----------------
class Consultant extends Person {
    String specialty;

    public Consultant(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void displayInfo() {
        System.out.println("Consultant Name: " + name +
                ", ID: " + id +
                ", Specialty: " + specialty);
    }
}

// ---------------- CLIENT ----------------
class Client extends Person {
    String company;

    public Client(String name, int id, String company) {
        super(name, id);
        this.company = company;
    }

    @Override
    public void displayInfo() {
        System.out.println("Client Name: " + name +
                ", ID: " + id +
                ", Company: " + company);
    }
}

// ---------------- PROJECT ----------------
class Project {
    String projectName;
    Consultant consultant;
    Client client;

    public Project(String projectName, Consultant consultant, Client client) {
        this.projectName = projectName;
        this.consultant = consultant;
        this.client = client;
    }

    public void showProjectDetails() {
        System.out.println("Project: " + projectName);
        System.out.println("Assigned Consultant: " + consultant.name);
        System.out.println("Client: " + client.name);
    }
}

// ---------------- MAIN CLASS ----------------
public class ConsultancySystem {

    public static void main(String[] args) {

        // Creating consultants
        Consultant c1 = new Consultant("Alice", 101, "Cybersecurity");
        Consultant c2 = new Consultant("Bob", 102, "AI & Machine Learning");

        // Creating clients
        Client cl1 = new Client("Tesla Ltd", 201, "Tesla");
        Client cl2 = new Client("Google Inc", 202, "Google");

        // Polymorphism example
        Person p1 = c1;
        Person p2 = cl1;

        System.out.println("--- Polymorphism Output ---");
        p1.displayInfo();
        p2.displayInfo();

        System.out.println("\n--- Projects ---");

        // Creating projects
        Project pA = new Project("Security Upgrade", c1, cl1);
        Project pB = new Project("AI Automation", c2, cl2);

        pA.showProjectDetails();
        System.out.println();
        pB.showProjectDetails();
    }
}
import java.util.LinkedList;

public class DemoEmploymentSimulator {
    public static void main(String[] args) {

        // Create linked list
        EmploymentSimulator theEmployees = new EmploymentSimulator();

        // Create person objects
        Person employee1 = new Person("Jeff");
        Person employee2 = new Person("Shakira");
        Person employee3 = new Person("Till");
        Person employee4 = new Person("Naruto");
        Person employee5 = new Person("The Protagonist");

        theEmployees.employ(employee1);
        theEmployees.employ(employee2);
        theEmployees.employ(employee3);
        theEmployees.employ(employee4);
        theEmployees.employ(employee5);

        // call methods on the employees list, remove one, then print employees
        theEmployees.companySize();
        theEmployees.printEmployees();
        theEmployees.printNextForTheChop();
        theEmployees.makeRedundant();
        theEmployees.companySize();
        theEmployees.printEmployees();
        theEmployees.printNextForTheChop();
    }
}

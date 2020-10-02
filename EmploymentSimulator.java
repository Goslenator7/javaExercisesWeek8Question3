import javax.swing.*;
import java.util.LinkedList;

public class EmploymentSimulator {

    // Create the linked list of Person objects
    private LinkedList<Person> employees = new LinkedList<Person>();

    // Add person to the employment queue
    public void employ(Person p) {
        this.employees.addLast(p);
    }

    // Remove the person at the back of the queue/ most recently added
    public void makeRedundant() {
        this.employees.removeLast();
    }

    // Print the name of the person who is at the back of the queue/ most recently added
    public void printNextForTheChop() {
        String nextMessage = "Next for the chop is: "+this.employees.peekLast().getEmployeeName()+".";
        JOptionPane.showMessageDialog(null, nextMessage, "To Be Let go", JOptionPane.INFORMATION_MESSAGE);
    }

    // Print the number of employees in the list
    public void companySize() {
        String sizeMessage = "The number of people currently employed is: "+this.employees.size()+".";
        JOptionPane.showMessageDialog(null, sizeMessage, "Number of employees", JOptionPane.INFORMATION_MESSAGE);
    }

    // Loop through the list of employees and print their names
    public void printEmployees() {
        for (Person tempPerson : employees) {
            tempPerson.displayDetails();
        }
    }

}

import javax.swing.*;

public class Person {

    private String employeeName;

    // Constructor
    public Person(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getters and setters
    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void displayDetails() {
        JOptionPane.showMessageDialog(null, this.employeeName, "Employees", JOptionPane.INFORMATION_MESSAGE);
    }
}

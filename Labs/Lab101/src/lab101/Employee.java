package lab101;

/**
 *
 * @author Ethan Hedrick
 * @version Jan 18, 2018
 * @info A class to handle all employees.
 */
public class Employee {

    private static int employeeCount = 0;
    private int id;
    private String name;
    /**
     * 
     * @param id the id of the employee.
     * @param name the name of the employee.
     */
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        employeeCount++;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    /**
     *
     * @return Returns a string interpretation of the class.
     */
    @Override
    public String toString() {
        return getClass().getName() + "@" + id + ":" + name;
    }

    /**
     *
     * @param object is the object being compared.
     * @return true if equal, false if not.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee e = (Employee) object;
        return (this.id == e.id) && (String.valueOf(this.name).equals(String.valueOf(e.name)));
    }

}

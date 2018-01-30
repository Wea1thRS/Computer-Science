package lab101;

/**
 *
 * @author Ethan Hedrick
 * @version Jan 18, 2018
 * @info A class to manage Salaried employees.
 */
public class Salaried extends Employee {

    private static int salariedCount = 0;
    private String title;
    private int salary;

    /**
     *
     * @param id the id of the Employee.
     * @param name the name of the Employee.
     * @param title the title of the Employee.
     * @param salary the salary of the Employee.
     */
    public Salaried(int id, String name, String title, int salary) {
        super(id, name);
        this.title = title;
        this.salary = salary;
        salariedCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalariedCount() {
        return salariedCount;
    }

    /**
     *
     * @return Returns a string interpretation of the class.
     */
    @Override
    public String toString() {
        return super.toString() + ":" + getClass().getName() + "@" + title + ":" + salary + ":" + salariedCount;
    }

    /**
     *
     * @param o is the object being compared.
     * @return true if equal, false if not.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Salaried)) {
            return false;
        }
        Salaried s = (Salaried) o;
        return super.equals(s) && String.valueOf(this.title).equals(String.valueOf(s.title)) && Math.abs(this.salary - s.salary) < 0.01;
    }
}

package lab101;

/**
 *
 * @author Ethan Hedrick
 * @version Jan 18, 2018
 * @info A class to manage Hourly employees.
 */
public class Hourly extends Employee {

    private static int hourlyCount = 0;
    private String position;
    private double hourlyRate;

    /**
     *
     * @param id the id of the Employee.
     * @param name the name of the Employee.
     * @param position the position of the Employee.
     * @param hourlyRate the hourly rate of the Employee.
     */
    public Hourly(int id, String name, String position, double hourlyRate) {
        super(id, name);
        this.position = position;
        this.hourlyRate = hourlyRate;
        hourlyCount++;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyCount() {
        return hourlyCount;
    }

    /**
     *
     * @return Returns a string interpretation of the class.
     */
    @Override
    public String toString() {
        return super.toString() + ":" + getClass().getName() + "@" + position + ":" + hourlyRate + ":" + hourlyCount;
    }

    /**
     *
     * @param o is the object being compared.
     * @return true if equal, false if not.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Hourly)) {
            return false;
        }
        Hourly h = (Hourly) o;
        
        return super.equals(h) && String.valueOf(this.position).equals(String.valueOf(h.position)) && (Math.abs(this.hourlyRate - h.hourlyRate) < 0.01);
    }
}

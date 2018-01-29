/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
/**
 *
 * @author Ethan
 */
public class Employee {
    String name;
    int ID;
    double salary;
    public Employee(String name, int ID, double salary) {
        if(name == null || "".equals(name.trim()))
                this.name = "No Name Given";
        else
            this.name = name;
         if(ID < 0)
            this.ID = 0;
        else if(ID >= 100000)
            this.ID = 99999;
        else
            this.ID = ID;
        if(salary < 20000)
            this.salary = 20000;
        else
            this.salary = salary;
    }
    public Employee() {
        this.name = "Joe Schmoe";
        this.ID = 12345;
        this.salary = 37000.00;
    }
    public String getName() {
        return this.name;
    }
    public int getID() {
        return this.ID;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setName(String name) {
        if(name == null || "".equals(name.trim()))
                this.name = "No Name Given";
        else
            this.name = name;
    }
    public void setID(int ID) {
        if(ID < 0)
            this.ID = 0;
        else if(ID >= 100000)
            this.ID = 99999;
        else
            this.ID = ID;
    }
    public void setSalary(double salary) {
        if(salary < 20000)
            this.salary = 20000;
        else
            this.salary = salary;
    }
}

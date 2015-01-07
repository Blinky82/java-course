/**
 * Created by blinky on 14.12.14.
 */
public class Employee {

    private double salary;
    private int hours;


    public Employee() {
        this.hours = 0;
        this.salary = 0.0;

        public Employee(int hours, double salary); {
            this.hours = hours;
            this.salary = salary;
        }
    }

    public String toString() {
        return " Working hours: " + getHours() + " and salary: "
                + getSalary();
    }

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}



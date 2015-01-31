/**
 * Created by blinky on 14.12.14.
 */
public class Policeman extends Employee {

    private String rank;

    public Policeman() {

        super();
        this.rank="";
    }
    public Policeman(String rank,int hours,double salary) {
        super(hours, salary);
        setRank(rank);
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank=rank;
    }
    public String toString() {
        return "Policeman with a rank: " +getRank()+ super.toString();
    }
}




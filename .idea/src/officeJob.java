import java.util.ArrayList;
import java.util.List;

public abstract class officeJob implements Job{
    protected double salary;
    protected String startShift;
    protected String endShift;
    protected List<Persn> workers;
    public double officeJob(double salary, String startShift, String endshift){

        public officeJob(double Salary, String startShift, String endShift ){
            this.salary = salary;
            this.startShift = startShift;
            this.endShift = endshift;
            this.workers = new ArrayList<>();

        }
        public double salary(){
            return salary;
        }
        public String startShift(){
            return startShift;
        }
        public String endShift(){
            return endShift;
    }
        public void hireperson Persn person;
        (person person){
            workers.add(person);
            System.out.println(person.getName() + "was hired");
        }

        public void firePerson (person person){
            workers.remove(person);
            System.out.println(person.getName());
        }
}

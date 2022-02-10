import java.util.ArrayList;

public class AdultPatient extends Person implements Diagnosable, Employable{
    ArrayList<String> previousJobs;
    double temperature;
    int systolic;
    int diastolic;

    @Override
    public ArrayList<String> getPreviousJobs() {
        // TODO Auto-generated method stub
        return this.previousJobs;
    }

    @Override
    public void addJob(String job) {
        // TODO Auto-generated method stub
      if(this.previousJobs == null){
          this.previousJobs = new ArrayList<>();
      }
      this.previousJobs.add(job);
    }

    @Override
    public double getTemperature() {
        return this.temperature;
    }

    @Override
    public int getSystolic() {
        return this.systolic;
    }

    @Override
    public int getDiastolic() {
        return this.diastolic;
    }

    @Override
    public void setTemperature(double t) {
        this.temperature = t;
    }

    @Override
    public void setSystolic(int s) {
        this.systolic = s;
    }

    @Override
    public void setDiastolic(int d) {
        this.diastolic = d;
    }
}
        /* TODO */
//Implement the class Adult Patient.
//An adult patient is a Person that is Diagnosable and that is Employable.
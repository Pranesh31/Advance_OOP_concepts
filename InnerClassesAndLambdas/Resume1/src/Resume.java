import java.util.ArrayList;
import java.util.List;

public class Resume {
    /* TODO
    Create a public member inner class Education according to the specifications.
    */
    public class Education {
        public String school;
        public String major;

        public Education(String school, String major) {
            this.school = school;
            this.major = major;
        }

        public void setSname(String school) {
            this.school = school;
        }

        public String getsName() {
            return this.school;
        }

        public void setMajor(String m) {
            this.major = m;
        }

        public String getMajor() {
            return this.major;
        }

        public String toString() {
            return this.major + " at " + this.school;
        }
    }

    /* TODO
    Create a public static inner class called Experience, according to the specifications.
    */
    public static class Experience {
        String job;
        int startYear;
        int toYear;

        public Experience(String title, int sYear, int eYear) {
            this.job = title;
            this.startYear = sYear;
            this.toYear = eYear;
        }

        public String toString() {
            return this.startYear + "-" + this.toYear + ":" + this.job;
        }
    }

    /* TODO
    Create the Person and List of Education and List of experience objects. They should be private.*/
    private Person p;
    private List<Education> eduList;
    private List<Experience> expList;

    public Resume(Person p) {
/* TODO
This constructor should initialize the person and do all necessary initializations for the other methods to work.*/
        this.p = p;
        eduList = new ArrayList<>();
        expList = new ArrayList<>();
    }

    public void addEducation(Education edu) {
        eduList.add(edu);
    }

    public void addExperience(Experience exp) {
        expList.add(exp);
    }

    /* TODO
    Create the addEducation, addExperience and override the toString methods as specified.
    */
    public String toString() {
        String str = p.toString() + "\n";
        str +=  "Experience" + "\n";
        for(Experience e : expList)
            str+= e;
        str += "\n" + "Education" + "\n";
        for(Education e : eduList)
            str+= e;
        return str;

    }
}

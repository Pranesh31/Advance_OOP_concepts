import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
/* TODO
Same two inner classes and member variables as in task 3.*/
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
Create a member variable of type Person (exactly as in task 2)*/
    private Person p;

    /* TODO
    Create a List to hold values of type Education (exactly as in task 2)*/
    private List<Education> eduList;

    /* TODO
    Create a Priority Queue that holds values of type Experience.*/
    private PriorityQueue<Experience> queue;

    public Resume(Person p){
/* TODO
Same initialization of Person and the List of Education objects*/
        /* TODO
Assign a value to the Person variable.*/
        this.p = p;
/* TODO
Initialize the List with Education objects.*/
        eduList = new ArrayList<>();
        queue = new PriorityQueue<>((a,b) -> b.toYear - a.toYear );
    }
 /* TODO
Initialize the priority queue in one line, without importing the Comparator interface.*/

/* TODO
The getter for experience and the methods to add education and experience objects stay the same, as well as the toString()*/
/* TODO
Add a standard getter for the experiences. getExperience. it should return a priority queue.*/
        public PriorityQueue getExperience(){
            return queue;
        }

/* TODO
Implement the addEducation, addExperience and override the toString() methods exactly as you did in task 2 (Copy->Paste)*/
        public void addEducation(Education edu) {
            eduList.add(edu);
        }

        public void addExperience(Experience exp) {
            queue.add(exp);
        }

        public String toString() {
            String str = p.toString();
            str += "\n" + "Experience" + "\n";
            for(Experience exp : queue) {
                str += exp;
            }
            str += "\n" + "Education" + "\n";
            for(Education exp : eduList) {
                str += exp;
            }
            return str;
        }

}

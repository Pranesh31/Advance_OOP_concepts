/* TODO */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
//The imports will self populate. You don't have to do anything.

public class Resume {
/* TODO
Copy the two inner classes of Resume exactly as they were in Task 2. Copy->paste.*/
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
Assign a value to the Person variable.*/
        this.p = p;
/* TODO
Initialize the List with Education objects.*/
        eduList = new ArrayList<>();
/* TODO
Initialize the priority queue with a comparator defined in an anonymous inner class. Check the specs for the comparator.*/
        queue = new PriorityQueue<>(new Comparator<Experience>(){
            public int compare(Experience from, Experience end){
                int result = end.toYear - from.startYear;
                return result;
            }
        });
    }

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
        String str = p.toString() + "\n";
        str += "Experience" + "\n";
        for(Experience e : queue)
            str+= e;
        str += "\n" + "Education" + "\n";
        for(Education e : eduList)
            str+= e;
        return str;

    }


}

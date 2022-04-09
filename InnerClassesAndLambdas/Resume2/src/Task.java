public class Task {
    public static void main(String[] args){
/* TODO
Copy the Task from task 2 here and add experiences where the end years are not in order. Watch it print the resume with the dates in order from most recent to least.*/
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        /* TODO
Create an education object. Schoo is NEIU, major is Computer Science. */
        Resume.Education edu = r.new Education("NEIU","Computer Science");
       /* TODO
add this education object to the resume "r" */
        r.addEducation(edu);
        /* TODO
Create a new Experience object and add it to the resume.*/
        Resume.Experience exp = new Resume.Experience("trainee", 2005, 2006);
        r.addExperience(exp);/* TODO
Create a new experience object on the fly, inside the addExperiece call.*/
        r.addExperience(new Resume.Experience("Data Analyst", 2007, 2011));
        r.addExperience(new Resume.Experience("Sr.Data Analyst", 2012, 2022));/* TODO
Add another experience object on the fly as you add it*/
        System.out.println(r); //watch the resume print.


    }
}
/* TODO
Copy the Person class from Task 2 here. Copy->Paste */

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthdate;

    private class Position{
        String name;
        double salary;

        Position(String name,double sal){
            this.name = name;
            this.salary = sal;
        }

        public String toString(){

            return name+":"+salary;
        }
    }

    private Position position;

    public Person(String name, String dob){
        this.name = name;
        this.birthdate = LocalDate.parse(dob);
    }

    public int getAge(){
        LocalDate todayDate = LocalDate.now();
        Period age = (Period.between(this.birthdate,todayDate));
        int result = age.getYears();
        return result;
    }


    public void setPosition(String name, double salary){
        this.position = new Position(name, salary);
    }

    public Position getPosition(){

        return this.position;
    }

    public String toString(){

        return name+"-"+getAge()+":"+this.position;
    }
}
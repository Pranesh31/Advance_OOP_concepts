import java.util.ArrayList;
import java.util.List;

public class Task {
/* TODO
Create a public static inner class called Triplet with generics for a first, second and third element. All variables should be publec.
*/
    public static class Triplet<A,B,C>{
        public A a;
        public B b;
        public C c;

        public Triplet(A a, B b, C c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
}
    public static String result;
    public static void main(String[] args){
        Calculator c = new Calculator();
        List<Triplet<Double,Double,String>> t = new ArrayList<>();
        t.add(new Triplet<>(3.4,5.2,"+"));
        t.add(new Triplet<>(2.3,1.23,"-"));


/* TODO
Add the code to add a multiplication of 4.5 x 5.4, a division by zero, and divide 56.0/28.0
*/
        t.add(new Triplet<>(4.5,5.4,"*"));
        t.add(new Triplet<>(3.1,0.0,"/"));
        t.add(new Triplet<>(56.0,28.0,"/"));
        /* TODO
Utilizing a lambda expression, use the calculator to compute the operation specified in each Triplet with the corresponding numbers.*/
        t.forEach(cal -> result += "\n" + c.compute(cal.a,cal.b,cal.c));
        System.out.println(result);
    }
}
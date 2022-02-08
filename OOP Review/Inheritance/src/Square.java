/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/
public class Square extends Shape{
    double size;

    public Square (double size, String name){
        super(name);
        this.size = size;

    }
    @Override
    public double getArea(){
        double a = this.size * this.size;
        return a;
    }
    @Override
    public double getPerimeter(){
        double p = 4*this.size;
        return p;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null ) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        Square otherObj = (Square)obj;
        if(this.size == otherObj.size && (this.name.equals(otherObj.name))){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        String s = this.name + ":" + this.size;
        return s;
    }

}
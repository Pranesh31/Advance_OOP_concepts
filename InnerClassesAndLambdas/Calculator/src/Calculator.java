public class Calculator {
    public DoMath toOperation(String op){
        DoMath res;
        switch (op) {
            case "+": res= (x1,x2) -> x1 + x2; /* TODO
Use a lambda expression to set "res" to the correct function.*/
                break;
            case "-": res = (x1,x2) -> x1-x2;/* TODO
Use a lambda expression to set "res" to the correct function.*/
                break;
            case "*": res = (x1,x2) ->x1*x2;/* TODO
Use a lambda expression to set "res" to the correct function.*/
                break;
            case "/": res = (x1,x2) -> x2 ==0.0?Double.POSITIVE_INFINITY:x1/x2;/* TODO
            Use a lambda expression to set "res" to the correct function. You must account for divisions by zero as specified in the instructions.*/
                break;
            default:res = (x1, x2) -> Double.MIN_VALUE;
          /* TODO
In the default value, the res function should return the minimun possible value.*/
        }
        return res;
    }

    public Double compute(Double n1, Double n2, String op){
      /* TODO
set calc to the correct function calling the method above.*/
      DoMath calc =  toOperation(op);
        /*TODO
return the result of calc.compute with the numbers given.*/
        return calc.compute(n1,n2);
    }
}

import factorial.FactorialForLoop;
import factorial.FactorialWhileLoop;
import fibonacci.FibonacciForLoop;

public class Main {
    public static void main(String[] args) {


        FactorialForLoop f = new FactorialForLoop();

        f.factorialFor((6));
        f.factorialWhile(8);

        FibonacciForLoop fb = new FibonacciForLoop();

        fb.fibonacciFor(7);
        fb.fibonacciWhile(9);

    }


}
package fibonacci;

import factorial.FactorialForLoop;
import factorial.FactorialWhileLoop;

public class FibonacciForLoop extends FibonacciWhileLoop {

    public void fibonacciFor(int x) {
        if (x == 1 || x == 2) {
            System.out.println(1);
        } else {
            int firstNumber = 0;
            int secondNumber = 1;
            int sum = 0;

            for (int i = 2; i <= x; i++) {
                System.out.print(firstNumber + " ");
                sum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sum;
            }

            System.out.println("Element number " + x + " is: " + sum);
        }
    }
}

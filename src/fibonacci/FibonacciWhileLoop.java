package fibonacci;

import factorial.FactorialForLoop;
import factorial.FactorialWhileLoop;

public class FibonacciWhileLoop {

public void fibonacciWhile(int x){
    if (x == 1 || x == 2) {
        System.out.println(1);
    } else {
    int firstNumber=0;
    int secondNumber=1;
    int sum = 0;
    int i = 2;
    while(i<=x){
        sum = firstNumber + secondNumber;
        firstNumber=secondNumber;
        secondNumber=sum;
        i++;
    }

    System.out.println("Element is: " + sum);}
}
}

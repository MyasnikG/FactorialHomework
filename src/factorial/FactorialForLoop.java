package factorial;

public class FactorialForLoop extends FactorialWhileLoop{

    public int factorialFor(int x){
        if(x==1){
            return 1;
        } else {
            int factorial = 1;
            for (int i = 1; i <= x; ++i) {
                factorial *= i;
            }
            return factorial;
        }

    }
}

package factorial;

public class FactorialWhileLoop {

    public int factorialWhile(int x) {
        if (x == 1) {
            return 1;
        } else {
            int factorial = 1;
            int count = 1;
            while (count <= x) {
                factorial *= count;
                count++;
            }

            return factorial;
        }
    }
}

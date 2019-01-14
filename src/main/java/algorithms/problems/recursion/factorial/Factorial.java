package algorithms.problems.recursion.factorial;

public class Factorial {


    public int factorial (int value) {
        if (value <= 1) {
            return 1;
        }

        return value * factorial(value - 1);
    }

    public int tailFactorial(int value) {

        return tailFactorial(value, 1);
    }

    private int tailFactorial (int value, int accumulator) {
        System.out.println(accumulator);
        if (value == 0) {
            return accumulator;
        }

        return tailFactorial(value - 1, accumulator * value);
    }
}

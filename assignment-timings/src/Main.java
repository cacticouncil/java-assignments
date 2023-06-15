//-------------------------------------------------------------------
// DO NOT MAKE ANY CHANGES TO THIS FILE
//
// If this file is not compiling, it is because of code you are
//  missing in your project (necessary classes or methods) which must
//  be named exactly correct for this class to compile.
//
// There are no bugs in this file. If an exception occurs, it is
//  because of something in one of your other classes.
//
// Any changes you make to this class will not be used for grading.
//-------------------------------------------------------------------
import java.util.function.Function;

public class Main
{
    public static void main(String[] args)
    {
        printHeader("fibRecursive");
        for (int n=31; n<=40; n++)
            timeMethod(Sequencer::fibRecursive, n);

        printHeader("fibIterative");
        for (int n=31; n<=40; n++)
            timeMethod(Sequencer::fibIterative, n);

        printHeader("sumIterative");
        for (int n=1; n<=1000000000; n*=10)
            timeMethod(Sequencer::sumIterative, n);

        printHeader("sumGauss");
        for (int n=1; n<=1000000000; n*=10)
            timeMethod(Sequencer::sumGauss, n);
    }

    private static void printHeader(String method)
    {
        System.out.println("-----------------------------");
        System.out.println("Method: " + method);
        System.out.println(String.format("%20s %20s %20s", "Input", "Result", "Timing"));
    }

    private static void timeMethod(Function<Integer, Long> func, int n)
    {
        long result, begin, end;
        double delta;
        String message;

        begin = System.nanoTime();
        result = func.apply(n);
        end = System.nanoTime();
        delta = (end - begin) / 1e6;

        message = String.format("%20d %20d %20.3f(ms)", n, result, delta);
        System.out.println(message);
    }
}

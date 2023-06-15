//-------------------------------------------------------------------
// DO NOT MAKE ANY CHANGES TO THIS CLASS
//
// If this class is not compiling, it is because of code you are
//  missing in your project (necessary classes or methods) which must
//  be named exactly correct for this class to compile.
//
// There are no bugs in this file. If an exception occurs, it is
//  because of something in one of your other classes.
//
// Any changes you make to this class will not be used for grading.
//-------------------------------------------------------------------

public class Main
{
    private static final String DefInput = "8 / 4 + 2";

    public static void main(String[] args)
    {
        String infix = DefInput;
        if (args != null && args.length > 0)
            infix = args[0];

        String postfix = PostfixCalculator.infix2postfix(infix);
        double result = PostfixCalculator.solve(postfix);
        System.out.println("Answer: " + result);
    }
}

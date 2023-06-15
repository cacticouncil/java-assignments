import java.util.Random;

//-----------------------------------------------------------------------------
// DO NOT MAKE ANY CHANGES TO THIS CLASS
//
// Any changes you make to this class will not be used for grading.
//-----------------------------------------------------------------------------

public class Main
{
    public static void main(String[] args)
    {
        Random prng = new Random();
        int min, max;

        // random bounds by default
        min = prng.nextInt(50);
        max = prng.nextInt(50) + 50;

        // override with command line args
        if (args.length >= 2)
        {
            try
            {
                min = Integer.parseInt(args[0]);
                max = Integer.parseInt(args[1]);
            }
            catch (Exception e)
            {
                System.err.println("Command line arguments threw an exception!");
                System.exit(1);
            }
        }

        // create object
        Sequence seq = new Sequence(min, max);

        // use class
        System.out.println("Sequence bounds:");
        System.out.println(min + ", " + max);
        System.out.println("Sequence listed:");
        printArray(seq.list());
        System.out.println("Sequence backwards:");
        printArray(seq.backwards());
        System.out.println("Sequence evens:");
        printArray(seq.evens());
        System.out.println("Sequence squares:");
        printArray(seq.squares());
        System.out.println("Sequence summation:");
        System.out.println(seq.summation());
    }

    public static void printArray(int[] stuff)
    {
        for (int x : stuff)
            System.out.print(x + ", ");
        System.out.println();
    }
}

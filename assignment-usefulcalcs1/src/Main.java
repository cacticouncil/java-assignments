import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String buffer;

        // TODO: F to C conversion
        //  Ask user for temp in F. Read it in. Convert to C. Display output.
        System.out.println("Let's convert temperature!");
        System.out.print("What's the temperature in Fahrenheit? ");

        // TODO: compute height of building
        //  Assume 20ft away. Ask how tall. Ask for angle of elevation.
        //  Compute height of building using Math.tan(). Display output.
        System.out.println("Let's roughly compute the height of a building.");
        System.out.println("Assume you are standing 20ft away.");
        System.out.print("How tall are you (ft)? ");

        // TODO: compute probability of coveted loot.
        //  Ask for drop rate as percentage. Convert to fraction (divide by 100).
        //  Ask how many runs. Compute probability w/ formula provided.
        System.out.println("Let's compute probability of dropped loot.");
        System.out.print("What is the drop rate (%) of the loot you want? ");
    }
}

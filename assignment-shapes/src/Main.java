import java.util.Scanner;

public class Main
{
    private static Scanner Reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("How many shapes do you want? ");
        int count = Integer.valueOf(Reader.nextLine());

        Shape[] shapes = new Shape[count];

        // call procedure fillShapes() passing the array of shapes
        // call procedure printShapes() passing the array of shapes
        // call function printMenu()

        while (true)
        {
            // ask the user for their menu selection
            // read user menu selection input
            // if menu selection is 3, then break out of this while loop

            // ask the user which shape index they are interested in
            // read user input for shape selection

            // switch on user menu selection
            //   case 1
            //      call the selected shape's area() function
            //      print out the area
            //   case 2
            //      call the selected shape's perimeter function
            //      print out the perimeter
        }
    }

    private static void fillShapes(Shape[] stuff)
    {
        // iterate through the array of shapes passed in with a definite loop
        //
        //    ask the user if this shape should be a circle
        //    read their response
        //
        //    if they want a circle
        //       ask and read in x, y, and radius values
        //       create an instance of a Circle obj and store it in the shape array passed in
        //    else
        //       ask and read in x, y, width and height values
        //       create an instance of a Rectangle obj and store it in the shape array passed in
    }

    private static void printShapes(Shape[] stuff)
    {
        System.out.println("\n--------------------");

        // iterate through the array of shapes passed in with a definite loop
        //    print each index and shape all on one line
    }

    private static void printMenu()
    {
        System.out.println("--------------------");
        System.out.println("1) Area");
        System.out.println("2) Perimeter");
        System.out.println("3) EXIT");
        System.out.println("--------------------");
    }
}